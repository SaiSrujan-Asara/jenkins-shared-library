import com.company.Greeter

def call(Map config) {

    def greeter = new Greeter()

    def message = greeter.greet(config.name)

    echo message
}