def call(Map config){
    def name = config.name
    def environment = config.environment

    echo "Hello ${name}! You are working in ${environment} environment."
}