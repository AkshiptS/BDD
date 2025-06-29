Feature: login action
  Scenario Outline:  user is on Home page
    Given user is on Home Page
    When user navigate to login page
    And user enters "<username>" and "<password>"
    Then message displayed login successfull
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | visual_user             | secret_sauce |
      | error_user              | secret_sauce |
