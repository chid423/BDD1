

@tag
Feature: Login2
  

  @tag1
  Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User open Url"https://admin-demo.nopcommerce.com/login"
    And User enter email and password 
    | admin@yourstore.com| admin |
    
    And User click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link 
    Then page title should be "Your store. Login"
    And close browser

  