Feature: Login

  Background: 
    Given user opens browser and launch the url"https://dsportalapp.herokuapp.com/"
    When user clicks on "Get started" button
    And clicks on "signIn" link
    Then user will successfuly able to see signIn page

  Scenario: 
    When user clicks on Register link on signIn page
    Then user should be successfully redirected to register page

  Scenario Outline: signIn validation with valid inputs
    When user enters valid "<username>" "<password>"
    Then user should be successfully able to see the messgae "You are logged in"

    Examples: 
      | username        | password  |
      | swati@gmail.com | swati@123 |
      | abc@gmail.com   | abcde@123 |

  Scenario: signIn validation with inValid inputs
    When user click on signIn without entering anything on textbox
    Then user should get error msg "please fill out this field"

  Scenario Outline: signIn validation with inValid inputs
    When user enters invalid "<username>" "<password>" and click on SignIn
    Then user should be able to see error message "Invalid Username and Password"

    Examples: 
      | username      | password |
      | ab@gmail.com  | abc@123  |
      | abc@gmail.com |          |
      |               | abc@123  |
