package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtX = new JTextField();
		txtX.setBounds(10, 11, 86, 20);
		getContentPane().add(txtX);
		txtX.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("%");
		lblNewLabel.setBounds(106, 14, 19, 14);
		getContentPane().add(lblNewLabel);
		
		txtY =new JTextField();
		txtY.setBounds(128, 11, 86, 20);
		getContentPane().add(txtY);
		txtY.setColumns(10);
		
		JButton Igual = new JButton("=");
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		Igual.setBounds(244, 10, 41, 23);
		getContentPane().add(Igual);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(312, 11, 86, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(10, 91, 86, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);
		
		txtLucro = new JTextField();
		txtLucro.setBounds(128, 91, 86, 20);
		getContentPane().add(txtLucro);
		txtLucro.setColumns(10);
		
		JButton txtVenda = new JButton("Venda");
		txtVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularVenda();
			}
		});
		txtVenda.setBounds(224, 90, 78, 23);
		getContentPane().add(txtVenda);
		
		txtResultado2 = new JTextField();
		txtResultado2.setEditable(false);
		txtResultado2.setBounds(312, 91, 86, 20);
		getContentPane().add(txtResultado2);
		txtResultado2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Custo x Venda");
		lblNewLabel_1.setBounds(74, 53, 86, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Custo");
		lblNewLabel_2.setBounds(36, 78, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lucro");
		lblNewLabel_3.setBounds(159, 78, 41, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("% de");
		lblNewLabel_4.setBounds(244, 78, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setBounds(10, 154, 86, 20);
		getContentPane().add(txtSubtotal);
		txtSubtotal.setColumns(10);
		
		txtDesconto = new JTextField();
		txtDesconto.setBounds(128, 154, 86, 20);
		getContentPane().add(txtDesconto);
		txtDesconto.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcularTotal();
			}
		});
		btnNewButton.setBounds(224, 153, 78, 23);
		getContentPane().add(btnNewButton);
		
		txtResultado3 = new JTextField();
		txtResultado3.setEditable(false);
		txtResultado3.setBounds(312, 154, 86, 20);
		getContentPane().add(txtResultado3);
		txtResultado3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setBounds(25, 140, 60, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Desconto");
		lblNewLabel_6.setBounds(148, 140, 66, 14);
		getContentPane().add(lblNewLabel_6);

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
	
	  //Custo x Lucro
	    
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
	    }
