	Feature: TableReservation

  @smoke @sanity 
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "pickup"
    When user click on Login to book a seat button
    Then user click  on Login via Mobile Number Button
    Then user click on Flag
    Then user write countryname
    Then user click on Malaysia Country code
    Then user set mobile number "111123456"
    Then user click on Continue1 Button
    Then user click on book a seat button
    Then user select number of guest
    Then user click on Pax Continue Button
    Then user select the date
    Then user select the time
    Then user click on Date Continue Button
    Then user enter name "Automation"
    Then user enter email id "magic@easyeat.ai"
    Then user enter contact no "1111234567"
    Then user click on proceed button
    Then user click on any special request 
    Then user enter special request "Need Pool Side Table"
    Then user click on request submit button
    Then user click on add an occasion
    Then user choose an occasion
    Then user click on occcasion submit button
    Then user click on book now button
   
   
  @table
  Scenario: Open Chrome Browser
   Given I open "Chrome" browser and POS "posurl"
   When User is on Login Page
   Then User enters Emailid and password "magic@1234"
   And Click on Login button
   Then User should get logged in
   Then user click  "9586"
   Then click on SignIn button
   Then user click on table booking tab
   Then user click on booking requests button
   Then user click on accept button
   Then user select the table
   Then user close the booking request window
   Then user click on tomorrow button 
   Then user click on checkin button
   Then user select the checkin table
    