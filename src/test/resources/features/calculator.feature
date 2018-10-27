Feature: As a user I want to add two numbers to avoid human mistakes 

Scenario: Add two whole numbers
    Given I insert the numbers "50" and "80" in my calculator
    When I click on "add" button
    Then my calculator displays the result "130"
        


