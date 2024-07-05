Feature: To validate the homepage functionality of Salesforce login page

  @errormsgvalidation @alpha
  Scenario: user validates the error message
    Given user navigates to salesforce url
    When user enters the username "ram" and password "password"
    And user click the login button
    Then user validate the error message

  @sc2 @alpha
  Scenario: user validate the login functionality
    Given user navigates to salesforce url
    When user enters the username "learnmore" and password "abc"
    And user click the login button
    Then user should navigate to homepage