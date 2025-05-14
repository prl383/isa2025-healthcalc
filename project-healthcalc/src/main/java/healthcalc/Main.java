package healthcalc;

public class Main {
    public static void main(String[] args) throws Exception{
        HealthCalcImpl c = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthHospitalAdapter(c);
        //HealthStats statsProxy = new HealthStatsProxy(adapter);
        //float cal = c.idealWeight(195, 'm') ;
        //System.out.println(cal);          
        
        //float cal2 = c.basalMetabolicRate(98, 190, 40, 'm');
        double cal2 = adapter.bmr('m', 40, 1.90f, 98000);

        System.out.println(cal2); 

    }
}

