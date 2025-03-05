# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

# PRACTICA 1

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

# PRACTICA 2
### Diagrama de caso de uso modificado  

![Diagrama de caso de uso modificado](doc/diagramaCasoUsoCalc.jpg)