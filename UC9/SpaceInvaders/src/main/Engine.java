package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import sprites.Nave;

@SuppressWarnings("serial")
public class Engine extends JPanel implements Runnable, KeyListener {
	// Vincular a nave
	Nave nave = new Nave();
	public int sentido;

	// Construtor
	public Engine() {
		// Criar uma thread (processamento em paralelo do jogo)
		Thread game = new Thread(this);
		game.start(); // Iniciar processamento do jogo (run())

	}
    @Override
	public void run() {
		while (true) {
			// System.out.println("teste");
			// Mecanica do jogo
			refresh(); // Atualizar o JPanel - > JFrame
			repaint(); // Redesenhar os assets
			delay(); // Tempo antes do refresh (ajustes UX)
		}
	}

	public void refresh() {
		nave.moverNave(sentido);

	}

	public void paintComponent(Graphics g) {
		// Limpar o rastro da tela
		super.paintComponent(g);
		nave.exibirNave(g);
	}

	public void delay() {
		// Tratamento de exceções
		try {
			Thread.sleep(10); // Mili segundos (1000 ms = 1s)
		} catch (Exception e) {
			System.out.println(e);

		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	// Pressionar uma tecla
	@Override
	public void keyPressed(KeyEvent e) {
		// Se pressionar a tecla d/seta direita
		if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
		sentido = 1;
		
		}
		
		// Se pressionar a tecla a/seta esquerda
		if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
		sentido = -1;
		
		}
		// Se pressionar a tecla w/seta pra cima
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			sentido = 2;
		}
		// Se pressionar a tecla s/seta pra baixo
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			sentido = -2;
			
		}
	}
	// Soltar uma tecla
	@Override
	public void keyReleased(KeyEvent e) {
		/**if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
			sentido = 0;
			
			}
			
			// Se pressionar a tecla a
			if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
			sentido = 0;
			
			}**/
		nave.moverNave(sentido = 0);
		
	}

} // Fim do Codigo
