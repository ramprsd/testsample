Feature: To validate the homepage functionality of Amazon homepage

  @Search
  Scenario: Search products in Amazon
    Given user should navigate to URL
    When user enters the keyword "iphone 15" and click on search button
    Then user gets the valid results

  @AmazonLogin
  Scenario:Validate the SignIn function
    Given user should navigate to URL
    When user clicks the signin button on home page
    And user enters credentials


  @staticdropdown
  Scenario: handle the static dropdown
    Given user should navigate to URL
    When user selects the value from category dropdown


  @multiSearch
  Scenario Outline: Search functionality with multiple data
    When user enters the keyword "<Search Keyword>" and click on search button
    Then user gets the valid results
    Examples:
      | Search Keyword |  |
      | iphone 15      |  |
      | book           |  |

  @mouse
  Scenario: user check the your lists
    Given user clicks the baby wishlist
    Then verify navigation to baby wishlist

