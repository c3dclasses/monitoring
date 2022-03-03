pipeline {
    agent any
    
    stages {
        stage("init") {
            steps {
              echo "init the application....."
            }
        }
        stage("build") {
            steps {
              echo "build the application....."
            }
        }
        stage("test") {
            steps {
              echo "test the application....."
            }
        }
        stage("deploy") {
            steps {
              echo "deploy the application....."
            }
        }
    } 
    post {
        always {
            echo "sending emails out...."
        }
        success {
            echo "success........"
        }
        failure {
            echo "failure............"
        }
    }
}
