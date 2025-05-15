package healthcalc;

public class Main {
    public static void main(String[] args) throws Exception{
        
        HealthCalc originalCalc = HealthCalcImpl.getInstance();

        HealthCalc proxyCalc = new HealthStatsProxy(originalCalc);  
        

        // Creamos el adaptador con el proxy como dependencia
        HealthHospital hospitalCalc = new HealthHospitalAdapter(proxyCalc);
        // Version europea con mensajes en ambos idiomas
        HealthHospital spanish = new SpanishMessageDecorator(hospitalCalc);
        HealthHospital fullMessages = new EnglishMessageDecorator(spanish);

        // Version americana con s
        HealthHospital american = new EnglishMessageDecorator(
                                        new SpanishMessageDecorator(
                                            new AmericanUnitsDecorator(hospitalCalc)));

        System.out.println("Versión europea:");
        fullMessages.bmr('m', 30, 1.83f, 78000);

        System.out.println("\nVersión americana:");
        american.bmr('f', 25, 1.83f, 50000);

        //hospitalCalc como interfaz principal del hospital
        double bmr = hospitalCalc.bmr('m', 40, 1.80f, 80000); 
        int pesoIdeal = hospitalCalc.pesoIdeal('m', 1.80f);

        System.out.println("BMR: " + bmr);
        System.out.println("Peso ideal: " + pesoIdeal + "g");

        // Si queremos ver estadisticas del proxy
        HealthStats stats = (HealthStats) proxyCalc;
        System.out.println("Uso total: " + stats.getUsageCount());
        System.out.println("Peso medio: " + stats.getAvgWeight());
        System.out.println("BMR medio: " + stats.getAvgBMR());
        
    }
}

