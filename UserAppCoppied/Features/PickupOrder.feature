Feature: PickupOrder

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/3"

  Scenario: Create Pickup Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button
    Then user click  on Continue Button
    Then user click  on Login via Mobile Number Button
    Then user click on Flag
    Then user write "Malaysia"
    Then user click on Malaysia Country code
    Then user set mobile number "111123456"
    Then user click on Continue1 Button
    Then user click  on Place Order Button
    Then select StoreCredits Checkbox
    Then click on Confirm to pay Button
    Then click on Okay got it button
    Then get invoice number

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
    Then close marketing pop up
    And search invoice number
