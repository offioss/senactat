package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import sprites.Laser;
import sprites.Nave;

@SuppressWarnings("serial")
public class Engine extends JPanel implements Runnable, KeyListener {
	// Vincular a nave
	Nave nave = new Nave();
	public int sentido;

	// Vincular o background
	Backdrop backdrop = new Backdrop();

	// Vincular o Laser usando um vetor dinamico para guardar os tiros
	public ArrayList<Laser> laser = new ArrayList<Laser>();
	
	// Vincular o audio (som Laser)
	Sound somLaser = new Sound();

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
		// nave
		nave.moverNave(sentido);
		// laser
		for (int i = 0; i < laser.size(); i++) {
			laser.get(i).moverLaser();
			// Se o laser chegar ao fim da tela
			if (laser.get(i).removerLaser() == true) {
				laser.remove(i);
				
			}
		}
		// Entendimento da logica do tiro
		// System.out.println(laser.size());
	
	}

	public void paintComponent(Graphics g) {
		// Limpar o rastro da tela
		super.paintComponent(g);
		// camada 1 background
		backdrop.exibirBackground(g);
		// camada 2 laser
		for (int i = 0; i < laser.size(); i++) {
			laser.get(i).exibirLaser(g);
		}
		// camada 3 nave
		nave.exibirNave(g);

	}

	public void delay() {
		// Tratamento de exceções
		try {
			Thread.sleep(6); // Milisegundos
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
		if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
			sentido = 1;

		}

		// Se pressionar a tecla a/seta esquerda
		if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
			sentido = -1;

		}
		// Se pressionar a tecla w/seta pra cima
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			sentido = 2;
		}
		// Se pressionar a tecla s/seta pra baixo
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			sentido = -2;

		}
		// Se barra de espaço pressionada
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			laser.add(nave.atirar());
			somLaser.play();
		}
	}

	// Soltar uma tecla
	@Override
	public void keyReleased(KeyEvent e) {
		/**
		 * if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
		 * sentido = 0;
		 * 
		 * }
		 * 
		 * // Se pressionar a tecla a if (e.getKeyCode() == KeyEvent.VK_A ||
		 * e.getKeyCode() == KeyEvent.VK_LEFT) { sentido = 0;
		 * 
		 * }
		 **/
		nave.moverNave(sentido = 0);

	}

} // Fim do Codigo
