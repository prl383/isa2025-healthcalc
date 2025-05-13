package healthcalc;

public class Main {
    public static void main(String[] args) throws Exception{
        HealthCalc c = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthHospitalAdapter();
        //float cal = c.idealWeight(195, 'm') ;
        //System.out.println(cal);          
        
        float cal2 = c.basalMetabolicRate(98, 190, 40, 'm');
        System.out.println(cal2); 
        
        System.out.println("BMR adaptado: " + adapter.bmr('m', 40, 1.90f, 98000));
        System.out.println("Peso ideal adaptado: " + adapter.pesoIdeal('m', 1.90f));

    }
}

