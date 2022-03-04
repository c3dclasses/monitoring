def buildApp() {
  echo "builing the application"
  echo "test the application..... ${BRANCH_NAME}"
}

def initApp() {
   echo "init the application....."
}

def testApp() {
  echo "builing the application"
}

def deployApp() {
  echo "builing the application"
  echo "deploying version ${params.VERSION}"
}
