package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfAlturaPI;
	private JTextField tfPesoBMR;
	private JTextField tfEdad;
	private JTextField tfAlturaBMR;
	private JTextField tfResultadoBMR;
	private JTextField tfResultadoPI;
	private JComboBox cbGeneroBMR;
    private JComboBox cbGeneroPI;
    private JButton btnCalcularPI;
    private JButton btnCalcularBMR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPI = new JPanel();
		contentPane.add(panelPI, BorderLayout.WEST);
		panelPI.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panelTituloPI = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTituloPI.getLayout();
		panelPI.add(panelTituloPI);
		
		JLabel lbPI = new JLabel("CALCULAR PESO IDEAL (PI)");
		panelTituloPI.add(lbPI);
		
		JPanel panelPeso = new JPanel();
		panelPI.add(panelPeso);
		
		JLabel lbAlturaPI = new JLabel("ALTURA");
		lbAlturaPI.setHorizontalAlignment(SwingConstants.LEFT);
		panelPeso.add(lbAlturaPI);
		
		tfAlturaPI = new JTextField();
		tfAlturaPI.setHorizontalAlignment(SwingConstants.RIGHT);
		tfAlturaPI.setColumns(10);
		panelPeso.add(tfAlturaPI);
		
		JPanel panelGenero = new JPanel();
		panelPI.add(panelGenero);
		
		JLabel lbGenero_PI = new JLabel("GENERO");
		lbGenero_PI.setHorizontalAlignment(SwingConstants.LEFT);
		panelGenero.add(lbGenero_PI);
		
		cbGeneroPI = new JComboBox();
		panelGenero.add(cbGeneroPI);
		
		cbGeneroPI.addItem("MUJER");  
		cbGeneroPI.addItem("HOMBRE");  
		
		JPanel panel = new JPanel();
		panelPI.add(panel);
		
		JPanel panel_1 = new JPanel();
		panelPI.add(panel_1);
		
		JPanel panelCalcular = new JPanel();
		panelPI.add(panelCalcular);
		
		/*/
		 * 
		 */
		btnCalcularPI = new JButton("CALCULAR PI");
		panelCalcular.add(btnCalcularPI);
		
		tfResultadoPI = new JTextField();
		tfResultadoPI.setColumns(10);
		panelCalcular.add(tfResultadoPI);
		
		JPanel panelBMR = new JPanel();
		contentPane.add(panelBMR, BorderLayout.EAST);
		panelBMR.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelBMR.add(panelTitulo);
		
		JLabel lbTituloBMR = new JLabel("CALCULAR TASA METABOLICA BASAL (BMR)");
		panelTitulo.add(lbTituloBMR);
		
		JPanel panelPeso_1 = new JPanel();
		panelBMR.add(panelPeso_1);
		
		JLabel lbPesoPI_1 = new JLabel("PESO");
		lbPesoPI_1.setHorizontalAlignment(SwingConstants.LEFT);
		panelPeso_1.add(lbPesoPI_1);
		
		tfPesoBMR = new JTextField();
		tfPesoBMR.setHorizontalAlignment(SwingConstants.RIGHT);
		tfPesoBMR.setColumns(10);
		panelPeso_1.add(tfPesoBMR);
		
		JPanel panelGenero_1 = new JPanel();
		panelBMR.add(panelGenero_1);
		
		JLabel lbGenero_PI_1 = new JLabel("GENERO");
		lbGenero_PI_1.setHorizontalAlignment(SwingConstants.LEFT);
		panelGenero_1.add(lbGenero_PI_1);
		
		cbGeneroBMR = new JComboBox();
		panelGenero_1.add(cbGeneroBMR);
		
		cbGeneroBMR.addItem("MUJER");  
		cbGeneroBMR.addItem("HOMBRE");  
		
		JPanel panelEdad = new JPanel();
		panelBMR.add(panelEdad);
		
		JLabel lbEdadBMR = new JLabel("EDAD");
		panelEdad.add(lbEdadBMR);
		
		tfEdad = new JTextField();
		tfEdad.setColumns(10);
		panelEdad.add(tfEdad);
		
		JPanel panelAltura = new JPanel();
		panelBMR.add(panelAltura);
		
		JLabel lbAlturaBMR = new JLabel("ALTURA");
		panelAltura.add(lbAlturaBMR);
		
		tfAlturaBMR = new JTextField();
		tfAlturaBMR.setColumns(10);
		panelAltura.add(tfAlturaBMR);
		
		JPanel panelCalcular_1 = new JPanel();
		panelBMR.add(panelCalcular_1);
		
		btnCalcularBMR = new JButton("CALCULAR BMR");
		panelCalcular_1.add(btnCalcularBMR);
		
		tfResultadoBMR = new JTextField();
		tfResultadoBMR.setColumns(10);
		panelCalcular_1.add(tfResultadoBMR);
		
		this.pack();
	}

	public int getAlturaBMR() {
		try {
			return Integer.parseInt(tfAlturaBMR.getText());	
		} catch (NumberFormatException e) {
			tfResultadoBMR.setText("Introduce un numero valido.");
			return -1;
		}
	}
	public int getAlturaPI() {
		try {
			return Integer.parseInt(tfAlturaPI.getText());	
		} catch (NumberFormatException e) {
			tfResultadoPI.setText("Introduce un numero valido.");
			return -1;
		}
	}
	public int getPesoBMR() {
		try {
			return Integer.parseInt(tfPesoBMR.getText());	
		} catch (NumberFormatException e) {
			tfResultadoBMR.setText("Introduce un numero valido.");
			return -1;
		}
	}
	public int getEdad() {
		try {
			return Integer.parseInt(tfEdad.getText());	
		} catch (NumberFormatException e) {
			tfResultadoBMR.setText("Introduce un numero valido.");
			return -1;
		}
	}
	/*
	 * a significa un error
	 */
	public char getGeneroBMR() {
		char genero = 'a';
		try {
			if(cbGeneroBMR.getSelectedItem().toString().equals("MUJER")) {
				genero = 'w';
			}else if(cbGeneroBMR.getSelectedItem().toString().equals("HOMBRE")) {
				genero = 'm';
			}
			return genero;	
		} catch (NumberFormatException e) {
			tfResultadoBMR.setText("Introduce un genero valido.");
			return 'a'; 
		}
	}
	/*
	 * a significa un error
	 */
	public char getGeneroPI() {
		char genero = 'a';
		try {
			if(cbGeneroPI.getSelectedItem().toString().equals("MUJER")) {
				genero = 'w';
			}else if(cbGeneroPI.getSelectedItem().toString().equals("HOMBRE")) {
				genero = 'm';
			}
			return genero;	
		} catch (NumberFormatException e) {
			tfResultadoPI.setText("Introduce un genero valido.");
			return 'a';
		}
	}
	
	public void setResutadoPI(float resultado) {
		tfResultadoPI.setText(  resultado +" kg");
	}
	public void setResutadoBMR(float resultado) {
		tfResultadoBMR.setText( resultado + " kcal/day");
	}
	
	public void registrarControlador(ActionListener ctrl) {
		btnCalcularPI.addActionListener(ctrl);
		btnCalcularPI.setActionCommand("CALCULAR PI");
		btnCalcularBMR.addActionListener(ctrl);
		btnCalcularBMR.setActionCommand("CALCULAR BMR");
	}
	
}
