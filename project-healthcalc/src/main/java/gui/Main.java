package gui;

import java.awt.EventQueue;

import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;
import gui.Vista;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl c = HealthCalcImpl.getInstance();
					Vista vista = new Vista();
					Controlador controlador = new Controlador(c, vista);
					vista.registrarControlador(controlador);
					
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
