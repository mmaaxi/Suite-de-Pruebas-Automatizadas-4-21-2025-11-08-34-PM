Feature: User Authentication

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
    And the user's name should be displayed on the dashboard