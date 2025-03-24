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
  Como usuario que desea controlar su salud, quiero calcular mi peso ideal ajustar mi dieta en consecuencia

  @tag1
  Scenario: Calcular el peso ideal femenino
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero femenino
    When calculo mi peso ideal
    Then el sistema me devuelve el calculo de mi peso ideal <value>

    Examples: 
      |  n  | value |
      | 150 | 50.0  |
      | 160 | 56.84 |
      | 165 | 59.0  |
      | 170 | 62.0  |
      | 175 | 65.0  |

  @tag2
  Scenario Outline: Calcular el peso ideal masculino
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero masculino
    When calculo mi peso ideal
    Then el sistema me devuelve el calculo de mi peso ideal <value>

    Examples: 
      | n   | value  |
      | 170 |  65    |
      | 185 |  76.25 |
      | 190 |  80    |
      | 195 |  83.75 |    

  @tag3
  Scenario Outline: Altura negativa masculina
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero masculino
    When calculo mi peso ideal
    Then el sistema devuelve un error de altura negativa
   
   	Examples: 
      |  n  | 
      | -10 | 
      | -20 |
      | -30 | 
      | -40 | 
      | -50 | 
      | -60 |
  
  @tag4
  Scenario Outline: Altura negativa femenina
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero femenino
    When calculo mi peso ideal
    Then el sistema devuelve un error de altura negativa
   
   	Examples: 
      |  n  | 
      | -10 | 
      | -20 |
      | -30 | 
      | -40 | 
      | -50 | 
      | -60 |
  
  @tag5
  Scenario Outline: Altura irreal masculina
    Given tengo una healthcalc
    And ingreso una altura <n> 
    And un genero masculino
    When calculo mi peso ideal
    Then el sistema devuelve un error de altura irreal
   
   	Examples: 
      | n   |
      | 10  |
      | 20  |
      | 30  |
      | 250 |
      | 300 |
      | 350 |

  @tag6
  Scenario Outline: Altura irreal femenina
    Given tengo una healthcalc
    And ingreso una altura <n> 
    And un genero femenino
    When calculo mi peso ideal
    Then el sistema devuelve un error de altura irreal
   
   	Examples: 
      | n   |
      | 10  |
      | 20  |
      | 30  |
      | 250 |
      | 300 |
      | 350 |
