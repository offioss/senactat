package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 349);
		contentPane = new JPanel();
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/imcoicon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulario, IMC
				IMC imc = new IMC ();
				imc.setVisible(true);;
			}
		});
		btnNewButton.setBounds(217, 11, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/sobreicon.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulario, SOBRE
				Sobre sobre = new Sobre ();
				sobre.setVisible(true);;
			}
		});
		btnNewButton_1.setBounds(360, 220, 64, 64);
		contentPane.add(btnNewButton_1);
		
		JButton txtMedia = new JButton("");
		txtMedia.setContentAreaFilled(false);
		txtMedia.setBorderPainted(false);
		txtMedia.setIcon(new ImageIcon(Portfolio.class.getResource("/img/mediaicon.png")));
		txtMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		txtMedia.setBounds(148, 11, 64, 64);
		contentPane.add(txtMedia);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/celsiusicon.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertCelsius convertcelsius = new ConvertCelsius();
				convertcelsius.setVisible(true);
			}
		
			});
		btnNewButton_2.setBounds(84, 95, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/porcentagemicon.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Porcentagem porcentagem = new Porcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(10, 95, 64, 64);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/gasicon.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EtanolGas etanolgas = new EtanolGas();
				etanolgas.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(20, 186, 64, 64);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/eleitoricon.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(10, 11, 64, 64);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("AppService");
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/appserviceicon.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppService appservice = new AppService();
				appservice.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(84, 11, 64, 64);
		contentPane.add(btnNewButton_6);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 283, 434, 27);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStatus = new JLabel("New label");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setBounds(55, 0, 316, 27);
		panel.add(lblStatus);
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblStatus.setText(formatador.format(data));
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/hand.png")));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telajogo telajogo = new Telajogo();
				telajogo.setVisible(true);
			
			}
		});
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setToolTipText("Jokenpo");
		btnNewButton_7.setBounds(158, 95, 64, 64);
		contentPane.add(btnNewButton_7);
	
		}
}
