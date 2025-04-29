Feature: CookingInstructions_RepeatPreviousItems

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "dinein"

  @smoke
  Scenario: Create Dine In Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
    
    @smoke    
    Scenario: Repeat item from menu page
    Then user click on plus icon on menu page
    Then user click on repeat previous button
    Then user click  on View Cart Button 
   
   @smoke
    Scenario: Repeat item from cart page
    Then user click on plus icon on cart page
    Then user click on repeat previous button on cart
    
    @smoke
    Scenario: Add Cooking Instructions
    Then user click on cooking instructions
    Then user click on check box
    Then user click on add items for instructions button
    Then user click on quick notes
    Then user add instructions "keep it spicy"
    Then user click on add instructions button
    
    @smoke
    Scenario: Place Order
    Then user click  on Place Order Button 
    Then user click on Skip button
    Then verify instructions on order status page
    Then get invoice number

    
   @smoke  
   Scenario: Open Chrome Browser
    Given I open "Chrome" browser and POS "posurl"
    When User is on Login Page
    Then User enters Emailid and password "magic@1234"
    And Click on Login button
    Then User should get logged in
    #And Message displayed Login Successfully
    Then user click  "9586"
    Then click on SignIn button
    #Then close marketing pop up
    And search invoice number
    Then verify instructions on POS
    Then User Click on Start Preparing Button
    Then User Click on Dispatched Button
    Then User Click on Complete Button
    Then user will select the payment option as cash
    Then bill swipe for full amount