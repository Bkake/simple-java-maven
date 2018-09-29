pipeline {
   agent any
   tools {
     maven 'localMaven'
   }
   stages{
      stage ('Build'){
         steps{
            sh 'mvn -B -DskipTests clean package'
         }
      }
   }
}