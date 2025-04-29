Feature: SameUserDifferentTable

  @smoke
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "dinein"

  @smoke
  Scenario: Login with User1
  Then user click on menu profile icon
  Then user click on login button
  Then user click  on Login via Mobile Number Button
  Then user click on Flag
  Then user write countryname
  Then user click on Malaysia Country code
  Then user set mobile number "111123456"
  Then user click on Continue1 Button
  Then user click on profile back button

  @smoke
  Scenario: Create Dine In Order
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
   @smoke  
   Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
    Then get invoice number
    
   @smoke
   Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "dinein1"

  @smoke
  Scenario: Login with User1
  Then user click on menu profile icon
  Then user click on login button
  Then user click  on Login via Mobile Number Button
  Then user click on Flag
  Then user write countryname
  Then user click on Malaysia Country code
  Then user set mobile number "111123456"
  Then user click on Continue1 Button
  Then user click on profile back button


@smoke
  Scenario: Create Dine In Order
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
  @smoke  
   Scenario: Place Order
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    Then user click on Skip button
    Then get invoice number
 
     
   @smoke 
   Scenario: Open Chrome Browser
   Given I open "Chrome" browser and POS "posurl"

  @smoke
  Scenario: Login with valid Credentials
    When User is on Login Page
    Then User enters Emailid and password "magic@1234"
    And Click on Login button
    Then User should get logged in
    #And Message displayed Login Successfully
    Then user click  "9586"
    Then click on SignIn button
    #Then close marketing pop up
    And search invoice number
    Then User Click on Start Preparing Button
    Then User Click on Dispatched Button
    Then User Click on Complete Button
    Then user will select the payment option as cash
    Then bill swipe for full amount