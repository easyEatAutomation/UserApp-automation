Feature: SwitchWindow

  @smoke 
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "pickup"
    
    Given I open "Chrome" browser and POS "posurl"
    
  Then switch back to the User App
    
    
    #Then switch back to POS app

  
  