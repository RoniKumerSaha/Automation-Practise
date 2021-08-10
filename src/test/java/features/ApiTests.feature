Feature: API testing

  Scenario: I can get all users
    Given I create a GET api call for user
    Then I should see all users

