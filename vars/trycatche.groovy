def call() {

    try {

        echo "Starting application build..."

        sh 'exit 1'

        echo "Build completed successfully!"

    } catch (Exception e) {

        echo "Build failed!"

        echo "Error: ${e.message}"

        // throw e
    }
}