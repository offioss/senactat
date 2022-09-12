package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

public class ConvertFahrenheit extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCelsius;
	private JTextField txtFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertFahrenheit dialog = new ConvertFahrenheit();
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
	public ConvertFahrenheit() {
		setTitle("Conversor de Temperatura");
		setBounds(100, 100, 315, 259);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Celsius para Fahrenheit ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(65, 11, 172, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Celsius");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(29, 82, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fahrenheit");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(21, 148, 72, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtCelsius = new JTextField();
		txtCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelsius.setBounds(108, 79, 86, 20);
		getContentPane().add(txtCelsius);
		txtCelsius.setColumns(10);
		
		txtFahrenheit = new JTextField();
		txtFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		txtFahrenheit.setEnabled(false);
		txtFahrenheit.setBounds(108, 145, 86, 20);
		getContentPane().add(txtFahrenheit);
		txtFahrenheit.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setIcon(new ImageIcon(ConvertFahrenheit.class.getResource("/img/fahrenheit.png")));
		btnNewButton.setToolTipText("Converter");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(204, 78, 64, 64);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ConvertFahrenheit.class.getResource("/img/eraser.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(225, 148, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		// Uso da Biblioteca Atxy2k
		RestrictedTextField validar = new RestrictedTextField(txtCelsius, "0123456789.");
		validar.setLimit(6);

	} // Fim do Construtor
	
	void calcular() {
		// validação
		if (txtCelsius.getText().isEmpty()) {
		} else {
			
			// Declaração de variaveis
			double celsius, fahrenheit;
			
			// entrada
			celsius = Double.parseDouble(txtCelsius.getText());
			
			// processamento
			
			fahrenheit = 1.8 * celsius + 32;
			fahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
			
			// saida
			txtFahrenheit.setText(String.valueOf(fahrenheit));
			
		}
	} // fim do metodo calcular
	
	// metodo para limpar
	
	void limpar() {
		txtFahrenheit.setText(null);
		txtCelsius.setText(null);
		txtCelsius.requestFocus();
	} 

} // Fim do programa
