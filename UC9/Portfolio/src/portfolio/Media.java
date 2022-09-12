package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.ImageIcon;

public class Media extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtDisciplina;
	private JTextField txt1B;
	private JTextField txt2B;
	private JTextField txt3B;
	private JTextField txt4B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media dialog = new Media();
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
	public Media() {
		setTitle("Calculo da Media");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome do Aluno:");
		lblNewLabel.setBounds(25, 11, 92, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(56, 41, 46, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Disciplina");
		lblNewLabel_2.setBounds(206, 41, 68, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("1º B");
		lblNewLabel_3.setBounds(56, 84, 46, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("2º B");
		lblNewLabel_4.setBounds(56, 109, 46, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("3º B");
		lblNewLabel_5.setBounds(56, 160, 46, 14);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("4º B");
		lblNewLabel_6.setBounds(56, 185, 46, 14);
		getContentPane().add(lblNewLabel_6);

		txtNome = new JTextField();
		txtNome.setBounds(127, 8, 297, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(127, 38, 46, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		txtDisciplina = new JTextField();
		txtDisciplina.setBounds(284, 38, 140, 20);
		getContentPane().add(txtDisciplina);
		txtDisciplina.setColumns(10);

		txt1B = new JTextField();
		txt1B.setBounds(92, 81, 86, 20);
		getContentPane().add(txt1B);
		txt1B.setColumns(10);

		txt2B = new JTextField();
		txt2B.setBounds(92, 106, 86, 20);
		getContentPane().add(txt2B);
		txt2B.setColumns(10);

		txt3B = new JTextField();
		txt3B.setBounds(92, 157, 86, 20);
		getContentPane().add(txt3B);
		txt3B.setColumns(10);

		txt4B = new JTextField();
		txt4B.setBounds(92, 182, 86, 20);
		getContentPane().add(txt4B);
		txt4B.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Media.class.getResource("/img/calcularicon.png")));
		btnNewButton.setToolTipText("Media");
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();

			}
		});
		btnNewButton.setBounds(206, 109, 64, 64);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Media.class.getResource("/img/eraser.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBounds(360, 186, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		// Uso da Biblioteca Atxy2k
		
		//Validar nome
		RestrictedTextField nome = new RestrictedTextField(txtNome);
		nome.setOnlyText(true);
		nome.setAcceptSpace(true);
		nome.setLimit(40);
		
		//Validar idade
		RestrictedTextField idade = new RestrictedTextField(txtIdade, "0123456789");
		idade.setLimit(2);
		
		//Validar Disciplina
		RestrictedTextField disciplina = new RestrictedTextField(txtDisciplina);
		disciplina.setOnlyText(true);
		disciplina.setAcceptSpace(true);
		disciplina.setLimit(40);
		
		//Validar Nota1
		RestrictedTextField b1 = new RestrictedTextField(txt1B, "0123456789.");
		b1.setLimit(4);
		
		//Validar Nota2
		RestrictedTextField b2 = new RestrictedTextField(txt2B, "0123456789.");
		b2.setLimit(4);
		
		//Validar Nota3
		RestrictedTextField b3 = new RestrictedTextField(txt3B, "0123456789.");
		b3.setLimit(4);
		
		//Validar Nota4
		RestrictedTextField b4 = new RestrictedTextField(txt4B, "0123456789.");
		b4.setLimit(4);

	}// Fim do Construtor

	void calcular() {
		// variaveis
		String nome, disciplina;
		int idade;
		double b1, b2, b3, b4, media;

		// entrada
		nome = txtNome.getText();
		idade = Integer.parseInt(txtIdade.getText());
	    disciplina = txtDisciplina.getText();
		b1 = Double.parseDouble(txt1B.getText());
		b2 = Double.parseDouble(txt2B.getText());
		b3 = Double.parseDouble(txt3B.getText());
		b4 = Double.parseDouble(txt4B.getText());

		// processamento
		media = (b1 + b2 + b3 + b4) / 4;

		// saida
		if (media < 5) {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "n\nDisciplina: " + disciplina + "\nB1: " + b1 + "\nB2: " + b2 + "\nB3: " + b3 + " \nB4: " + b4 + "\nMedia " + media, "Calculo da Media", JOptionPane.DEFAULT_OPTION);
	
		} else { 
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "n\nDisciplina: " + disciplina + "\nB1: " + b1 + "\nB2: " + b2 + "\nB3: " + b3 + " \nB4: " + b4 + "\nMedia " + media, "Calculo da Media", JOptionPane.DEFAULT_OPTION);	
		}
}
	/**
 	 * Metodo usado para limpar os campos
 	 */
 	void limpar() {
 		txtNome.setText(null);
 		txtIdade.setText(null);
 		txtDisciplina.setText(null);
 		txt1B.setText(null);
 		txt2B.setText(null);
 		txt3B.setText(null);
 		txt4B.setText(null);
 	}
}