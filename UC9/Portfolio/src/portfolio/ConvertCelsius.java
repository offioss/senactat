package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConvertCelsius extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFahrenheit;
	private JTextField txtCelsius;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertCelsius dialog = new ConvertCelsius();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConvertCelsius() {
		setTitle("Conversao de Temperatura");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setBounds(33, 71, 69, 14);
		getContentPane().add(lblNewLabel);
		
		txtFahrenheit = new JTextField();
		txtFahrenheit.setBounds(112, 68, 86, 20);
		getContentPane().add(txtFahrenheit);
		txtFahrenheit.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setBounds(56, 132, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtCelsius = new JTextField();
		txtCelsius.setEditable(false);
		txtCelsius.setBounds(112, 129, 312, 20);
		getContentPane().add(txtCelsius);
		txtCelsius.setColumns(10);
		
		btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(314, 227, 110, 23);
		getContentPane().add(btnNewButton);

	}// Fim do Construtor
	
	void calcular() {
		
		// variaveis
		
		double fahrenheit, celsius;
		
		// entrada
		
		fahrenheit = Double.parseDouble(txtFahrenheit.getText());
		
		// processamento
		
		celsius = (5 * (fahrenheit - 32)) / 9;
		
		// saida
		
		txtCelsius.setText(String.valueOf(celsius));
	
	}
}
