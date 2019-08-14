
Feature: Title of your feature
 
  @tag1
  Scenario: Successful sign-up
    Given I choose to sign up
    And I choose to Launch app
    When I sign up with "tanalu@gmail.com" and "123456"
    Then I should be sign up on the webpage
  
  

