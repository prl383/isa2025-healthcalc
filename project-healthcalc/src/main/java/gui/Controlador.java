package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import healthcalc.HealthCalcImpl;




public class Controlador implements ActionListener {
	
	private HealthCalcImpl modelo;
	private Vista vista;
	
	public Controlador(HealthCalcImpl modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if(comando.equals("CALCULAR PI")) {
			int a = vista.getAlturaPI();
			char g = vista.getGeneroPI();
			System.out.print(a);
			System.out.print(g);
			
			try {
				float resultado = modelo.idealWeight(a,g);	
				System.out.println(resultado);
				vista.setResutadoPI(resultado);
				
			} catch (IllegalArgumentException error) {
				System.out.println("Introduce parámetros válidos.");
			}
		}else if(comando.equals("CALCULAR BMR")) {
			int a = vista.getAlturaBMR();
			float p = vista.getPesoBMR();
			int e1 = vista.getEdad();
			char g = vista.getGeneroBMR();
			try {
				float resultado = modelo.basalMetabolicRate(p,a,e1,g);	
				vista.setResutadoBMR(resultado);
			} catch (IllegalArgumentException error) {
				System.out.println("Introduce parámetros válidos.");
			}
		}
	}

}
