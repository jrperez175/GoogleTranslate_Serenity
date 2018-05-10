#Author: diagavir
Feature: Google Translate
  As a Web user 
  I want to use google translate
  To translate a word

  Scenario: Translate from English to Spanish
    Given that nelson opens his browser al google home page
    And he goes to google translator
    When he translates the word feature from Ingl to Espa
    Then he would se the word queso in the screen 
