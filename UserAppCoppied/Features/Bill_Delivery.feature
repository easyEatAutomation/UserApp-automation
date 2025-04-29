Feature: Bill_DeliveryOrder

  @smoke @sanity @Delivery
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "delivery"
    When User is on Menu Page
    Then User Click on Add button
    And Click on Variant1
    And Click on Variant2
    And Click on Variant3
    Then User Click on AddVariant Button
    Then user click  on View Cart Button 
    Then user calculate item_total_sst_sc_pc_Discount_manually_for_DL_order
    Then user calculate item_total_sst_sc_pc_Discount_manually_for_PU_order
    
    @smoke @sanity @Delivery
    Scenario: Login
    Then user click  on Continue Button
    Then user click  on Login via Mobile Number Button
    Then user click on Flag							
    Then user write countryname
    Then user click on Malaysia Country code
    Then user set mobile number "111123456"
    Then user click on Continue1 Button
    Then user validate SST on user App_for_DL_order
    Then user validate SC on user App_for_DL_order
    Then user validate PC on user App_for_DL_order
    Then user calculate and validate the Bill_for_DL_order

    
    @smoke @sanity @Delivery
    Scenario: Place Order
    Then user click  on Place Order Button
    Then select StoreCredits Checkbox
    Then click on Confirm to pay Button
    Then click on Okay got it button
    Then get invoice number

    @smoke @sanity @Delivery
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
    And Validate the userApp bill on POS_for_DL_order
    Then User Click on Start Preparing Button
    Then User Click on Dispatched Button
    Then User Click on Complete Button
