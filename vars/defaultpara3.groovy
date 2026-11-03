def call(Map config = [:]) {

    def environment = config.environment ?: 'DEV'

    def validEnvironments = ['DEV', 'QA', 'PROD']

    if (!validEnvironments.contains(environment)) {
        error "Invalid environment: ${environment}. Allowed: ${validEnvironments}"
    }

    echo "Deploying application to ${environment}"
}