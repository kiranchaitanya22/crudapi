pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}