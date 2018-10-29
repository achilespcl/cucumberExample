Feature: As a user I want to check avaiable cruises in my application 

Background: Login 
	Given I am on home page 
	When I insert User Information 
	Then I see the welcome message "Welcome back to Mercury Tours!" 

Scenario: Check cruises
	Given I am logged in
	When I go to the cruises page
	Then I see a list of avaiable cruises
	
	