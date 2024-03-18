Feature: CompleteOrder

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and POS "https://partner.easyeat.ai/login"

  Scenario: Login with valid Credentials
    When User is on Login Page
    Then User enters "ajai@easyeat.ai" and "ajai1234"
    And Click on Login button
    Then User should get logged in
    And Message displayed Login Successfully
    Then user click  "1" 
    Then user click  "2" 
    Then user click  "4" 
    Then user click  "1" 
    Then click on SignIn button
   # Then it will redirect to the dashboard
