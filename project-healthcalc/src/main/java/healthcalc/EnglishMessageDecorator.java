package healthcalc;

public class EnglishMessageDecorator extends HospitalDecorator {

    public EnglishMessageDecorator(HealthHospital hospital) {
        super(hospital);
    }

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
        double bmr = hospital.bmr(genero, edad, alturaMetros, pesoGramos);
        float pesoKg = pesoGramos / 1000f;
        System.out.printf("EN: The person with height %.2f meters and %.0f Kg has a BMR of %.2f.%n",
                alturaMetros, pesoKg, bmr);
        return bmr;
    }
}
