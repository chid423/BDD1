Feature: login
  I want to use this template for my feature file

  @tag1
  Scenario: User to be able to login with correct username and password
    Given user open url
    When user enter valid username
    And user enter valid password
    Then user clicks on login button
    And user see homepage

  Scenario: User logs in as locked out user
    Given user logs in as locked user

  Scenario: User Logs in as a problem  user
