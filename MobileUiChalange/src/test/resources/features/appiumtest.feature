Feature: Login Feature
  Scenario Outline: 1. Positive case. User is loading application and LogIn to it
    Given User is load the "appiumChallenge.apk" on Android  phone
    When User wait until "Login" Page will be loaded
    And User enter <username> to "username" input
    And User enter <password> to "password" input
    Then User press the button "LOG IN"
    And User wait until "Samples List" Page will load

    Examples:
      | username | password    |
      |  "admin" | "admin"     |

  Scenario Outline: 2. Negative case. User is loading application with bad credentials
    Given User is load the "appiumChallenge.apk" on Android  phone
    When User wait until "Login" Page will be loaded
    And User enter <username> to "username" input
    And User enter <password> to "password" input
    Then User press the button "LOG IN"
    And User sees Bad Cred error modal window
    And User press Ok button on error modal window

    Examples:
      | username | password    |
      |  "user1" | "password1" |