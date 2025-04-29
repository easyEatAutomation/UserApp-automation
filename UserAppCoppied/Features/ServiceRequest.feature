Feature: ServiceRequest

  @smoke 
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "dinein"

 @smoke
  Scenario: Send Service Request
    And user click on bell icon
    Then user click on CallTheServer button
    Then user click on RequestMoreButton
    Then user click on Cutlery button
    Then user click on AddCutlery button
    Then user click on RequestItembutton
    Then user click on DoneButton
    And user click on bell icon
    Then user click on Sauces button
    Then user click on TomatoSauce button
    Then user click on RequestItembutton
    Then user click on DoneButton
    
   @smoke    
    Scenario: Accept Service Request from POS
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
    Then user click on TableService
    Then user click on MarkDoneButton
    Then user click on MarkDoneButton
    Then user click on MarkDoneButton