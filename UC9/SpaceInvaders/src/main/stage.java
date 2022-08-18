package main;

import javax.swing.JFrame;

public class stage {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Space Invaders");
		// Janela.setExtendedState(Jframe.MAXIMIZED_BOTH);
		janela.setSize(1280, 720);
		// janela.setUndercorated(true);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null); // Centraliza a janela do app

        // Criar um objeto para acessar a Engine
	
        Engine assets = new Engine();
        assets.setBounds(0, 0, 1280, 720);
        janela.add(assets);
        
        // Adicionar escuta do teclado
        janela.addKeyListener(assets);
}

}
