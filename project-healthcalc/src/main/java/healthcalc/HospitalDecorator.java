package healthcalc;    

public abstract class HospitalDecorator implements HealthHospital {
    protected final HealthHospital hospital;

    public HospitalDecorator(HealthHospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public int pesoIdeal(char genero, float alturaMetros) {
        return hospital.pesoIdeal(genero, alturaMetros);
    }

    @Override
    public double bmr(char genero, int edad, float alturaMetros, int pesoGramos) {
        return hospital.bmr(genero, edad, alturaMetros, pesoGramos);
    }
}
