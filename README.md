
Selenium Grid Integration with Docker:

Step1: First need to create the docker-compose.yaml file.

Step2: Run the docker-compose.yaml with the below command:
		docker-compose up
		
Step3: To check Hub and nodes running state
			http://localhost:4444/grid/console
			
Step4: 	To increase browser, need to execute the below command:
			
		docker-compose scale chrome=1
		
Step5:	To stop the grid and cleanup the containers
			docker-compose down

   ![Selenium Grid Integration with Docker](https://github.com/gitsamim/SeleniumWithDOCKER/assets/41549129/f42ecdd2-c09f-4c4e-9931-dff9f3a5657e)
