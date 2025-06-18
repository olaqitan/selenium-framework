@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on Create an account
    Then My Account Page is displayed


    Examples:
      | FirstName | LastName | Email              | Password  | ConfirmPassword |
      | John      | Doe      | johndoe1@gmail.com | London123 | London123       |

  Scenario Outline: Create an account - Duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on Create an account
    Then Error message should display showing account already exist


    Examples:
      | FirstName | LastName | Email              | Password  | ConfirmPassword |
      | John      | Doe      | johndoe1@gmail.com | London123 | London123       |

  @AccountLogin
  Scenario Outline: Account Login - Registered customer
    Given I am on Account login page
    When I enter  "<Email>" "<Password>"
    And I click on SignIn
    Then My Account Page is displayed


    Examples:
      | Email              | Password  |
      | johndoe1@gmail.com | London123 |
