Feature: Amazon Login feature Test
  
  Scenario Outline: User be able to signin successfully  
    Given Launch Browser
    When  Go to home page
    And   Click on signin button
    And   put Username as "<Username>" and password as "<password>"
    And   Click on Submit button 
    Then  login should successfull 

    Examples: 
      | Username                | password|
      |login_practice@yahoo.com | Sony1983|
     
