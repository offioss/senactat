package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Carta extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;
	private JLabel lblNipe;
	private JLabel lblNipeCentro;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta dialog = new Carta();
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
	public Carta() {
		setTitle("Carta");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 351, 403);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(109, 29, 220, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblFace = new JLabel("");
		lblFace.setBounds(10, 11, 98, 32);
		lblFace.setFont(new Font("Arial", Font.BOLD, 22));
		panel.add(lblFace);

		lblNipe = new JLabel("");
		lblNipe.setBounds(10, 47, 22, 32);
		lblNipe.setFont(new Font("Arial", Font.BOLD, 32));
		panel.add(lblNipe);

		lblNipeCentro = new JLabel("");
		lblNipeCentro.setFont(new Font("Arial", Font.BOLD, 90));
		lblNipeCentro.setBounds(36, 54, 160, 250);
		panel.add(lblNipeCentro);

		JButton btnJogar = new JButton("");
		btnJogar.setIcon(new ImageIcon(Carta.class.getResource("/img/baralho-64.png")));
		btnJogar.setToolTipText("Jogar");
		btnJogar.setDefaultCapable(false);
		btnJogar.setContentAreaFilled(false);
		btnJogar.setBorderPainted(false);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCarta();
			}
		});
		btnJogar.setBounds(22, 89, 64, 64);
		getContentPane().add(btnJogar);
		
		btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(Carta.class.getResource("/img/eraser.png")));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(22, 187, 64, 64);
		getContentPane().add(btnLimpar);

	} // Fim do Construtor]

	void sortearCarta() {
		String[] nipes = { "♥", "♦", "♣", "♠" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Joker" };
		Random carta = new Random();
		int indiceFace = carta.nextInt(faces.length);
		int indiceNipe = carta.nextInt(nipes.length);
		
		// Exibir carta
		lblFace.setText(faces[indiceFace]);
		lblNipe.setText(nipes[indiceNipe]);
		lblNipeCentro.setText(nipes[indiceNipe]);
		
		// Trocar a cor
		if (indiceNipe == 0 || indiceNipe == 1) {
			lblFace.setForeground(Color.RED);
			lblNipe.setForeground(Color.RED);
			lblNipeCentro.setForeground(Color.RED);
		} else {
		lblFace.setForeground(Color.BLACK);
		lblNipe.setForeground(Color.BLACK);
		lblNipeCentro.setForeground(Color.BLACK);
		
		}
		
		// Exibir imagens Valete, Dama e Rei
		if (indiceFace == 10) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/valete.png")));
		} else if (indiceFace == 11) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/dama.png")));
		} else if (indiceFace == 12) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/rei.png")));
		} else if (indiceFace == 13) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/joker.png")));
			lblNipe.setText(null);
		} else {
			lblNipeCentro.setIcon(null);
			lblNipeCentro.setText("  " + nipes[indiceNipe]);
		}
	}
		
		// Metodo Limpar
		 
		void limpar() {
			lblFace.setText(null);
			lblNipe.setText(null);
			lblNipeCentro.setText(null);
			lblNipeCentro.setIcon(null);
	}
} // Fim do codigo
