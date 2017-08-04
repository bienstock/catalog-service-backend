pipeline {
  agent {
    node {
      label 'nimble-jenkins-slave'
    }
    
  }
  stages {
    stage('Clone & Build') {
      steps {
        parallel(
          "Clone & Build": {
            git(url: 'https://github.com/bienstock/catalog-service-backend.git', branch: 'master')
            sh 'git submodule init'
            sh 'git submodule update'
            withMaven(maven: 'M339') {
              sh 'mvn  install -DskipTests=true'
            }
            
            
          },
          "Slack message": {
            slackSend 'Started Nimble-Jenkins build ${env.BUILD_ID} of ${env.JOB_NAME}'
            
          }
        )
      }
    }
    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */
      steps {
        parallel(
          "Build image": {
        deff app = docker.build("pashok2398/catalog-service-backend")
        app.push("${env.BUILD_NUMBER}")
        app.push("latest")
        }
       )
      }
      }
    }
  }
}
