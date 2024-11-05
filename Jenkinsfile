pipeline {
  tools {
    maven "M3"
  }
  agent any
  stages {
    stage("Build") {
      steps {
        sh 'mvn clean compile'
      }
    }
    stage("Test") {
      steps {
        sh "mvn -Dmaven.compile.skip test"
      }
    }
    stage("Package") {
      steps {
        sh "mvn -Dmaven.test.skip -Dmaven.compile.skip package"
      }
    }
  }
}
