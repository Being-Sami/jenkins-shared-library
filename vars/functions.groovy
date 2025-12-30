@Library('github-shared-lib-jenkins') _

pipeline {
    agent any

    stages {
        stage('Demo') {
            steps {
                hello()
                hello2("Shubham")
                customLog("Starting Build Pipeline")
            }
        }
    }
}
