pipeline {
  environment {
  	registry = "joek2001/salesapp"
	registryCredentials = "dockerhub_id"
	dockerImage = ""
  }
  agent any
  stages {
  	stage("Docker Image Build") {
		steps {
			script {
				dockerImage = docker.build(registry)
			}
		}
	}
	stage("Push to docker hub") {
		steps {
			script {
				docker.withRegistry('', registryCredentials) {
					dockerImage.push("${env.BUILD_NUMBER}")
					dockerImage.push("latest-salesapp")
					}
				}
			}
		}
	}
	stage("Clean up") {
		steps {
			script {
				sh 'docker image prune --all --force --filer "until=48h"'
			}
		}
	}
}
