#Author: diagavir
Feature: Google Translate
  As a Web user 
  I want to use google translate
  To translate a word

  @Scenario_OK
  Scenario Outline: Translate word from SourceLenguage to TargetLenguage
    Given that nelson opens his browser al google home page
    And he goes to google translator
    When he translates the <word> from <sourceLenguage> to <targetLenguage>
    Then he would see the <expectedWord> in the screen

    Examples: 
      | word    | sourceLenguage | targetLenguage | expectedWord   |
      | asu     | Javanes        | Espanol        | perro          |
      | feature | Ingles         | Espanol        | característica |
