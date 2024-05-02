Feature: LoginPage

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a1&tableNo=333"

  Scenario: Create Dine In Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
    
        
    Scenario: Remove item from menu oage
    When User is on Menu page
    Then User Click on Minus icon
    
    Scenario: Search item from Menu page
    When User Click on Search icon
    Then User enter "combo pizza"
    Then User Click on SearchAdd button
    Then User Click on Addon1
    Then User Click on Variant Add Button
    
    
   Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
    Then get invoice number
    
    
    Scenario: Add More Items
    Then user click on Add More Button
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button 
    Then user click  on Place Order Button
    
    
   Scenario: Open Chrome Browser
    Given I open "Chrome" browser and POS "https://partner.easyeat.ai/login"

  Scenario: Login with valid Credentials
    When User is on Login Page
    Then User enters "magic@easyeat.ai" and "magic@1234"
    And Click on Login button
    Then User should get logged in
    And Message displayed Login Successfully
    Then user click  "9"
    Then user click  "5"
    Then user click  "8"
    Then user click  "6"
    Then click on SignIn button
    Then close marketing pop up
    And search invoice number
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
    Then user will select the payment option as cash
    Then bill swipe for full amount