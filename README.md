# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

# Casos de prueba para HealthCalc P1

### Casos de prueba para el metodo idealWeight

1. `height` no puede ser **0 o negativo** → Debe lanzar una excepcion.  
2. `height` debe estar en **centimetros**.  
3. `gender` solo puede ser **'m'** o **'w'** → Si se introduce otro carater, debe lanzar una excepcion.  
4. El resultado **debe ser positivo** y estar en **kg**.
5. Alturas **muy bajas y muy altas**: `50 cm` vs. `250 cm`.  
6. Genero en **minuscula** (`'m'`, `'w'`).  
7. Valores **con decimales** en la altura (`175.5 cm`).  
8. **Entrada de datos incorrecta**: `null`, valores vacios o caracteres en la altura.  
  
### Casos de prueba para el metodo basalMetabolicRate

1. `weight` no puede ser **0 o negativo** → Debe lanzar una excepcion.  
2. `weight` debe estar en **kg**.  
3. `height` debe estar en **cm**.  
4. `age` no puede ser **negativo, cero o un numero demasiado alto** (`>100 años`).  
5. `gender` solo puede ser **'m'** o **'w'** → Si es diferente, debe lanzar una excepcion.  
6. El resultado **no debe ser negativo ni cero**.  
7. Valores **extremos** de peso (`30 kg`, `300 kg`).  
8. Valores con **decimales** en peso (`65.7 kg`) y edad (`25.5 años`).  
9.  Valores **no numericos o vacios** en cualquier parametro.  



# Práctica 3

## Caso de uso: Peso Ideal

**Como usuario que desea controlar su salud, quiero calcular mi peso ideal ajustar mi dieta en consecuencia.**

### Escenario 1: Calcular el peso ideal femenino

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género femenino  
**When** calculo mi peso ideal  
**Then** el sistema me devuelve el cálculo de mi peso ideal `<value>`  

**Ejemplos:**

| n   | value  |
|-----|--------|
| 150 | 50.0   |
| 160 | 56.84  |
| 165 | 59.0   |
| 170 | 62.0   |
| 175 | 65.0   |

### Escenario 2: Calcular el peso ideal masculino

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género masculino  
**When** calculo mi peso ideal  
**Then** el sistema me devuelve el cálculo de mi peso ideal `<value>`  

**Ejemplos:**

| n   | value  |
|-----|--------|
| 170 | 65     |
| 185 | 76.25  |
| 190 | 80     |
| 195 | 83.75  |

### Escenario 3: Altura negativa masculina

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género masculino  
**When** calculo mi peso ideal  
**Then** el sistema devuelve un error de altura negativa  

**Ejemplos:**

| n   |
|-----|
| -10 |
| -20 |
| -30 |
| -40 |
| -50 |
| -60 |

### Escenario 4: Altura negativa femenina

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género femenino  
**When** calculo mi peso ideal  
**Then** el sistema devuelve un error de altura negativa  

**Ejemplos:**

| n   |
|-----|
| -10 |
| -20 |
| -30 |
| -40 |
| -50 |
| -60 |

### Escenario 5: Altura irreal masculina
  **Given** tengo una healthcalc
  **And** ingreso una altura `<n>` 
  **And** un genero masculino
  **When** calculo mi peso ideal
  **Then** el sistema devuelve un error de altura irreal
   
**Ejemplos:** 
| n   |
|-----|
| 10  |
| 20  |
| 30  |
| 250 |
| 300 |
| 350 |

### Escenario 6: Altura irreal femenina
  **Given** tengo una healthcalc
  **And** ingreso una altura `<n>` 
  **And** un genero femenino
  **When** calculo mi peso ideal
  **Then** el sistema devuelve un error de altura irreal
   
 **Ejemplos:** 
| n   |
|-----|
| 10  |
| 20  |
| 30  |
| 250 |
| 300 |
| 350 |

## Caso de uso: Calcular Tasa Metabólica Basal (BMR)

**Como usuario que desea controlar su salud, quiero calcular mi BMR para entender mi gasto calórico diario y ajustar mi dieta en consecuencia.**

### Escenario 1: Calcular el BMR femenino

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género femenino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema me devuelve el cálculo de mi BMR `<value>`  

**Ejemplos:**

| n   | edad | peso | value      |
|-----|------|------|------------|
| 160 |  25  |  55  | 1343.6079  |
| 165 |  30  |  60  | 1383.683   |
| 170 |  35  |  70  | 1469.9929  |
| 175 |  40  |  80  | 1556.3031  |

### Escenario 2: Calcular el BMR masculino

**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un género masculino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema me devuelve el cálculo de mi BMR `<value>`  

**Ejemplos:**

| n   | edad | peso | value      |
|-----|------|------|------------|
| 170 |  25  |  70  | 1700.057   |
| 175 |  30  |  80  | 1829.637   |
| 180 |  35  |  87  | 1919.0261  |
| 190 |  40  |  98  | 2085.998   |


### Escenario 3: Altura irreal femenina
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero femenino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de altura irreal 

**Ejemplos:**

| n   | edad | peso |
|-----|------|------|
| -10 |  25  |  55  |
| 500 |  30  |  80  |

### Escenario 4: Altura irreal masculina
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero masculino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de altura irreal 

**Ejemplos:**

| n   | edad | peso |
|-----|------|------|
| -10 |  25  |  55  |
| 500 |  30  |  80  |

### Escenario 5: Peso irreal masculino
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero masculino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de peso inválido 

**Ejemplos:**

| n   | edad | peso  |
|-----|------|-------|
| 160 |  25  |  -10  |
| 170 |  30  |  500  |

### Escenario 6: Peso irreal femenino
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero femenino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de peso inválido 

**Ejemplos:**

| n   | edad | peso  |
|-----|------|-------|
| 160 |  25  |  -10  |
| 170 |  30  |  500  |

### Escenario 7: Edad irreal femenina
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero femenino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de edad inválida 

**Ejemplos:**

| n   | edad  | peso |
|-----|-------|------|
| 160 |  -5   |  55  |
| 175 |  200  |  80  |  

### Escenario 8: Edad irreal masculina
**Given** tengo una healthcalc  
**And** ingreso una altura `<n>`  
**And** un genero masculino  
**And** una edad `<edad>`  
**And** un peso `<peso>`  
**When** calculo mi BMR  
**Then** el sistema devuelve un error de edad inválida 

**Ejemplos:**

| n   | edad  | peso |
|-----|-------|------|
| 160 |  -5   |  55  |
| 175 |  200  |  80  |   