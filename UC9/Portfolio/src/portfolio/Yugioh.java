package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Yugioh extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCartas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yugioh dialog = new Yugioh();
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
	public Yugioh() {
		setTitle("Deck Yu Gi Oh");
		setBounds(100, 100, 454, 472);
		getContentPane().setLayout(null);

		JButton btnCartas = new JButton("");
		btnCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/yugiohicon.png")));
		btnCartas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCartas();
			}
		});
		btnCartas.setToolTipText("Cartas");
		btnCartas.setContentAreaFilled(false);
		btnCartas.setBorderPainted(false);
		btnCartas.setBounds(10, 127, 64, 64);
		getContentPane().add(btnCartas);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setIcon(new ImageIcon(Yugioh.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(365, 247, 64, 64);
		getContentPane().add(btnLimpar);

		lblCartas = new JLabel("");
		lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/yugiohface.png")));
		lblCartas.setBounds(84, 27, 271, 395);
		getContentPane().add(lblCartas);

	} // Fim do Construtor

	void sortearCartas() {
		Random random = new Random();
		int carta = random.nextInt(28) + 1;
		switch (carta) {
		case 1:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/1.png")));
			break;
		case 2:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/2.png")));
			break;
		case 3:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/3.png")));
			break;
		case 4:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/4.png")));
			break;
		case 5:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/5.png")));
			break;
		case 6:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/6.png")));
			break;
		case 7:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/7.png")));
			break;
		case 8:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/8.png")));
			break;
		case 9:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/9.png")));
			break;
		case 10:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/10.png")));
			break;
		case 11:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/11.png")));
			break;
		case 12:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/12.png")));
			break;
		case 13:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/13.png")));
			break;
		case 14:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/14.png")));
			break;
		case 15:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/15.png")));
			break;
		case 16:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/16.png")));
			break;
		case 17:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/17.png")));
			break;
		case 18:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/18.png")));
			break;
		case 19:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/19.png")));
			break;
		case 20:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/20.png")));
			break;
		case 21:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/21.png")));
			break;
		case 22:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/25.png")));
			break;
		case 23:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/29.png")));
			break;
		case 24:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/31.png")));
			break;
		case 25:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/32.png")));
			break;
		case 26:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/45.png")));
			break;
		case 27:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/48.png")));
			break;
		case 28:
			lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/49.png")));
			break;
		}
	} // Fim do metodo lançar
		
	
    // metodo limpar
	void limpar() {
		lblCartas.setIcon(new ImageIcon(Yugioh.class.getResource("/img/yugiohface.png")));
	}
}