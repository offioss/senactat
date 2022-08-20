package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

public class IMC extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC dialog = new IMC();
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
	public IMC() {
		setModal(true);
		setBounds(100, 100, 448, 468);
		getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(163, 59, 46, 14);
		getContentPane().add(lblNewLabel_2);

		txtPeso = new JTextField();
		txtPeso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPeso.setBounds(208, 58, 60, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Altura");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(289, 59, 46, 14);
		getContentPane().add(lblNewLabel_3);

		txtAltura = new JTextField();
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltura.setBounds(339, 58, 60, 20);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setToolTipText("Calculo do IMC");
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(IMC.class.getResource("/img/balance.png")));
		btnCalcular.setBounds(222, 185, 64, 64);
		getContentPane().add(btnCalcular);

		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(222, 129, 113, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Seu IMC é:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(238, 114, 86, 14);
		getContentPane().add(lblNewLabel_1);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setBorderPainted(false);
		btnLimpar.setIcon(new ImageIcon(IMC.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(296, 185, 64, 64);
		getContentPane().add(btnLimpar);

		// Uso da biblioteca Atxy2k
		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc.png")));
		lblStatus.setBounds(0, 11, 159, 418);
		getContentPane().add(lblStatus);
		validar.setLimit(4);

	}// Fim do construtor

	void calcular() {

		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o peso");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a altura");
			txtAltura.requestFocus();
		} else {

			// Logica principal

			// Variaveis
			double peso, altura, imc;

			// Formatador de casas decimais
			DecimalFormat formatador = new DecimalFormat("#0.00");

			// Entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// Processamento
			imc = peso / (altura * altura);

			// Resultado
			txtResultado.setText(String.valueOf(formatador.format(imc)));

			// Status
			if (imc < 17) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc1.png")));
			} else if (imc < 18.5) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc2.png")));
			}else if (imc < 25) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc3.png")));
			}else if (imc < 30) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc4.png")));
			}else if (imc < 35) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc5.png")));
			}else if (imc < 40) {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc6.png")));
			} else {
				lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc7.png")));
			}
		}

	}

	/**
	 * Metodo usado para limpar os campos
	 */
	void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/img/imc.png")));

	}

} // fim do codigo
