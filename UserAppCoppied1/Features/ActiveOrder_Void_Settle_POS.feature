Feature: ActiveOrder_Void_Settle_POS

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
    
    
    Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
    
    
    Scenario: Active Order Banner
    Then user click on Order Status back button
    Then user click on active banner
    Then get invoice number
    
    
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
    
    Scenario: Add Item from POS
    When User clicks on add items
    Then select Items A
    And Click on Create Order button
    
    Scenario: Void Item
    Then user will click on Void Icon
    Then user will click on Void Dish Button
    
    
    Scenario: Settle Bill
    Then Click on Settle Bill button
    Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be paid
     And search invoice number
    
    
    Scenario: Complete Order
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
    Then I close browser