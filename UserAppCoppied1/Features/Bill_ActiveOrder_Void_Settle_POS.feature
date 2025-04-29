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
    
    
    Scenario: Place Order calculate bill and validate bill
    Then user click  on View Cart Button
    Then user calculate item_total_sst_sc_pc_Discount_manually
    Then user click  on Place Order Button
    Then user validate SST on user App
    Then user validate SC on user App
    Then user validate PC on user App
    Then user calculate and validate the Bill
    Then user click on Skip button
    
    
    Scenario: Add more item from User App and calculate bill and validate bill
    Then user click on add more Button on userApp
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button
    Then user calculate item total sst sc pc Discount manually add more
    Then user click  on Place Order Button
    Then user validate SST on user App
    Then user validate SC on user App
    Then user validate PC on user App
    Then user calculate and validate the Bill
    #Then user click on Skip button (in case of add more item on user app this case will be remain commented )
    
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
    And Validate the userApp bill on POS
    
    Scenario: Add Item from POS, calculate validate & validate the bill
    When User clicks on add items
    Then select Items A
    And Click on Create Order button
    Then user calculate item total sst sc pc Discount manually after adding more item from POS
    Then user validate SST on POS after addMoreItem
    Then user validate SC on user POS after addMoreItem
    Then user validate PC on user POS after addMoreItem
    Then user calculate and validate the Bill on POS after addMoreItem 
    
    Scenario: Void Item, calculate & validate the bill
    Then user will click on Void Icon 
    Then user will click on Void Dish Button
    Then user calculate item total sst sc pc Discount manually after voiding item from POS
    Then user validate SST on POS after void iten
    Then user validate SC on user POS after void item
    Then user validate PC on user POS after void item
    Then user calculate and validate the Bill on POS after void item 
    
    
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
    #Then user will select the payment option as cash (this option will not be use if we are trying  to complete order bu clicking on Complete button)
    #Then bill swipe for full amount (this option will not be use if we are trying  to complete order bu clicking on Complete button)