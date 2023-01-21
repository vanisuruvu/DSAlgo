@stack
Feature: Stack

 #Scenario: Launch the url
#	Given user open browser and launch the url "https://dsportalapp.herokuapp.com/"
   #When user click  "Get started" button
   #And click on signin link
   #When user enters  "abcde12ab3@gmail.com" "pranav@12"
   #And user click on login button

@Stack_001
Scenario: validating Stack operationsInStack  page
		Given The user is at home page with title "NumpyNinja"
    When user click on Get Started button in Stack section
    Then user should navigate to corresponding page with title "Stack"
    When user click on operations in stack link
    Then user should navigate to corresponding page with title "Operations in Stack"
     When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enter the Python code in text editor
      |print("stack Introduction")|
    And click on run button
	Then User navigate back to page as title "https://dsportalapp.herokuapp.com/stack/"
	
	@stack
	Scenario: User validate Implemention page
		Given The user is at home page with title "Stack"
    When user click on Implementation link
    Then user will navigate to corresponding page with title "Implementation"
    When user clicks on Try here
 And It should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      |print("stack implementation")|
    And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/stack/"
    
    @stack
	Scenario: User validate Creating Applications page
	Given The user is at home page with title "Stack"
    When user click on Applications link
    Then user will navigate to corresponding page with title "Applications"
    When user clicks on Try here
 And It should navigate to corresponding page with title "Assessment"
    When user enters the Python code
      |print("stack Applications")|
    And click on run button
    Then User navigate back to page with title "https://dsportalapp.herokuapp.com/stack/"
    
    @stack
  Scenario: The user is able to get the error message for invalid syntax for Operations in Stack page
  
  Given The user is at home page with title "Stack"
    When user click on operations in stack link
    Then user should navigate to corresponding page with title "Operations in Stack"
     When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters invalid Python code in text editor
      |hello|
    And click on run button
    Then user should get error message 
	Then User navigate back to page as title "https://dsportalapp.herokuapp.com/stack/"
	
	@stack
  Scenario: The user is able to get the error message for invalid syntax for implementation page
  
  Given The user is at home page with title "Stack"
    When user click on Implementation link
    Then user should navigate to corresponding page with title "Implementation"
     When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enters invalid Python code in text editor
      |hello|
    And click on run button
    Then user should get error message 
	Then User navigate back to page as title "https://dsportalapp.herokuapp.com/home"
