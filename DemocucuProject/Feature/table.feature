
Feature: Title of your feature

  @data-driven
  Scenario: to check the search functionality of the site
    When search the product in the search box
         |Head  |
         |Travel|
         |Laptop|
    Then product should be added in the cart if available
