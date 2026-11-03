def call(Map config) {

    def environment = config.environment

    if (environment == 'DEV') {

        echo "Deploying application to DEV"

    } else if (environment == 'QA') {

        echo "Deploying application to QA"

    } else if (environment == 'PROD') {

        echo "Deploying application to PROD"

    } else {

        error "Invalid environment: ${environment}"
    }
}