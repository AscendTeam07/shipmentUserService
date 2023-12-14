pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'nagendraranga/shipmentuserservice'
        DOCKERHUB_CREDENTIALS = credentials('dockerhub')
        MAVEN_HOME = tool 'MavenTeam7'
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
                    def mvnHome = tool 'MavenTeam7'
                    def mavenCmd = "${mvnHome}/bin/mvn"
                    bat "${mavenCmd} clean install"
                }
            }
        }

    //     stage('Docker Build') {
    //         steps {
    //            bat 'docker build -t nagendraranga/shipmentuserservice .'
    //         }
    //     }
    //     stage('Login') {
    //         steps {
    //             bat 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
    //         }
    //     }
    //     stage('Push to Registry') {
    //         steps {
    //             // script {
    //             //     docker.withRegistry('https://hub.docker.com/u/nagendraranga', 'team07') {
    //             //         dockerImage.push()
    //             //     }
    //             // }
    //             bat 'docker push nagendraranga/shipmentuserservice'
    //         }
    //     }
    // }
    post {
        success {
            echo 'Build and image creation successful!'
        }
        failure {
            echo 'Build or image creation failed!'
        }
    }
}