package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class AppService extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtRenumeracao;
	private JTextField txtCusto;
	private JTextField txtCarga;
	private JTextField txtHora;
	private JTextField txtHoras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppService dialog = new AppService();
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
	public AppService() {
		setTitle("Calculo do Valor da Hora de Serviço");
		setBounds(100, 100, 450, 351);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Renumeração");
		lblNewLabel.setBounds(34, 25, 85, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Custo Operacional");
		lblNewLabel_1.setBounds(21, 67, 109, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Carga Horaria Mensal");
		lblNewLabel_2.setBounds(10, 105, 123, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtRenumeracao = new JTextField();
		txtRenumeracao.setBounds(145, 22, 86, 20);
		getContentPane().add(txtRenumeracao);
		txtRenumeracao.setColumns(10);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(145, 64, 86, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);
		
		txtCarga = new JTextField();
		txtCarga.setBounds(145, 102, 86, 20);
		getContentPane().add(txtCarga);
		txtCarga.setColumns(10);
		
		JButton txtCalcular = new JButton("");
		txtCalcular.setBorderPainted(false);
		txtCalcular.setDefaultCapable(false);
		txtCalcular.setContentAreaFilled(false);
		txtCalcular.setIcon(new ImageIcon(AppService.class.getResource("/img/calcularicon.png")));
		txtCalcular.setToolTipText("calcular");
		txtCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcular();
			}
		});
		txtCalcular.setBounds(155, 127, 64, 64);
		getContentPane().add(txtCalcular);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de Serviço");
		lblNewLabel_3.setBounds(281, 52, 94, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtHora = new JTextField();
		txtHora.setEditable(false);
		txtHora.setBounds(270, 75, 100, 20);
		getContentPane().add(txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Estimativa de Horas de Serviço");
		lblNewLabel_4.setBounds(10, 216, 211, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(34, 251, 86, 20);
		getContentPane().add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton txtCalcularum = new JButton("");
		txtCalcularum.setBorderPainted(false);
		txtCalcularum.setDefaultCapable(false);
		txtCalcularum.setContentAreaFilled(false);
		txtCalcularum.setIcon(new ImageIcon(AppService.class.getResource("/img/calcularicon.png")));
		txtCalcularum.setToolTipText("Calcular");
		txtCalcularum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularum();
			}
		});
		txtCalcularum.setBounds(155, 226, 64, 64);
		getContentPane().add(txtCalcularum);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(23, 202, 385, 3);
		getContentPane().add(panel);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(AppService.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setBounds(287, 127, 64, 64);
		getContentPane().add(btnLimpar);
		
		// Validação Remuneração
				RestrictedTextField renumeracao = new RestrictedTextField(txtRenumeracao, "0123456789.");
				renumeracao.setLimit(9);

				// Validação Custo Operacional
				RestrictedTextField custoOperacional = new RestrictedTextField(txtCusto, "0123456789.");
				custoOperacional.setLimit(9);

				// Validação Horas
				RestrictedTextField horasMes = new RestrictedTextField(txtHoras, "0123456789");
				horasMes.setLimit(4);

				// Validação Estimativa Horas
				RestrictedTextField estimativaHoras = new RestrictedTextField(txtCarga, "0123456789");
				estimativaHoras.setLimit(4);

	} // Fim do Construtor
	
	  // Variavel Globais
	
         double hora;	
	
      // Metodo usado para Calcular o Valor da Hora
	     
         void calcular() {
	    	 
	  // Variaveis
	
        double renumeracao, custo, carga;
        
      // Entrada
      
         renumeracao = Double.parseDouble(txtRenumeracao.getText());
         custo = Double.parseDouble(txtCusto.getText());
         carga = Double.parseDouble(txtCarga.getText()); 
         
      // Processamento
         
         hora = (renumeracao + 0.3 * renumeracao + custo + 0.2 * renumeracao) / carga;
	     
	  // Saida
	     
         txtHora.setText(String.valueOf(hora));
         
	  
	  }
	     void calcularum() {
	     
	  // Estimativa Hora de Serviço
	    	 
	  // Variaveis
	    	 
	     double horas, valor;
	     
	  // Entrada
	     
	     horas = Double.parseDouble(txtHoras.getText());
	     
	  // Processamento
	     
	     valor = horas * hora;

	  // Saida
	     
	     JOptionPane.showMessageDialog(null, "Valor do serviço: " + valor, "Relatorio", JOptionPane.DEFAULT_OPTION);
	     }
	     
	     /**
	 	 * Metodo usado para limpar os campos
	 	 */
	 	void limpar() {
	 		txtRenumeracao.setText(null);
	 		txtCusto.setText(null);
	 		txtCarga.setText(null);
	 		txtHoras.setText(null);
	 		txtHora.setText(null);
	 	}
}