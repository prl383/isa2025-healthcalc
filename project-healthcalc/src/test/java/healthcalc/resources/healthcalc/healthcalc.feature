#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Peso Ideal
  Como usuario quiero calcular mi peso ideal por temas de salud

  @tag1
  Scenario: Calcular el peso ideal
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero femenino
    When calculo mi peso ideal
    Then el sistema me devuelve el calculo de mi peso ideal

    Examples: 
      | n | value |
      | 150 | 50.0 |
      | 160 | 56.84 |
      | 165 | 59.0 |
      | 170 | 62.0 |
      | 175 | 65.0 |
      
    
  
      
