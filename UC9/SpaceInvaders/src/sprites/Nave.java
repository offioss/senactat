package sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Nave {
	// Criar um sprite com uma imagem existente
	BufferedImage sprite1;

	// Variaveis
	int posX = 600;
	int velocidade = 7;
	int posY = 600;

	// Construtor
	public Nave() {
		// Tratamento de exceções
		try {
			// Carregar a imagem(upload)
			sprite1 = ImageIO.read(new File("img/nave2.png"));
		} catch (Exception e) {
			System.out.println("Não foi possivel carregar a imagem");
			System.out.println(e);
		}
	}

	// Método que ao ser executado recebe um valor para a variavel sentido
	public void exibirNave(Graphics g) {
		g.drawImage(sprite1, posX, posY, null); // 600 -> posição x | 550 - > pos y

	}

	// Método que ao ser executado recebe um valor para a variavel sentido
	public void moverNave(int sentido) {
		// Positivo >>>>
		// Negativo <<<<
		
		if (sentido == 1) {
			posX += velocidade;

		} else if (sentido == -1) {
			posX -= velocidade;

		} else if (sentido == -2) {
			posY += velocidade;
		} else if (sentido == 2) {
			posY -= velocidade;
		}
		
		// Evitar que a nave suma
		if (posX >= 1175) { 
			posX = 1175;
		}

		if (posX <= 0) { 
			posX = 0;
		}

		if (posY >= 560) {
			posY = 560;
		}
		if (posY <= 3) {
			posY = 3;

		}
	}
}
