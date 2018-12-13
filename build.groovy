pipeline{
    agent any
    stages {
        stage('git clone code') {
            steps{
                echo '获取代码'
                git 'https://github.com/realmadred/k8s-service.git'
            }
        }
        stage('build') {
            steps{
                echo 'maven 打包'
                sh 'sh/build.sh'
            }
        }
        stage('Deploy') {
            steps{
                echo 'This is a deploy step'
            }
        }
    }
}