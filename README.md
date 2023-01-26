# DS-ALGO
## Project Title:   
   Data Structures and Algorithms (DS-ALGO) Project 

## Project Description:    
DS-ALGO project is an automation testing project for the website "https://dsportalapp.herokuapp.com/ ".    
The above website gives you knowledge about data structures and its types (Arrays, LinkedList, Stack, Queue, Tree, Graph) and algorithms using Python.

### Table of Contents:
1.	Tools and Technologies
2.	Frame Work
3.	Running Project
4.	Reporting

#### Tools and Technologies used in this project:

1.	##### Maven      
	•	Handles the entire lifecycle of the project.    
	•	Manages project dependencies.    
	•	Uses the concept of POM (Project Object Model)    

2.	##### Java    
	•	Object-Oriented Programming language.    
	•	Java with Selenium execution is faster.    

3.	##### Selenium WebDriver    
	•	Automating web-based application testing    
	•	Testing Framework for testing UI(User Interface) of the application    

4.	##### Cucumber    
	•	Framework that supports Behavior Driven Development (BDD approach).   

5.	##### PicoContainer 
	•	Picocontainer is responsible for instantiating objects and resolving their constructor dependencies. 
	•	Any Picocontainer-instantiated object (eg. a Webwork action) can obtain an instance of another (eg. a Manager class) simply by requesting one in its 		     constructor.
	•	Using PicoContainer to share state between steps in a scenario is easy and non-intrusive.
	
6.	##### Log4j    
	•	Logging framework which is responsible for capturing, publishing, and formatting logging information.    

#### Framework:             
![image](https://user-images.githubusercontent.com/97117913/211368468-0149f553-6399-4dfe-894e-3f8e18446b64.png)



#### Running the project:    
    Through Eclipse:	
      	Go to Runner.java in  src\test\java\com\runner.
        Right Click – run as – TestNG Test

##### Features will run in order :     
1.	UC01_startPage.feature   
2.	UC02_register.feature   
3.	UC03_login.feature   
4.	UC04_DataStructureIntro.feature    
5.	UC05_arrays.feature    
6.	UC06_linkedList.feature
7.	UC07_stack.feature   
8.	UC08_tree.feature   
9.	UC09_graph.feature   
10.	UC10_queue.feature



#### Reporting      
	Once tests complete run reports are generated. This framework uses different types of test reporters to communicate pass/failure.

#### Allure Report:          
	Allure Report will be generated into the temp folder. To see the report
	Go to command prompt
		$ cd <Project Directory>

	$ allure serve allure-results

#### ExtentReport: 
	We have three different types of reports in ExtentReports
	
   	1.Spark Report: 
   
		Spark report will be generated in the directory: 
		
			test-output/DsAlgo-Spark/Index.html    

  	2.HTML Report:   
   
		HTML report will be generated in the directory: 
		
		test-output/HtmlReport/ExtentHtml.html
		
  	3.PDF Report:    
   
		Pdf report will be generated in the directory:	
		
			test-output/PDFReport/ExtendPdf.pdf 
			

#### Cucumber Report:        
	The cucumber report will be generated in the directory:
			target/cucumber-reports/cucumber.html
			
#### TestNg Report:   
	TestNg report will be generated in the directory: 
		test-output/Index.html	     
