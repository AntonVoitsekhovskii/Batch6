Feature: Modify employee personal information
@modify
  Scenario: Add employee with first and last name
    Given user enter valid admin username and password
    And user click on login button
    And user navigates to AddEmployeePage
    And user enters employees "Anton" and "Voyts"
    And user clicks save button
    And "Anton Voyts" is added successfully
    And user clicks edit button
    When user modify other information
      | LicenseNumber | LicExpDate | SsnNym    | SinNum    | Gender |
      |       1234567 | 2021-06-02 | 111223456 | 987654321 | Male   |
    And user clicks save button
    Then user information was added successfully
