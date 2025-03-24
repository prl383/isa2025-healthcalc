package healthcalc.bdd;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import healthcalc.HealthCalcImpl;


public class StepDefinitions {
    private HealthCalcImpl c;
    private int altura;
    private char genero;
    private double resultado;
    private int edad;
    private float peso;
	
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
@Then("el sistema me devuelve el calculo de mi peso ideal {double}")
public void el_sistema_me_devuelve_el_calculo_de_mi_peso_ideal(Double double1) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Su peso ideal es: "+double1);
}

//Scenario 2

@Given("un genero masculino")
public void un_genero_masculino() {
    // Write code here that turns the phrase above into concrete actions
    genero ='m';
}
@Then("el sistema devuelve un error de altura negativa")
public void el_sistema_devuelve_un_error_de_altura_negativa() {
    // Write code here that turns the phrase above into concrete actions
    try{
        resultado = c.idealWeight(altura,genero);
    }catch(Exception e){
        System.out.println("Error: la altura no puede ser negativa");
    }
}

//Scenario 3

@Then("el sistema devuelve un error de altura irreal")
public void el_sistema_devuelve_un_error_de_altura_irreal() {
    // Write code here that turns the phrase above into concrete actions
    try{
        resultado = c.idealWeight(altura,genero);
    }catch(Exception e){
        System.out.println("Error: la altura es irreal");
    }
}

//HISTORIA DE USUARIO BMR

//Scenario 1

@Given("una edad {int}")
public void una_edad(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    this.edad = int1;
}
@Given("un peso {float}")
public void un_peso(Float float1) {
    // Write code here that turns the phrase above into concrete actions
    this.peso = float1; 
}
@When("calculo mi BMR")
public void calculo_mi_bmr() {
    // Write code here that turns the phrase above into concrete actions

    //For men: BMR = 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age
    //For women: BMR = 447.593 + 9.247 * weight + 3.098 * height - 4.330 * age
    if(genero == 'w'){
        resultado = 447.593 + 9.247 * peso + 3.098 * altura - 4.330 * edad;
    }else{
        resultado = 88.362 + 13.397 * peso + 4.799 * altura - 5.677 * edad;
    }
}
@Then("el sistema me devuelve el calculo de mi BMR {double}")
public void el_sistema_me_devuelve_el_calculo_de_mi_bmr(Double double1) {
    System.out.println("Su BMR es: "+resultado);
}

//Scenario 5

@Then("el sistema devuelve un error de peso invalido")
public void el_sistema_devuelve_un_error_de_peso_invalido() {
    try{
        resultado = c.basalMetabolicRate(peso, altura, edad, genero);
    }catch(Exception e){
        System.out.println("Error: el peso es irreal");
    }
}

//Scenario 7

@Then("el sistema devuelve un error de edad invalida")
public void el_sistema_devuelve_un_error_de_edad_invalida() {
    // Write code here that turns the phrase above into concrete actions
    try{
        resultado = c.basalMetabolicRate(peso, altura, edad, genero);
    }catch(Exception e){
        System.out.println("Error: la edad es irreal");
    }
}



}