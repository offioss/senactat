package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Telajogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblPC;
	private JRadioButton rdbtnPedra;
	private JRadioButton rdbtnPapel;
	private JRadioButton rdbtnTesoura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telajogo frame = new Telajogo();
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
	public Telajogo() {
		setTitle("JokenPo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 332, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pedra.png")));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setBounds(10, 24, 64, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Telajogo.class.getResource("/img/papel.png")));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setBounds(125, 24, 64, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Telajogo.class.getResource("/img/tesoura.png")));
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setBounds(242, 24, 64, 64);
		contentPane.add(lblNewLabel_2);

		lblPC = new JLabel("New label");
		lblPC.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pc.png")));
		lblPC.setBounds(73, 237, 171, 139);
		contentPane.add(lblPC);

		rdbtnPedra = new JRadioButton("");
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setBackground(Color.WHITE);
		rdbtnPedra.setBounds(30, 103, 21, 23);
		contentPane.add(rdbtnPedra);

		rdbtnPapel = new JRadioButton("");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.WHITE);
		rdbtnPapel.setBounds(145, 103, 21, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.WHITE);
		rdbtnTesoura.setBounds(264, 103, 21, 23);
		contentPane.add(rdbtnTesoura);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Telajogo.class.getResource("/img/jokenpo2.png")));
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setToolTipText("PO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pow();
			}
		});
		btnNewButton.setBounds(125, 148, 64, 64);
		contentPane.add(btnNewButton);
	} // Fim do Construtor

	void pow() {

		// Validação (atenção ao uso do NOT)

		if (!rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Escolha uma opção");
        
		} else {
		
		// Logica Principal
		
			Random random = new Random();
			int pc = random.nextInt(3);
		// Dica para verificar o numero sorteado
		// System.out.println(pc);
		// Associar o numero a imagem
			
			switch(pc) {
			case 0:
			lblPC.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pcpedra.png")));
			break;
			
			case 1:
				lblPC.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pcpapel.png")));
			break;
			
			case 2:
				lblPC.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pctesoura.png")));
				break;
			
			}
			// Comparações para determinar o vencedor ou empate
			
			if ((rdbtnPedra.isSelected() && pc == 0) || (rdbtnPapel.isSelected() && pc == 1) || (rdbtnTesoura.isSelected() && pc == 2)) {
				JOptionPane.showMessageDialog(null, "EMPATE");
			
			} else if ((rdbtnPedra.isSelected() && pc == 2) || (rdbtnPapel.isSelected() && pc == 0) || (rdbtnTesoura.isSelected() && pc == 1)) {
				JOptionPane.showMessageDialog(null,"Jogador VENCEU");
			
			} else  {
				JOptionPane.showMessageDialog(null,"PC VENCEU");
			}
			// Limpar os campos
			lblPC.setIcon(new ImageIcon(Telajogo.class.getResource("/img/pc.png")));
			buttonGroup.clearSelection();
		}
	}

} // Fim do Codigo
