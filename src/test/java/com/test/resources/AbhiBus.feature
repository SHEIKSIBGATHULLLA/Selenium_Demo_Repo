Feature: Abhi_Bus Application

  @Abhi_Bus
  Scenario Outline: Navigating to Abhi_Bus Home page
    Given User navigates to the Abhi_Bus_Application URL "Url"
    When User enters the Leaving from TextBox "<From Place>"
    Then User able to select from destination
    And User enters the Going to TextBox "<To Place>"
    Then User able to select to destination
    And User should able to click on Data of Journey
    And User should able to select the Journey Date
    Then User Should able to click on Search button
    When User able to click on Select seat button
    Then User able to select the window seat
    And User have to select a Boarding point address
    And User have to select a Dropping point address
    Then User able to click on Continue to Payment button
    When User navigates to next page enter email_id  "<Email>"
    Then User should able to enter Mobile Number     "<Mobile_Number>"
    And User able to enter Full Name                 "<Full_Name>"
    And User able to enter Age                       "<Age>"
    Then User should able to click on Pay button

    Examples: 
      | Url                      | From Place | To Place | Email                         | Mobile_Number | Full_Name         | Age |
      | https://www.abhibus.com/ | Bengaluru  | Chennai  | sheiksibgathulla776@gmail.com |    9030173016 | Sheik Sibgathulla |  21 |
