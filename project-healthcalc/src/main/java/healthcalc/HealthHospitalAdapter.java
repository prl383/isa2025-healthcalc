package healthcalc;

public class HealthHospitalAdapter implements HealthHospital {
     
    //hacer el constructor que le pase la calculadora (flecha blanca)
    private final HealthCalcImpl calc;
    public HealthHospitalAdapter(HealthCalcImpl calc) {
        this.calc = calc;
    }
    

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
        float alturaCm = alturaMetros * 100;
        float pesoKg = pesoGramos / 1000.0f;
        return calc.basalMetabolicRate(pesoKg, (int) alturaCm, edad, genero);
    }

    @Override
    public int pesoIdeal(char genero, float alturaMetros) {
        float alturaCm = alturaMetros * 100;
        return Math.round(calc.idealWeight((int) alturaCm, genero));
    }
    
}
