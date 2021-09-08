Feature: Home Page Feature
  Scenario: User can visit Home page
    Given I am on Home Page
    Then I should see my all the product categories

  Scenario Outline: User can view products
    Given I am on Home Page
    When I select category "<Category>"
    And I click a product "<Product>"
    Then I should see details of the product "<Product>"
    Examples:
    | Category | Product                    |
    | Women    | Faded Short Sleeve T-shirts|
    | Dresses  | Printed Dress              |
    | T-shirts | Faded Short Sleeve T-shirts|

  Scenario: User can visit youtube channel of the site
    Given I am on Home Page
    When I click on twitter link
    Then I should see the youtube channel of the site