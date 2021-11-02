import com.clubfactory.AppParams

def call(Object WorkflowScript) {
    pipeline {
        agent any 
        stages {
            stage('Stage 1') {
                steps {
                    echo 'Hello world!' 
                }
            }
        }
    }
}
