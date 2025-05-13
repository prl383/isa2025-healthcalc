package healthcalc;

public class Main {
    public static void main(String[] args) throws Exception{
        HealthCalc c = HealthCalcImpl.getInstance();
        //float cal = c.idealWeight(195, 'm') ;
        //System.out.println(cal);          
        float cal2 = c.basalMetabolicRate(98, 190, 40, 'm');
        System.out.println(cal2); 
    }
}

