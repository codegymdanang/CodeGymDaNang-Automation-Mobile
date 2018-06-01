@component:ui
@version:Release-1
@issue:ETSY-102
Feature: Reload Voucher
  In order  to increase amount of my psc card
  As a user
  I want to reload my card with voucher

 	Scenario Outline: Reload In Valid Voucher
	    Given I am on the reload voucher screen 
	    When I enter my voucher number as "<vouchernumber>"
	    And I click reload button 
	    Then I should see "<result>"
	    
	Examples:
	| vouchernumber      | result  				|
	| 12345678910        |   Reload failed1      	|
