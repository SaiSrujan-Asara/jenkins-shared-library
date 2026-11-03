def call() {

    withCredentials([string(credentialsId: 'demo-token',variable: 'MY_SECRET')]) {

        echo "Credential successfully loaded ${MY_SECRET}"

        sh 'echo "Using secret for authentication"'

    }
}