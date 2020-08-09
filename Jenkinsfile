pipeline {
    agent any 
    stages {
        stage('Stage-1 : Clean') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn clean'
                } 
            }
        }
        stage('Stage-2 : Validate') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn validate'
                } 
            }
        }
        stage('Stage-3 : Compile') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn compile'
                } 
            }
        }
        stage('Stage-4 : Test') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn test'
                } 
            }
        }
        stage('Stage-5 : Install') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn install'
                } 
            }
        }
        stage('Stage-6 : Verify') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn verify'
                } 
            }
        }
        stage('Stage-7 : Package') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn package'
                } 
            }
        }
        stage('Stage-8 : Deploy an Artifact to Artifactory Manager i.e. Nexus/Jfrog') { 
            steps {
                withMaven(maven : 'maven'){
                    sh 'mvn deploy'
                } 
            }
        }
        stage('Stage-9 : Deployment - Deploy a Artifact devworld.war file to Tomcat Server '){
            steps{
                sh 'curl -u admin:redhat@123 -T target/**.war "http://3.16.160.151:8080/manager/text/deploy?path=/devworld&update=true"' 
            }
        }
        stage('Stage-10 : SmokeTest'){
            steps{
                sh 'curl --retry-delay 10 --retry 5 "http://3.16.160.151:8080/devworld"' 
            }
        }
    }
}
