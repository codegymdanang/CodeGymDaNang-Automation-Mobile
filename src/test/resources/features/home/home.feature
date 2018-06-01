@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Home Screen
  In order to user an app
  As a user
  I want to see the  screen

  Scenario: Home screen
    Given I am on the enter pin
    And   I enter pin numbers
    And 	  I wait for all transaction list to be loaded 
    Then  I should see the transaction list