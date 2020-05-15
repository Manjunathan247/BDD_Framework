Feature: Signup functionality
@Signup
  Scenario: Signup with valide credentials
    Given I am in flipkart Signup page
     When I enter my details in respectice field
      | manjunathan | 25 | 9597319616 | 
      And I click on signup button
     Then I should see successful message
