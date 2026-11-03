def call(Map config){
    def name = config.name
    def environment = config.environment
    def region = config.region

    echo "Hello ${name}! You are working in ${environment} environment. ${region}"
}