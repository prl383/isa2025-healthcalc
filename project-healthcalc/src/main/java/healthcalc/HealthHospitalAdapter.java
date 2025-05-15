package healthcalc;

public class HealthHospitalAdapter implements HealthHospital {
     
    //hacer el constructor que le pase la calculadora (flecha blanca)
    private final HealthCalc calc;
    public HealthHospitalAdapter(HealthCalc calc) {
        this.calc = calc;
    }
    

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
    float alturaCm = alturaMetros * 100;
    float pesoKg = pesoGramos / 1000.0f;
    try {
        return calc.basalMetabolicRate(pesoKg, (int) alturaCm, edad, genero);
    } catch (Exception e) {       
        return -1; 
    }
}

    public int pesoIdeal(char genero, float alturaMetros) {
    float alturaCm = alturaMetros * 100;
    try {
        return Math.round(calc.idealWeight((int) alturaCm, genero));
    } catch (Exception e) {
        return -1;
        }
    }
}
