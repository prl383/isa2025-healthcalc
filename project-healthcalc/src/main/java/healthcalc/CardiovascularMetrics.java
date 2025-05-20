package healthcalc;

public class CardiovascularMetrics {
    public float getIdealBodyWeight(Person person) {
        float height = person.height();
        if (height < 50 || height > 250) {
            throw new IllegalArgumentException("Error: la altura es irreal.");
        }

        if (person.gender() == Gender.FEMALE) {
            return height - 100 - (height - 150) / 2.5f;
        } else {
            return height - 100 - (height - 150) / 4.0f;
        }
    }
}
