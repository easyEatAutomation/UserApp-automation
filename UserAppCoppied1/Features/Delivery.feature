Feature: DeliveryOrder

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/2"

    Scenario: Create D Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button 
    
    
    Scenario: Remove Item from cart
    Then user remove item
    Then user click on browse menu   
    
  
    Scenario: Add Item to the cart again
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button 
    
    
    Scenario: Login
    Then user click  on Continue Button
    Then user click  on Login via Mobile Number Button
    Then user click on Flag
    Then user write "Malaysia"
    Then user click on Malaysia Country code
    Then user set mobile number "111123456"
    Then user click on Continue1 Button
    
    Scenario: Place Order
    Then user click  on Place Order Button
    Then select StoreCredits Checkbox
    Then click on Confirm to pay Button
    Then click on Okay got it button
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
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
    Then User Click on Start Preparing Button
