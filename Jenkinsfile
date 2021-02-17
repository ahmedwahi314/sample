pipeline {
    agent any

    stages {
        stage('SCM Chekout'){
            steps{
                git 'https://github.com/SEETHAMRAJU/calculator.git'
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

    }
}
