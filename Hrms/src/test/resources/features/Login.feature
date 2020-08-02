Feature: Login

  #previously written test
  @login
  Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    Then admin user is successfully logged in

  @login
  Scenario: valid ess login
    When user enter "Avoyts" username and "Syntax321@" password
    And user click on login button
    Then ess user is successfully logged in

  @admin
  Scenario Outline: 
    When user enter valid "<Username>" and "<Password>"
    And user click on login button
    Then "<FirstName>" is succesfully logged in

    Examples: 
      | Username | Password    | FirstName |
      | Admin    | Hum@nhrm123 | Admin     |
      | Avoyts   | Syntax321@  | Anton     |

  @smoke
  Scenario: Login with valid username and invalid password
    When User enter valid username and invalid password
    And user click on login button
    Then User see Invalid Credentials text on login page
