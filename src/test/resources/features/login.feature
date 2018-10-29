Feature: As a user I want to log in my application 

Scenario: Login 
	Given I am on home page 
	When I insert User Information 
	Then I see the welcome message "Welcome back to Mercury Tours!" 
	
Scenario Outline: Many Logins 
	Given I am on home page 
	When I insert <username> and <password> 
	Then I see the welcome message "Welcome back to Mercury Tours!" 
	
	Examples: 
		|username|password|
		|"0dJSe@"| "test1"|
		|"001023"| "test2"|
		|"admin1"| "test3"|
		|"m"     | "test4"|

		
Scenario: Check cruises
	Given I am logged in
	When I go to the cruises page
	Then I see a list of avaiable cruises