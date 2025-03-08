package healthcalc;

public class HealthCalcImpl implements HealthCalc{

    public float idealWeight(int height, char gender){
        float idealWeight = 0;
        
    
        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }
        if (height < 50 || height > 250) {
            throw new IllegalArgumentException("Error: la altura es irreal.");
        }
        if (gender != 'm' && gender != 'w') {
            throw new IllegalArgumentException("El género introducido no es válido.");
        }
        if (gender == 'w') {  
            idealWeight = height - 100 - (height - 150) / 2.5f;
        } else if (gender == 'm') {  
            idealWeight = height - 100 - (height - 150) / 4.0f;
        }
        return idealWeight;
    }
    public float basalMetabolicRate(float weight, int height, int age, char gender) {
        float bmr = 0;

        
        if (weight <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0.");
        }
        if (weight < 10 || weight > 190) {
            throw new IllegalArgumentException("Error: el peso es irreal.");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }
        if (height < 50 || height > 250) {
            throw new IllegalArgumentException("Error: la altura es irreal.");
        }
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Error: la edad es irreal.");
        }
        if (gender != 'm' && gender != 'w') {
            throw new IllegalArgumentException("El género introducido no es válido.");
        }
        if (gender == 'w') {  
            bmr = 447.593f + (9.247f * weight) + (3.098f * height) - (4.330f * age);
        } else if (gender == 'm') {  
            bmr = 88.362f + (13.397f * weight) + (4.799f * height) - (5.677f * age); 
        }

        return bmr;
    }
}
