def call() {
sh 'mvn package -DskipTests=True'
}
