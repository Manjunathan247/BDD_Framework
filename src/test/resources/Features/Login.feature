Feature: Login functionality
@Login
  Scenario Outline: Login with valide credentials
    Given I am in amazon Signin page
     When I mouse hover on Contact&List
      And I click on Signin button
      And I enter <username> in username field and <password> in password field
      And I click on login button
     Then I should see home page
  
    Examples: 
      | username    | password | 
      | manjunathan | Manju1   | 
      | Raj         | Raj1     | 
      | Vignesh     | Vignesh1 | 
