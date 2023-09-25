pipeline {
	agent any
	tools {
	maven 'MAVEN_HOME'
	}
	
	stages{
			stage('Welcome Stage')
			{
			 steps
			 {
			 	echo 'welcome to Jenkins Pipeline'
			 }
			}
<<<<<<< HEAD
			
			stage('Maven Clean')
			{
			 steps
			 {
			 	bat 'mvn clean' 
			 }
			}
=======
>>>>>>> e584c954eee319df05e3e1bbdf5b30b6c2fe3d86
			stage('Maven package')
			{
			 steps
			 {
			 	bat 'mvn package' 
			 }
			}
			stage('Maven Install')
			{
			 steps
			 {
			 	bat 'mvn install' 
			 }
			}
			stage('Maven Test')
			{
			 steps
			 {
			 	bat 'mvn test' 
			 }
			}
			stage('Final Build Step')
			{
			 steps
			 {
			 	echo 'Build Done' 
			 }
			}
		}
	}
	
<<<<<<< HEAD
=======
                                   
>>>>>>> e584c954eee319df05e3e1bbdf5b30b6c2fe3d86
