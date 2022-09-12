package sprites;

import java.awt.Color;
import java.awt.Graphics;

public class Laser {
// Variaveis
	int posXL;
	int posYL = 540;

	// Construtor que recebe como parâmetro a posição da nave
	public Laser(int posXLInicial) {
		posXL = posXLInicial;

	}

	// Metodo responsavel para exibir(desenhar) o tiro do laser
	public void exibirLaser(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(posXL, posYL, 5, 20); // x, y, width, height

	}

	// Metodo responsavel pelo movimento do laser
	public void moverLaser() {
		posYL -= 5; // Ajuste da valocidade do tiro do laser
		// Apoio ao entendimento da logica do tiro
		// System.out.println(posYL);
	}

	// metodo responsavel pela "remoção" do laser
	public boolean removerLaser() {
		if (posYL < 0) {
			return true;
		} else {
			return false;
		}
	}
}