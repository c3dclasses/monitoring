//CODE_CHANGE = getGITChanges()
// localhost:8080//

def gv

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
                script {
                    gv = load "script.groovy"
                    gv.initApp()
                }
                
            }
        }
        stage("build") {
           //  when {
           //     expression {
           //         BRANCH_NAME == "dev" && CODE_CHANGES == true 
           //     }
           // }
            
            steps {
                
                //echo "building version:${NEW_VERSION}
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            //when {
            //    expression {
            //        BRANCH_NAME == "dev" || BRANCH_NAME == "master" && params.executeTests 
            //    }
            //}
            steps {
                
                 script {
                    gv.testApp()
                }
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
                
                script {
                    gv.deployApp()
                }
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
