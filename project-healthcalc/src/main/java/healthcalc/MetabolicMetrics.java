package healthcalc;

public class MetabolicMetrics {
    public float basalMetabolicRate(Person person) {
        float weight = person.weight();
        float height = person.height();
        int age = person.age();

        if (weight < 10 || weight > 190) {
            throw new IllegalArgumentException("Error: el peso es irreal.");
        }
        if (height < 50 || height > 250) {
            throw new IllegalArgumentException("Error: la altura es irreal.");
        }
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Error: la edad es irreal.");
        }

        if (person.gender() == Gender.FEMALE) {
            return 447.593f + (9.247f * weight) + (3.098f * height) - (4.330f * age);
        } else {
            return 88.362f + (13.397f * weight) + (4.799f * height) - (5.677f * age); 
        }
    }
}
