package healthcalc.bdd;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;


public class StepDefinitions {
    private HealthCalcImpl c;
    private int altura;
    private char genero;
    private double resultado;
	
@Given("tengo una healthcalc")
public void tengo_una_healthcalc() {
    // Write code here that turns the phrase above into concrete actions
    c = new HealthCalcImpl();
    
}
@Given("ingreso una altura {int}")
public void ingreso_una_altura(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    altura = int1;
}
@Given("un genero femenino")
public void un_genero_femenino() {
    // Write code here that turns the phrase above into concrete actions
    genero = 'w';
}
@When("calculo mi peso ideal")
public void calculo_mi_peso_ideal() {
    // Write code here that turns the phrase above into concrete actions
    // For women: IW = height - 100 - (height - 150) / 2.5)
    if (genero == 'w') {
        resultado = altura - 100 - ((altura - 150) / 2.5); 
    } else {
        //For men: IW = height - 100 - (height - 150) / 4)
        resultado = altura - 100 - ((altura - 150) / 4); 
    }

}
@Then("el sistema me devuelve el calculo de mi peso ideal")
public void el_sistema_me_devuelve_el_calculo_de_mi_peso_ideal() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Su peso ideal es: "+resultado);
}

}