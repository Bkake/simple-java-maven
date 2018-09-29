pipeline {
   agent any
   tools {
     localMaven
   }
   stages {
      stage ('Init'){
        steps{
          echo 'Initializing...'
          sh 'mvn --version'
        }
      }
   }
}