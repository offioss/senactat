package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Backdrop {
	BufferedImage background;
	int posBy = 0;

	// Construtor
	public Backdrop() {

		// Tratamento de exceções
		try {
			// carregar a imagem (upload)
			background = ImageIO.read(new File("img/background.jpg")); // Tem que ser do mesmo tamanho da tela exemplo
																		// 1920x1080)
		} catch (Exception e) {
			System.out.println(" Não foi possivel carregar a imagem");
			System.out.println(e);

		}

	}

	// Método responsavel por "desenhar" o background
	public void exibirBackground(Graphics g) {
		g.drawImage(background, 0, posBy - 720, null);
		g.drawImage(background, 0, posBy, null);

		if (posBy > 720) {
			posBy = 0;

		} else {
			posBy++;
		}
	}
}