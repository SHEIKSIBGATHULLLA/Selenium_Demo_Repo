Feature: Abhi_Bus Application

  Scenario: Navigating to Abhi_Bus Home page
    Given User navigates to the Abhi_Bus_Application URL "https://www.abhibus.com/"
    When User enters the Leaving from TextBox "Bengaluru"
    Then User able to select from destination
    And User enters the Going to TextBox "Chennai"
    Then User able to select to destination
    And User should able to click on Data of Journey
    And User should able to select the Journey Date
    Then User Should able to click on Search button
    
    When User able to click on Select seat button
    Then User able to select the window seat
    And User have to select a Boarding point address
    And User have to select a Dropping point address
    Then User able to click on Continue to Payment button
    When User navigates to next page enter email_id
    Then User should able to enter Mobile Number
    And User able to enter Full Name
    And User able to enter Age
    Then User should able to click on Pay button
