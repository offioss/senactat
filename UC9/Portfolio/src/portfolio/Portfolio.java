package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	DecimalFormat formatador = new DecimalFormat("#0.00");
	Date data = new Date();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portfolio() {
		setTitle("Portfolio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 349);
		contentPane = new JPanel();
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIMC = new JButton("");
		btnIMC.setToolTipText("IMC");
		btnIMC.setContentAreaFilled(false);
		btnIMC.setIcon(new ImageIcon(Portfolio.class.getResource("/img/imcoicon.png")));
		btnIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulario, IMC
				IMC imc = new IMC ();
				imc.setVisible(true);;
			}
		});
		btnIMC.setBounds(232, 11, 64, 64);
		contentPane.add(btnIMC);
		
		JButton btnInfo = new JButton("");
		btnInfo.setContentAreaFilled(false);
		btnInfo.setBorderPainted(false);
		btnInfo.setIcon(new ImageIcon(Portfolio.class.getResource("/img/sobreicon.png")));
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulario, SOBRE
				Sobre sobre = new Sobre ();
				sobre.setVisible(true);;
			}
		});
		btnInfo.setBounds(199, 208, 64, 64);
		contentPane.add(btnInfo);
		
		JButton btnMedia = new JButton("");
		btnMedia.setToolTipText("Media");
		btnMedia.setContentAreaFilled(false);
		btnMedia.setIcon(new ImageIcon(Portfolio.class.getResource("/img/mediaicon.png")));
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnMedia.setBounds(158, 11, 64, 64);
		contentPane.add(btnMedia);
		
		JButton btnCelsius = new JButton("");
		btnCelsius.setToolTipText("ConverterCelsius");
		btnCelsius.setContentAreaFilled(false);
		btnCelsius.setIcon(new ImageIcon(Portfolio.class.getResource("/img/celsiusicon.png")));
		btnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertCelsius convertcelsius = new ConvertCelsius();
				convertcelsius.setVisible(true);
			}
		
			});
		btnCelsius.setBounds(84, 95, 64, 64);
		contentPane.add(btnCelsius);
		
		JButton btnDesconto = new JButton("");
		btnDesconto.setToolTipText("Desconto");
		btnDesconto.setContentAreaFilled(false);
		btnDesconto.setIcon(new ImageIcon(Portfolio.class.getResource("/img/porcentagemicon.png")));
		btnDesconto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Porcentagem porcentagem = new Porcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnDesconto.setBounds(308, 11, 64, 64);
		contentPane.add(btnDesconto);
		
		JButton btnEtanol = new JButton("");
		btnEtanol.setToolTipText("Etanol&Gas");
		btnEtanol.setContentAreaFilled(false);
		btnEtanol.setIcon(new ImageIcon(Portfolio.class.getResource("/img/gasicon.png")));
		btnEtanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EtanolGas etanolgas = new EtanolGas();
				etanolgas.setVisible(true);
			}
		});
		btnEtanol.setBounds(387, 11, 64, 64);
		contentPane.add(btnEtanol);
		
		JButton btnEleitor = new JButton("");
		btnEleitor.setToolTipText("Eleitor");
		btnEleitor.setContentAreaFilled(false);
		btnEleitor.setIcon(new ImageIcon(Portfolio.class.getResource("/img/eleitoricon.png")));
		btnEleitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnEleitor.setBounds(10, 11, 64, 64);
		contentPane.add(btnEleitor);
		
		JButton btnApp = new JButton("");
		btnApp.setToolTipText("AppService");
		btnApp.setContentAreaFilled(false);
		btnApp.setIcon(new ImageIcon(Portfolio.class.getResource("/img/appserviceicon.png")));
		btnApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppService appservice = new AppService();
				appservice.setVisible(true);
			}
		});
		btnApp.setBounds(84, 11, 64, 64);
		contentPane.add(btnApp);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 283, 461, 27);
		contentPane.add(panel);
		panel.setLayout(null);
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		JLabel lblStatus = new JLabel("New label");
		lblStatus.setBounds(24, 0, 407, 27);
		panel.add(lblStatus);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setText(formatador.format(data));
		
		
		
		JButton btnJokenpo = new JButton("");
		btnJokenpo.setIcon(new ImageIcon(Portfolio.class.getResource("/img/hand.png")));
		btnJokenpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telajogo telajogo = new Telajogo();
				telajogo.setVisible(true);
			
			}
		});
		btnJokenpo.setContentAreaFilled(false);
		btnJokenpo.setToolTipText("Jokenpo");
		btnJokenpo.setBounds(10, 186, 64, 64);
		contentPane.add(btnJokenpo);
		
		JButton btnCartas = new JButton("");
		btnCartas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnCartas.setIcon(new ImageIcon(Portfolio.class.getResource("/img/cards.png")));
		btnCartas.setToolTipText("Cartas");
		btnCartas.setContentAreaFilled(false);
		btnCartas.setBounds(308, 186, 64, 64);
		contentPane.add(btnCartas);
		
		JButton btnDados = new JButton("");
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnDados.setIcon(new ImageIcon(Portfolio.class.getResource("/img/dadosicon.png")));
		btnDados.setToolTipText("Dados");
		btnDados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDados.setContentAreaFilled(false);
		btnDados.setBounds(84, 186, 64, 64);
		contentPane.add(btnDados);
		
		JButton btnTabuada = new JButton("");
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnTabuada.setIcon(new ImageIcon(Portfolio.class.getResource("/img/tabuada-64.png")));
		btnTabuada.setDefaultCapable(false);
		btnTabuada.setContentAreaFilled(false);
		btnTabuada.setToolTipText("Tabuada");
		btnTabuada.setBounds(10, 95, 64, 64);
		contentPane.add(btnTabuada);
		
		JButton btnCEP = new JButton("");
		btnCEP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CEP cep = new CEP();
				cep.setVisible(true);
			}
		});
		btnCEP.setContentAreaFilled(false);
		btnCEP.setIcon(new ImageIcon(Portfolio.class.getResource("/img/correios-64.png")));
		btnCEP.setToolTipText("CEP");
		btnCEP.setBounds(232, 95, 64, 64);
		contentPane.add(btnCEP);
		
		JButton btnFahrenheit = new JButton("");
		btnFahrenheit.setToolTipText("Converter Fahrenheit");
		btnFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertFahrenheit convertfahrenheit = new ConvertFahrenheit();
				convertfahrenheit.setVisible(true);
			}
		});
		btnFahrenheit.setIcon(new ImageIcon(Portfolio.class.getResource("/img/fahrenheit.png")));
		btnFahrenheit.setContentAreaFilled(false);
		btnFahrenheit.setBounds(158, 95, 64, 64);
		contentPane.add(btnFahrenheit);
		
		JButton btnYugioh = new JButton("");
		btnYugioh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yugioh yugioh = new Yugioh();
				yugioh.setVisible(true);
			}
		});
		btnYugioh.setIcon(new ImageIcon(Portfolio.class.getResource("/img/yugiohicon.png")));
		btnYugioh.setToolTipText("Yu Gi Oh!");
		btnYugioh.setDefaultCapable(false);
		btnYugioh.setContentAreaFilled(false);
		btnYugioh.setBounds(387, 186, 64, 64);
		contentPane.add(btnYugioh);
	
		}
}
