package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eleitor extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor dialog = new Eleitor();
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
	public Eleitor() {
		setTitle("Eleitor");
		setBounds(100, 100, 300, 215);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setBounds(10, 25, 46, 14);
		getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(49, 22, 37, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton txtVotar = new JButton("Votar");
		txtVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				votar();
			}
		});
		txtVotar.setBounds(94, 76, 89, 23);
		getContentPane().add(txtVotar);

	} // Fim do Construtor

	void votar() {

	    
	  // Variaveis
	    
	    int idade;
	    
	 // Entrada
	    
	    idade = Integer.parseInt(txtIdade.getText());
	    
	 // Processamento
	    
	    if (idade < 16) {
	    JOptionPane.showMessageDialog(null, "Proibido Votar");
	    } else if (idade > 17 && idade < 71) {
	    	JOptionPane.showMessageDialog(null, "Obrigatorio Votar");
	    } else {
	    	JOptionPane.showMessageDialog(null, " Voto Facultativo");
	    	
	    }

	} 
} // Fim do Codigo