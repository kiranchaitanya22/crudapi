pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withMaven(maven : 'mvn3'){
                    sh 'mvn clean compile install'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'mvn3'){
                    sh 'mvn test'
                }
            }
        }
        stage("Staging") { 
            steps {
                withMaven(maven : 'mvn3'){
                    sh "sudo mvn spring-boot:run" 
                }        
            }
        }
    }
}
