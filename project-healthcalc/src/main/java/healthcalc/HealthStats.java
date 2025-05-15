package healthcalc;


public interface HealthStats {
    float basalMetabolicRate(float weight, int height, int age, char gender);
    float idealWeight(int height, char gender);
    float getAvgWeight();
    float getAvgBMR();
    int getUsageCount();
}
