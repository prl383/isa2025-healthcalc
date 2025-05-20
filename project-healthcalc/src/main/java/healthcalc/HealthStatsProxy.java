package healthcalc;

import java.util.ArrayList;
import java.util.List;

public class HealthStatsProxy implements HealthStats, HealthCalc {

    private final HealthCalc calc;

    public HealthStatsProxy(HealthCalc calc) {
        this.calc = calc;
    }

    private final List<Float> weights = new ArrayList<>();
    private final List<Float> bmrResults = new ArrayList<>();
    private int usageCount = 0;

    
    @Override
    public float idealWeight(Person person) {
        try {
            float result = calc.idealWeight(person);
            usageCount++;
            return result;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public float basalMetabolicRate(Person person) {
        try {
            float result = calc.basalMetabolicRate(person);
            weights.add(person.weight());
            bmrResults.add(result);
            usageCount++;
            return result;
        } catch (Exception e) {
            return -1;
        }
    }

    
    public float idealWeight(int height, char gender) {
        Person person = new BasicPerson(0f, height, 30, mapGender(gender)); // peso y edad de ejemplo
        return idealWeight(person);
    }

    public float basalMetabolicRate(float weight, int height, int age, char gender) {
        Person person = new BasicPerson(weight, height, age, mapGender(gender));
        return basalMetabolicRate(person);
    }

    
    @Override
    public float getAvgWeight() {
        return (float) weights.stream().mapToDouble(Float::doubleValue).average().orElse(0);
    }

    @Override
    public float getAvgBMR() {
        return (float) bmrResults.stream().mapToDouble(Float::doubleValue).average().orElse(0);
    }

    @Override
    public int getUsageCount() {
        return usageCount;
    }

    
    private Gender mapGender(char gender) {
        if (gender == 'm') return Gender.MALE;
        if (gender == 'w') return Gender.FEMALE;
        throw new IllegalArgumentException("Género no válido: " + gender);
    }
}
