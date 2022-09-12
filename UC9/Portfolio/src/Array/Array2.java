/**
 * Array Simples
 * Exemplo 2 - sorteio de uma carta
 */

package Array;

import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// Alt (esquerda) 3,4,5,6 (teclado numerico)
		String[] nipes= {"♥","♦","♣","♠"};
		String[] faces= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		// Recuperar a carta Áz de ouros
		System.out.println(faces[0] + nipes[1]);
		
		// Recuperar a carta Dama de copas
		System.out.println(faces[11] + nipes[0]);
		System.out.println("===================");
		System.out.println("Carta Sorteada:");
		
		// Criar um objeto de nome carta para gera um numero aleatorio
		Random carta = new Random();
		
		// Criar variavel do tipo inteiro que recebe um numero aleatorio
		// Entre 0 e tamanho maximo do vetor faces (faces.lenght)
		
		int indiceFace = carta.nextInt(faces.length);
		
		// Criar uma variavel do tipo inteiro que recebe um numero aleatorio
		// Entre 0 e tamanho maximo do vetor nipes (nipes.lenght)
		int indiceNipe = carta.nextInt(nipes.length);
		
		// Exibir o resultado
		System.out.println(faces[indiceFace] + nipes[indiceNipe]);
		

	}

}
