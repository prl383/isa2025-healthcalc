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
Feature: BMR
  Como usuario que desea controlar su salud, quiero calcular mi BMR para entender mi gasto calorico diario y ajustar mi dieta en consecuencia

  @tag1
  Scenario: Calcular el BMR femenino
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero femenino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema me devuelve el calculo de mi BMR <value>

    Examples: 
      | n   | edad | peso | value       |
      | 160 |  25  |  55  | 1343.6079   |
      | 165 |  30  |  60  | 1383.683    |
      | 170 |  35  |  70  | 1469.9929   |
      | 175 |  40  |  80  | 1556.3031   |

    @tag2
  Scenario: Calcular el BMR masculino
    Given tengo una healthcalc 
    And ingreso una altura <n> 
    And un genero masculino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema me devuelve el calculo de mi BMR <value>

    Examples: 
      | n   | edad | peso | value      |
      | 170 |  25  |  70  | 1700.057   |
      | 175 |  30  |  80  | 1829.637   |
      | 180 |  35  |  87  | 1919.0261  |
      | 190 |  40  |  98  | 2085.998   |
  
  @tag3
  Scenario Outline: Altura irreal femenina
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero femenino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de altura irreal

    Examples: 
      | n   | edad | peso |
      | -10 |  25  |  55  |
      | 500 |  30  |  80  |

  @tag4
  Scenario Outline: Altura irreal masculina
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero masculino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de altura irreal

    Examples: 
      | n   | edad | peso |
      | -10 |  25  |  55  |
      | 500 |  30  |  80  |
 
  @tag5
  Scenario Outline: Peso irreal masculino
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero masculino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de peso invalido

    Examples: 
      | n   | edad | peso  |
      | 160 |  25  |  -10  |
      | 170 |  30  |  500  |

  @tag6
  Scenario Outline: Peso irreal femenino
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero femenino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de peso invalido

    Examples: 
      | n   | edad | peso  |
      | 160 |  25  |  -10  |
      | 170 |  30  |  500  |

  @tag7
  Scenario Outline: Edad irreal femenina
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero femenino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de edad invalida

    Examples: 
      | n   | edad  | peso |
      | 160 |  -5   |  55  |
      | 175 |  200  |  80  |   

 @tag8
  Scenario Outline: Edad irreal masculina
    Given tengo una healthcalc 
    And ingreso una altura <n>
    And un genero masculino
    And una edad <edad>
    And un peso <peso>
    When calculo mi BMR
    Then el sistema devuelve un error de edad invalida

    Examples: 
      | n   | edad  | peso |
      | 160 |  -5   |  55  |
      | 175 |  200  |  80  |   