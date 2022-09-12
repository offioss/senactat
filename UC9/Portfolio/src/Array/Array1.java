/**
 * Array Simples
 * Exeplo 1 - Array simples (vetor)
 */
package Array;

public class Array1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Array Simples (VETOR)
		String[] times = { "Corinthians", "São Paulo", "Palmeiras", "Santos" };
		
		/*
		 * Recupera o valor do indice
		 */
		System.out.println(times[0]);
		 
		/*
		 * Informa o tamanho do array 
		 */
		System.out.println("Tamanho do array: " + times.length);
		 
		/*
		 * Laço para percorrer todo o array
		 */
		System.out.println("======================");
		System.out.println("Times");
		System.out.println("======================");
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
			
		}
	}

}
