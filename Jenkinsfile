pipeline {

  environment{
    REGISTRY = 'jondow/first-jenkins-app'
    VERSION = '0.1'
  }

  agent {
    kubernetes {
      yamlFile 'build.yaml'
    }
  }

  stages {
    stage('execute'){
      steps{
        sh "echo stan"
      }
    }

  }

}