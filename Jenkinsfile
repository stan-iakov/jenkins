pipeline {

  environment{
    REGISTRY = 'jondow/first-jenkins-app'
    VERSION = '0.1'
  }

  agent {
    kubernetes {
      defaultContainer 'jnlp'
      yamlFile 'build.yaml'
    }
  }

}