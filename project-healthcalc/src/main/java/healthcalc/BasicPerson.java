package healthcalc;

public class BasicPerson implements Person {
    private float weight;
    private float height;
    private int age;
    private Gender gender;

    public BasicPerson(float weight, float height, int age, Gender gender) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    public float weight() { return weight; }
    public float height() { return height; }
    public int age() { return age; }
    public Gender gender() { return gender; }
}
