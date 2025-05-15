package healthcalc;

public class AmericanUnitsDecorator extends HospitalDecorator {

    public AmericanUnitsDecorator(HealthHospital hospital) {
        super(hospital);
    }

    @Override
    public double bmr(char genero, int edad, float alturaFeet, int pesoLbs) {
        float alturaMetros = alturaFeet * 0.3048f;
        int pesoGramos = (int) (pesoLbs / 2.20462f * 1000);
        return hospital.bmr(genero, edad, alturaMetros, pesoGramos);
    }

    @Override
    public int pesoIdeal(char genero, float alturaFeet) {
        float alturaMetros = alturaFeet * 0.3048f;
        return hospital.pesoIdeal(genero, alturaMetros);
    }
}
