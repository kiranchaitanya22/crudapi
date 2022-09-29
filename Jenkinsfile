pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withMaven(maven : 'mvn3')
                sh 'mvn clean compile install'
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'mvn3')
                sh 'mvn test'
            }
        }
    }
}
