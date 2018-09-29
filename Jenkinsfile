pipeline {
   agent any
   tools {
     maven 'localMaven'
   }
   stages{
      stage ('Init'){
         steps{
            echo 'Initializing...'
            sh 'mvn --version'
         }
      }
   }
}