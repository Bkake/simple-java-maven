pipeline {
   agent {
      docker {
         image 'maven:3-alpine'
      }
   }
   stages {
      stage ('Init'){
        steps{
          sh 'mvn --version'
        }
      }
   }
}