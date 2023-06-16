@wip
Feature: Dashboard page

  Background: User go to dashboard
    Given user tries go the dashboard page

  Scenario: User tries to login wity valid credentials
    Given user cliks login function
    Then user should see login page
    And user type username or email input box
    And user type password input box
    When user cliks login button
    Then user should login successfully