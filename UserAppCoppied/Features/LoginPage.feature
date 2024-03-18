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
    Then user click  on View Cart Button 
    Then user click  on Place Order Button 
    #Then click on Skip button
    Then Read invoice number