Feature: Bill_ActiveOrder_Void_Settle_POS

   @smoke @sanity @bill
    Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "dinein"

   @smoke @sanity @bill
    Scenario: Create Dine In Order
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    
   @smoke @sanity @bill
    Scenario: Place Order calculate bill and validate bill
    Then user click  on View Cart Button
    Then user calculate item_total_sst_sc_pc_Discount_manually
    Then user validate SST on user App
    Then user validate SC on user App
    Then user validate PC on user App
    Then user calculate and validate the Bill
    Then user click  on Place Order Button
    Then user click on Skip button
    
    
   @smoke @sanity @bill
    Scenario: Add more item from User App and calculate bill and validate bill
    Then user click on add more Button on userApp
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button
    Then user calculate item total sst sc pc Discount manually add more
    Then user validate SST on user App
    Then user validate SC on user App
    Then user validate PC on user App
    Then user calculate and validate the Bill
    Then user click  on Place Order Button
    #@smoke @sanity @bill
    #Scenario: Active Order Banner
    #Then user click on Order Status back button
    #Then user click on active banner
    Then get invoice number
    
    @smoke @sanity 
    Scenario: Open Chrome Browser
    Given I open "Chrome" browser and POS "posurl"
    
  @smoke @sanity @bill
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
    And Validate the userApp bill on POS
    
   @smoke @sanity @bill
    Scenario: Add Item from POS, calculate validate & validate the bill
    When User clicks on add items
    Then select Items A
    And Click on Create Order button
    And search invoice number
    Then user calculate item total sst sc pc Discount manually after adding more item from POS
    Then user validate SST on POS after addMoreItem
    Then user validate SC on user POS after addMoreItem
    Then user validate PC on user POS after addMoreItem
    Then user calculate and validate the Bill on POS after addMoreItem 
  
  @smoke @sanity  
    Scenario: Void Item, calculate & validate the bill
    Then user will click on Void Icon 
    Then user will click on Void Dish Button
    Then user calculate item total sst sc pc Discount manually after voiding item from POS
    Then user validate SST on POS after void iten
    Then user validate SC on user POS after void item
    Then user validate PC on user POS after void item
    Then user calculate and validate the Bill on POS after void item 
    
 @smoke @sanity   
    Scenario: Settle Bill
    Then Click on Settle Bill button
    Then User will select payment option
   # Then User will select full amount
    And Click on Next button
  #  Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be paid
    And search invoice number
    #Then User Click on Start Preparing Button
    #Then User Click on Dispatched Button
    Then User Click on Complete Button