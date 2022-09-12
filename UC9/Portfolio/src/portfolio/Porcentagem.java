package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Porcentagem extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtResultado;
	private JTextField txtCusto;
	private JTextField txtLucro;
	private JTextField txtResultado2;
	private JTextField txtSubtotal;
	private JTextField txtDesconto;
	private JTextField txtResultado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Porcentagem dialog = new Porcentagem();
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
	public Porcentagem() {
		setTitle("Calculo da Porcentagem");
		setBounds(100, 100, 450, 353);
		getContentPane().setLayout(null);

		txtX = new JTextField();
		txtX.setBounds(10, 34, 86, 20);
		getContentPane().add(txtX);
		txtX.setColumns(10);

		JLabel lblNewLabel = new JLabel("%");
		lblNewLabel.setBounds(106, 37, 19, 14);
		getContentPane().add(lblNewLabel);

		txtY = new JTextField();
		txtY.setBounds(128, 34, 86, 20);
		getContentPane().add(txtY);
		txtY.setColumns(10);

		JButton Igual = new JButton("");
		Igual.setIcon(new ImageIcon(Porcentagem.class.getResource("/img/calcularicon2.png")));
		Igual.setDefaultCapable(false);
		Igual.setContentAreaFilled(false);
		Igual.setBorderPainted(false);
		Igual.setToolTipText("igual");
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		Igual.setBounds(238, 15, 64, 64);
		getContentPane().add(Igual);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(312, 34, 86, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		txtCusto = new JTextField();
		txtCusto.setBounds(10, 130, 86, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);

		txtLucro = new JTextField();
		txtLucro.setBounds(128, 130, 86, 20);
		getContentPane().add(txtLucro);
		txtLucro.setColumns(10);

		JButton txtVenda = new JButton("");
		txtVenda.setIcon(new ImageIcon(Porcentagem.class.getResource("/img/porcentagem.png")));
		txtVenda.setDefaultCapable(false);
		txtVenda.setContentAreaFilled(false);
		txtVenda.setBorderPainted(false);
		txtVenda.setToolTipText("Venda");
		txtVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularVenda();
			}
		});
		txtVenda.setBounds(238, 105, 64, 64);
		getContentPane().add(txtVenda);

		txtResultado2 = new JTextField();
		txtResultado2.setEditable(false);
		txtResultado2.setBounds(312, 130, 86, 20);
		getContentPane().add(txtResultado2);
		txtResultado2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo x Venda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(73, 12, 86, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Custo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 105, 46, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Lucro");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(158, 105, 41, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("% de venda");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(322, 115, 76, 14);
		getContentPane().add(lblNewLabel_4);

		txtSubtotal = new JTextField();
		txtSubtotal.setBounds(10, 222, 86, 20);
		getContentPane().add(txtSubtotal);
		txtSubtotal.setColumns(10);

		txtDesconto = new JTextField();
		txtDesconto.setBounds(128, 222, 86, 20);
		getContentPane().add(txtDesconto);
		txtDesconto.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Porcentagem.class.getResource("/img/discount-64.png")));
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setToolTipText("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTotal();
			}
		});
		btnNewButton.setBounds(234, 199, 64, 64);
		getContentPane().add(btnNewButton);

		txtResultado3 = new JTextField();
		txtResultado3.setEditable(false);
		txtResultado3.setBounds(312, 222, 86, 20);
		getContentPane().add(txtResultado3);
		txtResultado3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(26, 199, 60, 14);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Desconto");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(147, 199, 66, 14);
		getContentPane().add(lblNewLabel_6);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Porcentagem.class.getResource("/img/eraser.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBounds(360, 245, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		// Validação Porcentagem
				RestrictedTextField porcentagem = new RestrictedTextField(txtX, "0123456789");
				porcentagem.setLimit(3);

				// Validação Valor
				RestrictedTextField valor = new RestrictedTextField(txtY, "0123456789.");
				valor.setLimit(6);

				// Validação Custo
				RestrictedTextField custo = new RestrictedTextField(txtCusto, "0123456789.");
				custo.setLimit(6);

				// Validação Lucro
				RestrictedTextField lucro = new RestrictedTextField(txtLucro, "0123456789");
				lucro.setLimit(3);

				// Validação SubTotal
				RestrictedTextField subtotal = new RestrictedTextField(txtSubtotal, "0123456789.");
				subtotal.setLimit(6);

				// Validação Desconto
				RestrictedTextField desconto = new RestrictedTextField(txtDesconto, "0123456789");
				desconto.setLimit(3);

	}// Fim do Construtor

	void calcular() {

		// variaveis

		double txtx, txty, igual;

		// entrada

		txtx = Double.parseDouble(txtX.getText());
		txty = Double.parseDouble(txtY.getText());

		// processamento

		igual = (txtx * txty) / 100;

		// saida

		txtResultado.setText(String.valueOf(igual));

	}

	// Custo x Lucro

	void calcularVenda() {

		// Variaveis

		double txtcusto, txtlucro, txtvenda;

		// Entrada

		txtcusto = Double.parseDouble(txtCusto.getText());
		txtlucro = Double.parseDouble(txtLucro.getText());

		// Processamento

		txtvenda = txtcusto + ((txtlucro * txtcusto) / 100);

		// Saida

		txtResultado2.setText(String.valueOf(txtvenda));

	}

	// Subtotal x Desconto

	void calcularTotal() {

		// Variaveis

		double txtsubtotal, txtdesconto, txttotal;

		// Entrada

		txtsubtotal = Double.parseDouble(txtSubtotal.getText());
		txtdesconto = Double.parseDouble(txtDesconto.getText());

		// Processamento

		txttotal = txtsubtotal - (txtsubtotal * txtdesconto) / 100;

		// Saida

		txtResultado3.setText(String.valueOf(txttotal));

	}

	/**
	 * Metodo usado para limpar os campos
	 */
	void limpar() {
		txtX.setText(null);
		txtY.setText(null);
		txtCusto.setText(null);
		txtLucro.setText(null);
		txtSubtotal.setText(null);
		txtDesconto.setText(null);
	}
}