node ('nimble-jenkins-slave') {
    def app
    stage('Clone & Build') {
            slackSend 'Started build no. ${env.BUILD_ID} of ${env.JOB_NAME}'
            git(url: 'https://github.com/bienstock/catalog-service-backend.git', branch: 'master')
            sh 'git submodule init'
            sh 'git submodule update'
            withMaven(maven: 'M339') {
              sh 'mvn  install -DskipTests=true'
            }
    }
    stage ('Docker Build') {
        app = docker.build("pashok2398/catalog-service-backend")
    }
    stage ('Docker Push')  {
      docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}
