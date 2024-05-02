Feature: SameUserDifferentTable

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a1&tableNo=333"


  Scenario: Login with User1
  Then user click on menu profile icon
  Then user click on login button
  Then user click  on Login via Mobile Number Button
  Then user click on Flag
  Then user write "Malaysia"
  Then user click on Malaysia Country code
  Then user set mobile number "111123456"
  Then user click on Continue1 Button
  Then user click on profile back button



  Scenario: Create Dine In Order
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
    
   Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
    Then get invoice number
    
 
   Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a2&tableNo=2"


  Scenario: Login with User1
  Then user click on menu profile icon
  Then user click on login button
  Then user click  on Login via Mobile Number Button
  Then user click on Flag
  Then user write "Malaysia"
  Then user click on Malaysia Country code
  Then user set mobile number "111123456"
  Then user click on Continue1 Button
  Then user click on profile back button



  Scenario: Create Dine In Order
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
    
   Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
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
    Then user will select the payment option as cash
    Then bill swipe for full amount