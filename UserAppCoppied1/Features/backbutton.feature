Feature: BackButton

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://easyeat.ai/r/automation_cafe_Malaysia12/3"

    Scenario: Create pickup Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button 
    
    
   Scenario: Back button on Cart page
   Then user click on cart back button
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
    
    
    Scenario: Back button payment page
    Then user click on payment back button
    Then user click on Pay Now button
    
    
    Scenario: Make Payment
    Then select StoreCredits Checkbox
    Then click on Confirm to pay Button
    Then click on Okay got it button
    Then user click on Order Status back button
   

   Scenario: Profile Icon to Order History back
   Then user click on profile icon
   Then user click on Order History
   Then user click on Order History back button
   Then user click on profile back button