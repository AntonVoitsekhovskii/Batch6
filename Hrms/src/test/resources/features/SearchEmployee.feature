Feature: Employee Search

  Background: 
    Given user is logged with valid admin credentials
    And user navigates to employee list page

  Scenario: Search employee by id
    When user enters valid employee id "10079"
    And clicks search button
    Then user see employee information is displayed


  Scenario: Search employee by name
    When user enters valid employee "John" and "Smith"
    And clicks search button
    Then user see employee information is displayed
