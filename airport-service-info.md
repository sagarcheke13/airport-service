------Execution Information------------------

1) Checkout code from https://github.com/sagarcheke13/airport-service.git
2) Compile it
3) Set JAVA_HOME
4) Set MAVEN_HOME
5) Go to -<PATH>\airport-service
6) Run maven command -> mvn clean install -DskipTests
7) Go to 
	<Path>\.m2\repository\com\airport\airport-service\0.0.1-SNAPSHOT\airport-service-0.0.1-SNAPSHOT.jar
8) java -jar airport-service-0.0.1-SNAPSHOT.jar
9) Execute below GET request / 
	curl --location --request GET 'http://localhost:8080/flights?date=31/01/2022'
	HTTP - GET - http://localhost:8080/flights?date=31/01/2022