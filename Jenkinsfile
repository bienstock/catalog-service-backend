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
            sh 'sleep 1000'
            withMaven(maven: 'M339') {
              sh 'mvn clean install'
            }
            
            
          },
          "Slack message": {
            slackSend 'Started Nimble-Jenkins build ${env.BUILD_ID} of ${env.JOB_NAME}'
            
          }
        )
      }
    }
  }
}
