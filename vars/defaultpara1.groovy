def call(Map config) {

    def environment = config.environment ?: 'DEV'

    echo "Deploying to ${environment}"
}