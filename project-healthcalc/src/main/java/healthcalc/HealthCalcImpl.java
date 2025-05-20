package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    private static HealthCalcImpl instance;
    private final CardiovascularMetrics cardio;
    private final MetabolicMetrics metabolic;

    private HealthCalcImpl() {
        cardio = new CardiovascularMetrics();
        metabolic = new MetabolicMetrics();
    }

    public static HealthCalcImpl getInstance() {
        if (instance == null) {
            instance = new HealthCalcImpl();
        }
        return instance;
    }

    public float idealWeight(Person person) {
        return cardio.getIdealBodyWeight(person);
    }

    public float basalMetabolicRate(Person person) {
        return metabolic.basalMetabolicRate(person);
    }
}
