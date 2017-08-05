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
    stage('Docker') {
      steps {
        node(label: 'nimble-jenkins-slave') {
        withDockerRegistry([credentialsId: 'docker-hub-credentials', url: 'https://registry.hub.docker.com']) {
                    def app = docker.build("pashok2398/nimble",'.')
                    app.push()
          }
        }
      }
    }
  }
}
