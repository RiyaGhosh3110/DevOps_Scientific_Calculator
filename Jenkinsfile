pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/ParijatMoulik/Scientific_Calculator.git'
                sh './mvnw clean compile'
            }
        }
    }
}

