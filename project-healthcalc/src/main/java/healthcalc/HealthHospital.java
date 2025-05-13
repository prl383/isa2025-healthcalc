package healthcalc;

public interface HealthHospital {
    double bmr(char genero, int edad, float alturaMetros, int pesoGramos);
    int pesoIdeal(char genero, float alturaMetros);
}
