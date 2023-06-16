
Feature: Dashboard page

  Background: User go to dashboard
    Given user tries go the dashboard page

  Scenario: User tries create a account with valid credentials
    Given user cliks create account function
    Then user should see application form
    And user type company/trading or business name input box
    And user type email input box
      # fill all form
    When user clicks submit application button
    Then user get successfully message
