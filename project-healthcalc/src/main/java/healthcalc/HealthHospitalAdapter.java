package healthcalc;

public class HealthHospitalAdapter implements HealthHospital {

    private final HealthCalc calc;

    public HealthHospitalAdapter(HealthCalc calc) {
        this.calc = calc;
    }

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
        float alturaCm = alturaMetros * 100;
        float pesoKg = pesoGramos / 1000.0f;

        try {
            Person person = new BasicPerson(pesoKg, alturaCm, edad, mapGender(genero));
            return calc.basalMetabolicRate(person);
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public int pesoIdeal(char genero, float alturaMetros) {
        float alturaCm = alturaMetros * 100;

        try {
            Person person = new BasicPerson(0, alturaCm, 30, mapGender(genero)); // peso/edad dummy
            return Math.round(calc.idealWeight(person));
        } catch (Exception e) {
            return -1;
        }
    }

    private Gender mapGender(char genderChar) {
        if (genderChar == 'm') return Gender.MALE;
        if (genderChar == 'w') return Gender.FEMALE;
        throw new IllegalArgumentException("Género no válido: " + genderChar);
    }
}
