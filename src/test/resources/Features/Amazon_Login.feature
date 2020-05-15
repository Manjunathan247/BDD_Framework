Feature: Validating Login functionality for Amazon site 

As a user 
I want to login with valide crenentials
So that I can place an order

@Amazon
Scenario: User can able to login with valide credentials 
	Given user in "https://www.amazon.in/" page 
	When user click on sign in button it shoud display Amazon signin page 
	And user enter mail id then click on continue button 
	And user enter password then click on Login button 
	Then user should be in home page