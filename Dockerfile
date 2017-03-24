FROM tomcat:7-jre8
MAINTAINER Salzburg Research <nimble-srfg@salzburgresearch.at>

ARG DB_HOST
ARG DB_PORT
ARG DB_USER
ARG DB_PASS

# setup tomcat
ADD ./docker/tomcat-users.xml /usr/local/tomcat/conf/

# copy application data
COPY ./docker/marmotta.xml /usr/local/tomcat/conf/Catalina/localhost/
COPY ./webapp/target/catalog-service.war /usr/share/marmotta/marmotta.war

# Marmotta configuration
ENV CONF_PATH /var/lib/marmotta/system-config.properties
RUN mkdir -p "$(dirname $CONF_PATH)"
RUN echo "security.enabled = false" > $CONF_PATH
RUN echo "database.type = postgres" >> $CONF_PATH
RUN echo "database.url = jdbc:postgresql://$DB_HOST:$DB_PORT/marmotta?prepareThreshold=3" >> $CONF_PATH
RUN echo "database.user = $DB_USER" >> $CONF_PATH
RUN echo "database.password = $DB_PASS" >> $CONF_PATH