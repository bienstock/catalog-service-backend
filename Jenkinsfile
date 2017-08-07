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
            git(url: 'https://github.com/repo.git', branch: 'master')
            sh 'git submodule init'
            sh 'git submodule update'
            withMaven(maven: 'M339') {
              sh 'mvn  install -DskipTests=true'
            }
            
            
          },
          "Slack message": {
            slackSend 'Started build no. ${BUILD_ID} of ${JOB_NAME}'
            
          }
        )
      }
    }
  }
}