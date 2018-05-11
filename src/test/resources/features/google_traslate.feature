#Author: diagavir
Feature: Google Translate
  As a Web user 
  I want to use google translate
  To translate a word

  Scenario Outline: Translate from English to Spanish
    Given that nelson opens his browser al google home page
    And he goes to google translator
    When he translates the <word> from <SourceLenguage> to <targetLenguage>
    Then he would see the word queso in the screen

    Examples: 
      | word    | SourceLenguage | targetLenguage |
      | feature | Ingl           | Espa           |
      | asu     | Javan          | Espa           |
