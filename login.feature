Feature: User Sign Up and Sign In

  Scenario Outline: User creates an account and logs in
    Given I navigate to the Magento homepage
    When I create a new account with the following details:
      | firstName | lastName | email                      | password    |
      | pranav    | urmaliya | pranavurmaliya59@gmail.com | Ankita@2906 |
    And I sign out of the account
    When I sign in with the email "pranavurmaliya59@gmail.com" and password "Ankita@2906"
    Then I should be logged in successfully
