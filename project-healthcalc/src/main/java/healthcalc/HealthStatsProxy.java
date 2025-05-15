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
    public float basalMetabolicRate(float weight, int height, int age, char gender) {
        try {
            float result = calc.basalMetabolicRate(weight, height, age, gender);
            weights.add(weight);
            bmrResults.add(result);
            usageCount++;
            return result;
        } catch (Exception e) {
            
            return -1; 
        }
    }

    @Override
    public float idealWeight(int height, char gender) {
        try {
            float result = calc.idealWeight(height, gender);
            usageCount++;
            return result;
        } catch (Exception e) {
            
            return -1;  
        }
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
}
