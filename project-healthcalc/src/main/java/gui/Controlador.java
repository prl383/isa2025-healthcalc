package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import healthcalc.BasicPerson;
import healthcalc.Gender;
import healthcalc.HealthCalc;
import healthcalc.Person;

public class Controlador implements ActionListener {

    private HealthCalc modelo;
    private Vista vista;

    public Controlador(HealthCalc modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("CALCULAR PI")) {
            int altura = vista.getAlturaPI();
            char generoChar = vista.getGeneroPI();

            try {
                Gender genero = (generoChar == 'm') ? Gender.MALE : Gender.FEMALE;
                Person persona = new BasicPerson(0, altura, 0, genero); // peso y edad no son necesarios para PI

                float resultado = modelo.idealWeight(persona);
                vista.setResutadoPI(resultado);

            } catch (IllegalArgumentException error) {
                System.out.println("Introduce parámetros válidos.");
            }

        } else if (comando.equals("CALCULAR BMR")) {
            int altura = vista.getAlturaBMR();
            float peso = vista.getPesoBMR();
            int edad = vista.getEdad();
            char generoChar = vista.getGeneroBMR();

            try {
                Gender genero = (generoChar == 'm') ? Gender.MALE : Gender.FEMALE;
                Person persona = new BasicPerson(peso, altura, edad, genero);

                float resultado = modelo.basalMetabolicRate(persona);
                vista.setResutadoBMR(resultado);

            } catch (IllegalArgumentException error) {
                System.out.println("Introduce parámetros válidos.");
            }
        }
    }
}
