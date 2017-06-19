#!/usr/bin/env bash

if [ "$1" == "run" ]; then
    # build maven project
    mvn clean install -DskipTests

    # run docker compose
    docker-compose up --build

elif [ "$1" == "bx-deploy" ]; then

    # create local docker image
    docker build -t nimbleplatform/marmotta-backend --build-arg DB_HOST=marmotta-db --build-arg DB_PORT=5432 --build-arg DB_USER=root --build-arg DB_PASS=changeme .

    # push to docker hub
    echo "Pushing new image to Docker Hub"
    docker push nimbleplatform/marmotta-backend

    # create volume for settings (optional)
    # bx ic volume-create marmotta-settings

    # add to Bluemix container registry
    echo "Copying image to Blue mix"
    bx ic cpi nimbleplatform/marmotta-backend registry.eu-gb.bluemix.net/semantic_mediator_container/marmotta-backend

    # run postgres container
#    bx ic run --name marmotta-db -e "POSTGRES_PASSWORD=changeme" -e "POSTGRES_USER=root" -e "POSTGRES_DB=marmotta" -p 5432:5432  -m 256 registry.eu-gb.bluemix.net/semantic_mediator_container/postgre

    # run marmotta
    bx ic run --name marmotta-backend \
        -v /var/lib/marmotta \
        --link marmotta-db:marmotta-db \
        -p 8080:8080 \
        -v marmotta-settings:/var/lib/marmotta \
        -m 2048 registry.eu-gb.bluemix.net/semantic_mediator_container/marmotta-backend

fi