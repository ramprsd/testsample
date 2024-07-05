Feature: To validate the homepage functionality of Salesforce login page

  @errormsgvalidation @alpha
  Scenario: user validates the error message
    When user enters the username "ram" and password "password"
    And user click the login button
    Then user validate the error message

  @sc2 @alpha
  Scenario: user validate the login functionality
    When user enters the username "learnmore" and password "abc"
    And user click the login button
    Then user should navigate to homepage