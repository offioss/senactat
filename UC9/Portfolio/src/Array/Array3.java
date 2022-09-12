/**
 * FUNDAMENTOS DO JAVA
 * ESTUDO DO ARRAY - ARRAY LIST (DINAMICO)
 */
package Array;

import java.util.ArrayList;

public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*******************
		 **** ARRAYLIST ****
		 *******************/

		// Criacao do vetor dinamico
		ArrayList<String> contatos = new ArrayList<>();

		// Adiciona itens ao vetor
		contatos.add("Igor Oliveira");
		contatos.add("11-961024801");
		contatos.add("oliveir4a.i@gmail.com");
		contatos.add("Fagner Geraldes Braga");
		contatos.add("11-961024801");
		contatos.add("fagner.fgb@gmail.com");

		// Imprime o conteudo do arraylist
		System.out.println(contatos);

		// Imprime o tamanho do vetor
		System.out.println("Tamanho do vetor: " + contatos.size());

		// Imprime um valor do vetor
		System.out.println("Indice 2: " + contatos.get(2));

		System.out.println("-----------------------------------------");
		System.out.println("Removendo um valor do array");

		// Remove um valor do vetor
		System.out.println(contatos.remove(4));

		System.out.println(contatos);
		System.out.println("Tamanho do vetor: " + contatos.size());
		// usando um laço for para percorrer o array
		System.out.println("Agenda de contatos");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}

	}

}
