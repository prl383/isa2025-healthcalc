package healthcalc;

public class SpanishMessageDecorator extends HospitalDecorator {

    public SpanishMessageDecorator(HealthHospital hospital) {
        super(hospital);
    }

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
        double bmr = hospital.bmr(genero, edad, alturaMetros, pesoGramos);
        float pesoKg = pesoGramos / 1000f;
        System.out.printf("ES: La persona con altura %.2f metros y %.0f Kg tiene un BMR de %.2f.%n",
                alturaMetros, pesoKg, bmr);
        return bmr;
    }
}
