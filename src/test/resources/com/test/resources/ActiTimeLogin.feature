Feature: Acti_Time Application

  Scenario: Navigating to login page with valid credentials
    Given User navigates to the Acti_Time_Application URL "https://demo.actitime.com/login.do"
    When User enters the UserName "admin"
    And User enters the Password  "manager"
    Then User Should able to click on login button
 