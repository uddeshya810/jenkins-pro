pipeline {
 agent any 
   tools {
     maven ' MAVEN_HOME '
      }
       stage {
          stage ('Wellcome Stage' )
              { 
                steps {
                     echo 'Wellcome to Jenkins Pipelne' }
                  }
           stage ('Maven Stage')
                 {
                  steps {
                          bat 'mvn clean '}
                          }
             stage ('Maven Package'){
                 steps{
                        bat 'mvn package' }
                        }
              stage ('Maven install'){
                 steps {
                    bat 'mvn install' }
                    }
               stage ('Final Build Steps'){
                 steps { 
                 echo 'build done'}
                 }
                 }
                 }
                }           
                                   
