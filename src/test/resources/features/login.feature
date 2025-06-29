Feature: Login functionality

  Scenario: Valid login
    Given User is on the login page
    When User enters valid username and password
    Then User should be redirected to the home page
