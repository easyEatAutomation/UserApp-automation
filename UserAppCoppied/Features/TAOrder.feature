Feature: TAOrder

  @smoke @sanity
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "takeaway"

  @smoke @sanity
  Scenario: Create TA Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3 
    Then User Click on AddVariant Button

 @smoke @sanity
 Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Pay Cash to the Server
    Then click on Confirm to pay Button
    Then user click on Skip button
    Then get invoice number
    
   @smoke @sanity 
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
    Then User Click on Dispatched Button
    #Then User Click on Start Preparing Button
    Then User Click on Dispatched Button
    Then User Click on Complete Button
    Then user will select the payment option as cash
    Then bill swipe for full amount 