def call(Map config = [:]) {

    echo "Starting CI/CD pipeline..."

    buildapp()

    testapp()

    deployapp(
        environment: config.environment
    )

    echo "CI/CD pipeline completed!"
}