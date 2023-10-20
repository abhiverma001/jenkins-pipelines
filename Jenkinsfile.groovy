pipeline {
    agent any

    environment {
        AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: '6249505b-cc02-4268-8450-b06d816dfae1', url: 'https://github.com/abhiverma001/jenkins-terraform-repo.git'
            }
        }
        
        stage('Deploy') {
            steps {
                input(id: 'deployApproval', message: 'Deploy to Production?', submitter: 'user1,user2')
                // Continue with deployment after approval
                echo "Deploying to production......"
            }
        }

        stage('Terraform init') {
            steps {
                sh ("terraform init")
            }
        }

        stage('terraform Apply') {
            steps {
                sh ("chown jenkins terraform.tfstate")
                sh ("terraform apply -auto-approve")
            }
        }

        stage('Post Deployment') {
            steps {
                // Post deployment steps here
                echo "Post deployement any steps mention here"
            }
        }
    }
}