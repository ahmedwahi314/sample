pipeline {
    environment{
        registry = "ahmedwahi314/myrepo"
        registryCredential = 'mydocker'
        dockerImage = ''
    }
    agent any
// Stages
    stages {
        stage('SCM Checkout'){
            steps{
                git 'https://github.com/ahmedwahi314/sample.git'
            }
        }
        stage('Clean'){
            steps{
                sh 'mvn clean'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn install'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"

                }
            }
        }
        stage('Deploy/Push Docker Image to hub'){
               steps{
                    script{
                        docker.withRegistry('',registryCredential){
                            dockerImage.push()
                        }
                    }
               }
        }
        stage('Remove docker images that we dont need'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
                sh "docker image prune"
            }
        }

    }
}
