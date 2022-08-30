Feature: Sauce_Labs Application

  @Sauce-Labs
  Scenario Outline: Login Page
    Given User navigates to sauce labs application login page "<url>"
    Then User enters "<Username>" in username textbox
    And User enters "<Password>" in password textbox
    Then User should be successfully clicked on login button

     
    Examples: 
      | Username                | Password     |url|
      | standard_user           | secret_sauce |https://www.saucedemo.com/|
      | locked_out_user         | secret_sauce |https://www.saucedemo.com/|
      | problem_user            | secret_sauce |https://www.saucedemo.com/|
      | performance_glitch_user | secret_sauce |https://www.saucedemo.com/|
