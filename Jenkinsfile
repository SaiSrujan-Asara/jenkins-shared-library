@Library('my-shared-library') _

pipeline {
    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'QA', 'PROD'],
            description: 'Select deployment environment'
        )
    }

    stages {
        stage('Welcome') {
            steps {
                echo "=====================1=================="
                hello1(name: "rich1")
                echo "=====================2=================="
                hello1(name: "rich2", environment: "ultra-rich")
                echo "=====================3=================="
                hello1(name: "rich3", environment: "ultra-rich3", region: "hyd")
                echo "=====================class=================="
                hello_class(name: "rich_class")
                
            }
        }
        stage("deploy"){
            steps{
                echo "-----MANUAL PASS-------------"
                deployapp(environment: 'DEV')
                echo "-------PARAMETER PASS-----------"
                deployapp(environment: params.ENVIRONMENT)
                
            }
        }
        stage("default parameters"){
            steps{
                echo "---------PASS PARAMETER--------"
                defaultpara1(environment: "RICH")
                echo "--------PASS NO PARAMETRES--------"
                defaultpara2()
                echo "--------PASS AND VALIDATE----------"
                defaultpara3(environment: "DEV")
            }
        }
        stage('Build') {
            steps {
                script {
                    def result = returnfunc()

                    echo "Build Result: ${result}"
                }
            }
        }
        stage('Build Information') {
          steps {
            printBuildInfo()
          }
        }
        stage('Credentials Demo') {
          steps {
            useCredentials()
          }
        }
        stage('Shell commands') {
            steps {
                shellcmd()
            }
        }
        stage('TRY-CATCH') {
            steps {
                trycatche()
            }
        }
        stage('Build and Deploy') {
            steps {
                echo "--------CALLING-FUNCTION-CALLING---------"
                buildAndDeploy(environment: params.ENVIRONMENT)
            }
        }
    }
}
