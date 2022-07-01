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
		txtGas.setBounds(137, 68, 46, 20);
		getContentPane().add(txtGas);
		txtGas.setColumns(10);

		JButton txtCalcular = new JButton("Calcular");
		txtCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		txtCalcular.setBounds(102, 111, 117, 23);
		getContentPane().add(txtCalcular);

		lblStatus = new JLabel("New label");
		lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/neutro.png")));
		lblStatus.setBounds(0, 145, 313, 161);
		getContentPane().add(lblStatus);

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
		
		}
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
			// JOptionPane.showMessageDialog(null, "Abastecer com Gasolina", "Gasolina", JOptionPane.DEFAULT_OPTION);
			lblStatus.setIcon(new ImageIcon(EtanolGas.class.getResource("/img/gasolina.png")));
			
			
			
		}
	}
}