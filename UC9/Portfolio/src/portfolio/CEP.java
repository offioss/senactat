package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class CEP extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCEP;
	private JTextField txtEnd;
	private JTextField txtBairro;
	private JTextField txtCidade;
	@SuppressWarnings("rawtypes")
	private JComboBox cboUF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CEP dialog = new CEP();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CEP() {
		setTitle("CEP");
		setBounds(100, 100, 417, 262);
		getContentPane().setLayout(null);

		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCEP.setBounds(21, 37, 46, 14);
		getContentPane().add(lblCEP);

		JLabel lblEnd = new JLabel("Endereço:");
		lblEnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnd.setBounds(10, 63, 67, 14);
		getContentPane().add(lblEnd);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBairro.setBounds(10, 136, 67, 14);
		getContentPane().add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCidade.setBounds(10, 164, 67, 14);
		getContentPane().add(lblCidade);

		JLabel lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUF.setBounds(304, 164, 24, 14);
		getContentPane().add(lblUF);

		txtCEP = new JTextField();
		txtCEP.setBounds(77, 34, 112, 20);
		getContentPane().add(txtCEP);
		txtCEP.setColumns(10);

		txtEnd = new JTextField();
		txtEnd.setBounds(77, 60, 216, 20);
		getContentPane().add(txtEnd);
		txtEnd.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(77, 133, 216, 20);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(77, 161, 112, 20);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);

		cboUF = new JComboBox();
		cboUF.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
						"PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "SC", "SP", "SE", "TO" }));
		cboUF.setBounds(325, 160, 46, 22);
		getContentPane().add(cboUF);

		JButton btnCEP = new JButton("");
		btnCEP.setIcon(new ImageIcon(CEP.class.getResource("/img/buscar-64.png")));
		btnCEP.setContentAreaFilled(false);
		btnCEP.setBorderPainted(false);
		btnCEP.setToolTipText("Buscar");
		btnCEP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});
		btnCEP.setBounds(315, 27, 64, 64);
		getContentPane().add(btnCEP);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(CEP.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(315, 92, 64, 64);
		getContentPane().add(btnLimpar);
		
		/* Uso da biblioteca Atxy2k para validação do campo txtCep */
		@SuppressWarnings("unused")
		RestrictedTextField validar = new RestrictedTextField(txtCEP);

	} // Fim do Construtor

	void buscar() {
		if (txtCEP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o CEP");
			txtCEP.requestFocus();
		} else {
			// buscar CEP
			String logradouro = "";
			String tipoLogradouro = "";
			String resultado = null;
			String cep = txtCEP.getText();
			try {
				URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
				SAXReader xml = new SAXReader();
				Document documento = xml.read(url);
				Element root = documento.getRootElement();
				for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
					Element element = it.next();
					if (element.getQualifiedName().equals("cidade")) {
						txtCidade.setText(element.getText());
					}
					if (element.getQualifiedName().equals("bairro")) {
						txtBairro.setText(element.getText());
					}
					if (element.getQualifiedName().equals("uf")) {
						cboUF.setSelectedItem(element.getText());
					}
					if (element.getQualifiedName().equals("tipo_logradouro")) {
						tipoLogradouro = element.getText();
					}
					if (element.getQualifiedName().equals("logradouro")) {
						logradouro = element.getText();
					}
					if (element.getQualifiedName().equals("resultado")) {
						resultado = element.getText();
						if (resultado.equals("1")) {
							// lblStatus.setIcon(new
							// javax.swing.ImageIcon(getClass().getResource("/img/check.png")));

						} else {
							JOptionPane.showMessageDialog(null, "CEP não encontrado");
							txtCEP.setText(null);
							txtCEP.requestFocus();
						}
					}
				}
				// setar o campo endereço
				txtEnd.setText(tipoLogradouro + " " + logradouro);
			} catch (Exception e) {
				System.out.println(e);

			}
		}
	}

	private void limpar() {
		txtCEP.setText(null);
		txtEnd.setText(null);
		txtBairro.setText(null);
		txtCidade.setText(null);
		cboUF.setSelectedItem(null);
		txtCEP.requestFocus();
		
	}
} // Fim