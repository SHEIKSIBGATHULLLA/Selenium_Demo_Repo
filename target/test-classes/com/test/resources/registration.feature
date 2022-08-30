Feature: User Resgistration
Background: 
    Given User is on register page
    When User enters following user details
  @register
  Scenario: User registration with multiple data
    
      | laptop | asus    | 8gb  | 512ram |  57000 | Bengaluru    |
      | laptop | dell    | 6gb  | 456ram |  34000 | Jaipur       |
      | laptop | samsung | 12gb | 567ram |  50000 | Hyderabad    |
      | laptop | HP      | 4gb  | 345ram |  45000 | Secenderabad |
      | laptop | Mac     | 15gb | 567ram | 100000 | London       |
    Then user should be successfully register in registration page

  Scenario: User registration with multiple data 
    
      | Items  | Brand   | GB   | Ram    | Price  | Place        |
      | laptop | dell    | 6gb  | 456ram |  34000 | Jaipur       |
      | laptop | samsung | 12gb | 567ram |  50000 | Hyderabad    |
      | laptop | HP      | 4gb  | 345ram |  45000 | Secenderabad |
      | laptop | Mac     | 15gb | 567ram | 100000 | London       |
    Then user should be successfully register in registration page
