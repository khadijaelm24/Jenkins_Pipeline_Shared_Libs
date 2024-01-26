//call's name function shouldn't be changed 
def call() {
  //node keyword is mandatory
  node {
      sh '''
        git version
        java -version
        mvn -version
      '''
  }
}
 
