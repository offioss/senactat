package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

public class ConvertCelsius extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFahrenheit;
	private JTextField txtCelsius;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;

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
		setTitle("Conversor de Temperatura");
		setBounds(100, 100, 314, 268);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(33, 71, 69, 14);
		getContentPane().add(lblNewLabel);
		
		txtFahrenheit = new JTextField();
		txtFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		txtFahrenheit.setBounds(112, 68, 86, 20);
		getContentPane().add(txtFahrenheit);
		txtFahrenheit.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(33, 132, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtCelsius = new JTextField();
		txtCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelsius.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCelsius.setEditable(false);
		txtCelsius.setBounds(112, 129, 86, 20);
		getContentPane().add(txtCelsius);
		txtCelsius.setColumns(10);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ConvertCelsius.class.getResource("/img/celsius.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setToolTipText("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(208, 82, 64, 64);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ConvertCelsius.class.getResource("/img/eraser.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBounds(122, 160, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("FAHRENHEIT PARA CELSIUS");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(53, 11, 200, 32);
		getContentPane().add(lblNewLabel_2);
		
		// Uso da Biblioteca Atxy2k
				RestrictedTextField validar = new RestrictedTextField(txtFahrenheit, "0123456789.");
				validar.setLimit(6);

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
	
	/**
 	 * Metodo usado para limpar os campos
 	 */
 	void limpar() {
 		txtFahrenheit.setText(null);
 		txtCelsius.setText(null);
 	}
}
