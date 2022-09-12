package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Cursor;
import java.awt.Font;

public class EtanolGas extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtEtanol;
	private JTextField txtGas;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtanolGas dialog = new EtanolGas();
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
	public EtanolGas() {
		setTitle("Etanol  x Gasolina");
		setBounds(100, 100, 329, 345);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Etanol");
		lblNewLabel.setBounds(91, 31, 46, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gasolina");
		lblNewLabel_1.setBounds(86, 71, 67, 14);
		getContentPane().add(lblNewLabel_1);

		txtEtanol = new JTextField();
		txtEtanol.setHorizontalAlignment(SwingConstants.CENTER);
		txtEtanol.setBounds(137, 28, 46, 20);
		getContentPane().add(txtEtanol);
		txtEtanol.setColumns(10);

		txtGas = new JTextField();
		txtGas.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtGas.setHorizontalAlignment(SwingConstants.CENTER);
		txtGas.setBounds(137, 68, 46, 20);
		getContentPane().add(txtGas);
		txtGas.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/combustivel.png")));
		btnCalcular.setDefaultCapable(false);
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(193, 28, 64, 64);
		getContentPane().add(btnCalcular);

		lblStatus = new JLabel("New label");
		lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/neutro.png")));
		lblStatus.setBounds(0, 145, 313, 161);
		getContentPane().add(lblStatus);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/eraser.png")));
		btnNewButton.setToolTipText("Limpar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBounds(249, 80, 64, 64);
		getContentPane().add(btnNewButton);
		
		// validação Gasolina
		RestrictedTextField gas = new RestrictedTextField(txtGas, "0123456789.");
		gas.setLimit(5);
		
		// validação Etanol
		RestrictedTextField etanol = new RestrictedTextField(txtGas, "0123456789.");
		etanol.setLimit(5);

	} // Fim do Construtor

	void calcular() {

		// Validação

		if (txtEtanol.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o valor do Etanol");
			txtEtanol.requestFocus();

		} else if (txtGas.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o valor da Gasolina");
			txtGas.requestFocus();

		} else {

		// Variaveis

		double etanol, gas;

		// Entrada

		etanol = Double.parseDouble(txtEtanol.getText());
		gas = Double.parseDouble(txtGas.getText());

		// Processamento

		if (etanol < 0.7 * gas) {
			// Abastecer com etanol
			// JOptionPane.showMessageDialog(null, "Abastecer com Etanol", "Etanol",
			// JOptionPane.DEFAULT_OPTION);
			lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/etanol.png")));

		} else {
			// Abastecer com gasolina
			// JOptionPane.showMessageDialog(null, "Abastecer com Gasolina", "Gasolina",
			// JOptionPane.DEFAULT_OPTION);
			lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/gasolina.png")));

		}
		}
	}

	/**
	 * Metodo usado para limpar os campos
	 */
	void limpar() {
		txtEtanol.setText(null);
		txtGas.setText(null);
		lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/neutro.png")));
		txtGas.requestFocus();
		
	}
}