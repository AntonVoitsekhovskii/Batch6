Feature: Name validations against DB

Scenario: First Name Validation against DB
    Given user is logged with valid admin credentials
    And user navigates to employee list page
    When user enters valid employee id "14688"
    And clicks search button
    Then verify table is displayed
    And get first name from table
    When get data from db
    Then verify first name from ui against db
    
