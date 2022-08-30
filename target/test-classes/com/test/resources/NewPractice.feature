@AllData
Feature: New Experience Application

  #DataTable
  @datatable
  Scenario: Registration functionality
    Given User clicks on Sign_in button
    When User enters the valid email
      | sheiksibgathulla776@gmail.com |
    Then User click on create an account button the page should be in home page

  @datatable1
  Scenario: Create Account functionality
    When User selects the title
    Then User enters the First Name
       #First Name
       
      | John_Cena |
      
    And User enters the Last Name
    #Last Name
    
      | LastName |
      | Jonny |
    And User enters the Password
      | Password |
      | John@345^$% |
    Then User enters the address of first name
      | Address_FirstName |
      | Mr.HariPrasand |
    And User enters the adddres of last name
      | Address_LastName |
      | Golla |
    Then User enters the main Address
      | Address |
      | HariNagar,Near Temple Road. |
    But User enters the City
      | City |
      | London |
