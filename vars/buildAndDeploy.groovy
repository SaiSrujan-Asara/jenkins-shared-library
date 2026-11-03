def call(Map config = [:]) {

    echo "Starting CI/CD pipeline..."

    buildApp()

    testApp()

    deployApp(
        environment: config.environment
    )

    echo "CI/CD pipeline completed!"
}