

Feature: LogIn

  Scenario: Successful login with valid credentials
    Given user lonch Firefox Browser
    When user open URL "https://admin-demo.nopcommerce.com/login";
    And Enter email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then page Title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then page Title should be "Your store. Login"
    And close browser

  