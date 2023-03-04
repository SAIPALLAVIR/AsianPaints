Feature: Asian Paints Stores
  I want to use Asian Paints Stores
  
  Scenario: Browse stores
  Given I am on the Asian Paints website
  When I click on the Stores tab
  Then I should see a list of available stores
  
  Scenario: Navigate to Paint page
    Given I am on the Asian Paints website
    When I click on the Paint Stores
    Then I should be taken to the paint page
    
  Scenario: Navigate to Decor page
    Given I am on the Asian Paints website
    When I click on the Decor Stores
    Then I should be take to the Decor page
    
  Scenario: Navigate to Furnishing page
    Given I am on the Asian Paints website
    When I click on the Furnishing Stores
    Then I should be take to the Furnishing page
    
	Scenario: Navigate to Signature page
		Given I am on the Asian Paints website
    When I click on the Signature Stores
    Then I should be take to the Signature page
    
  