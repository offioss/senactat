package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 333, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(314, 110, 89, 23);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 59, 46, 14);
		getContentPane().add(lblNewLabel_1);

		txtIdade = new JTextField();
		txtIdade.setBounds(66, 56, 60, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setBounds(148, 59, 46, 14);
		getContentPane().add(lblNewLabel_2);

		txtPeso = new JTextField();
		txtPeso.setBounds(196, 56, 60, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Altura");
		lblNewLabel_3.setBounds(289, 59, 46, 14);
		getContentPane().add(lblNewLabel_3);

		txtAltura = new JTextField();
		txtAltura.setBounds(338, 56, 60, 20);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);

	}// Fim do construtor

	// Metodo responsavel pelo calculo do IMC

	void calcular() {
		
	// Validação
		
		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Nome");
			txtNome.requestFocus();
		
		} else if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencher a Idade");
			
		} else if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencher o Peso");
			txtPeso.requestFocus();
			
		} else if(txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencher a Altura");
			txtAltura.requestFocus();
			
		} else {	
		
		// Variaveis
		String nome;
		int idade;
		double peso, altura, imc;
		
		// Entrada
		// Armzenando o conteudo da caixa de texto na variavel
		nome = txtNome.getText();
		// Integer.paseInt (converter o conteudo da caixa de texto para numero inteiro)
		idade = Integer.parseInt(txtIdade.getText());
		// Double.parseDouble (converter o conteudo da caixa de texto para numeros inteiros e nao inteiro)
		peso = Double.parseDouble(txtPeso.getText());
		altura = Double.parseDouble(txtAltura.getText());
		
		// Processamento
		imc = peso / (altura * altura);
		
		// Saida
		// A linha abaixo exibe o nome armazenado na variavel em uma caixa de mensagem.
		// Para personalizar a caixa de mensagem devemos adicionar um texto para o
		// titulo e um icone personalizado.
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "n\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc, "Ficha do Aluno",JOptionPane.DEFAULT_OPTION);
	}
}
}