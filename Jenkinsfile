pipeline {
    agent any
    stages {
        stage('Step 1 Git') {
            steps {
                git 'https://github.com/ParijatMoulik/Scientific_Calculator.git'
                //sh './mvnw clean compile'
            }
        }
         stage('Step 2 Maven') {
                    steps {
                        //git 'https://github.com/ParijatMoulik/Scientific_Calculator.git'
                        sh 'mvn clean compile'
                    }
           }
    }
}

