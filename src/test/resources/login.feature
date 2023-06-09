Feature: Login Feature
  This feature deals with login functionality of the application.

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click on login button
    Then I should see the userform page