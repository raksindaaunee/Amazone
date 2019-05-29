Feature: Mousehover Function
  

  Scenario: 
    Given Amazon Homepage
    When I Mousehover on account and list
    And click on find a gift
    And I want the page titme of that page
    And Take a screenshot 
    Then it should take me to the Men's Shoes Page
   