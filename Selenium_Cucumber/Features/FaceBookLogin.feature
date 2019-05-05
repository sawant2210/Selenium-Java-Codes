#Feature: Verifying the login for Facebook
#
#Scenario: Verifying the Login using valid credential
#
#Given Open Chrome Browser and reach FaceBook login page
#When User enters valid "kunals" and "1234"
#Then  user logins to facebook successfully
Feature: Verifying the login for Facebook

  Scenario Outline: Verifying the Login using valid credential
    Given Open Chrome Browser and reach FaceBook login page
    When User enters valid "<username>" and "<password>"
    Then user logins to facebook successfully

    Examples: 
      | username | password |
      | kuns     |     1234 |
      | mohs     |     6547 |  
