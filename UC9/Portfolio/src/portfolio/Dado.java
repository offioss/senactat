package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dado extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dado dialog = new Dado();
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
	public Dado() {
		setTitle("Dados");
		setBounds(100, 100, 275, 302);
		getContentPane().setLayout(null);

		JButton btnDado = new JButton("");
		btnDado.setIcon(new ImageIcon(Dado.class.getResource("/img/dadosicon.png")));
		btnDado.setDefaultCapable(false);
		btnDado.setContentAreaFilled(false);
		btnDado.setBorderPainted(false);
		btnDado.setToolTipText("Lançar dado");
		btnDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado();
			}
		});
		btnDado.setBounds(94, 11, 64, 64);
		getContentPane().add(btnDado);

		lblFace = new JLabel("");
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/dadocapa.png")));
		lblFace.setBounds(74, 90, 115, 119);
		getContentPane().add(lblFace);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Dado.class.getResource("/img/eraser.png")));
		btnNewButton.setToolTipText("Limpar");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(185, 188, 64, 64);
		getContentPane().add(btnNewButton);

	}// Fim do Construtor

	void dado() {

		Random random = new Random();
		int face = random.nextInt(6) + 1;
	
		switch (face) {
		case 1:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face1.png")));
			break;
		case 2:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face2.png")));
			break;
		case 3:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face3.png")));
			break;
		case 4:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face4.png")));
			break;
		case 5:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face5.png")));
			break;
		case 6:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face6.png")));
			break;

		}
	}
		// Método para Limpar 
		void limpar() {
			
			lblFace.setText(null);
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/dadocapa.png")));
	}
}
