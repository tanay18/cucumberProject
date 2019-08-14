
Feature: Login Functionality

 #@login
  #Scenario: Login with valid credentials
    #Given Navigates to homepage
    #When user enter username and password
    #Then users logged in successfully
  #

 @data-driven
  Scenario: change some of the data and place the order
    Given login yo the website
    When increase the quantity by 2
    And continue for checkout
    And change the shipping address to the new address pune
    Then the product should be delievered to the new address
  
 