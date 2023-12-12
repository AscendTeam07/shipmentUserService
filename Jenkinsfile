pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'shipmentuserservice'
        MAVEN_HOME = tool 'Maven'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    def mvnHome = tool 'Maven'
                    def mavenCmd = "${mvnHome}/bin/mvn"
                    sh "${mavenCmd} clean install"
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    def dockerImage = docker.build(env.DOCKER_IMAGE_NAME, "--file Dockerfile .")
                }
            }
        }
        stage('Push to Registry') {
            steps {
                script {
                    docker.withRegistry('https://hub.docker.com/u/nagendraranga', 'team07') {
                        dockerImage.push()
                    }
                }
            }
        }
    }
    post {
        success {
            echo 'Build and image creation successful!'
        }
        failure {
            echo 'Build or image creation failed!'
        }
    }
}