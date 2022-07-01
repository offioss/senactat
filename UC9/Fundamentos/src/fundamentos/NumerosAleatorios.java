/**
 * Fundamentos do Java
 * Numeros Aleatorios
 */
package fundamentos;

import java.util.Random;

/**
 * @author Igor Oliveira
 *
 */
public class NumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// As linhas abaixo geram numeros inteiros aleatoriamente
		// O "zero" sempre é considerado
        // (6) gerar numeros entre 0 e 5 (0 1 2 3 4 5)
		Random random = new Random();
		int face = random.nextInt(6) + 1;
		System.out.println(" Face do dado> " + face);
	}

}
