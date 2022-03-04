//CODE_CHANGE = getGITChanges()
// localhost:8080//
pipeline {
    agent any
   // environment {
   //     NEW_VERSION = '1.3.0'
   //     SERVER_CREDENTIALS = credential("server-credentials")
   // }
    parameters {
        //string(name: "VERSION", defaultValue: "", description: 'version to deploy on prod")
        choice(name: "VERSION", choices: ['1.1.0', '1.2.0', '1.3.0'], description: "")
        booleanParam(name: "executeTests", defaultValue: true, description: "")
               
    }
    stages {
        stage("init") {
            steps {
              echo "init the application....."
            }
        }
        stage("build") {
           //  when {
           //     expression {
           //         BRANCH_NAME == "dev" && CODE_CHANGES == true 
           //     }
           // }
            
            steps {
                echo "build the application....."
                echo "building version:${NEW_VERSION}
            }
        }
        stage("test") {
            //when {
            //    expression {
            //        BRANCH_NAME == "dev" || BRANCH_NAME == "master" && params.executeTests 
            //    }
            //}
            steps {
                echo "test the application..... ${BRANCH_NAME}"
            }
        }
        stage("deploy") {
            steps {
                echo "deploy the application....."
                //echo "Use credentails for the server: ${SERVER_CREDENTIALS}"
                //withCredential([ 
                //    usernamePassword(credentials:"server-credentials", usernameVariable: USER, passwordVariable: PWD)
                //]) {
                //    sh "some script: ${USER}, ${PWD}"
                //}
                echo "deploying version ${params.VERSION}"
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
