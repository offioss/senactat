/**
 * 
 */
package fundamentos;

/**
 * @author Igor.Oliveira
 *
 */
public class OperadoresAritmeticos {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 5;
		System.out.println("Operadores Artitimeticos");
		System.out.println("---------------------------------------");
		System.out.println("| Operador |    Exemplo   | Resultado |");
		System.out.println("|     =    |  x = 5       | " + x);
		System.out.println("|     -    |  x = 5 + 5   | " + (x + 5));
		System.out.println("|     -    |  x = 5 - 4   | " + (x - 4));
		System.out.println("|     *    |  x = 5 * 3   | " + (x * 3));
		System.out.println("|     /    |  x = 5 * 2   | " + (x / 2));
		System.out.println("|     *    |  x = 5 % 2   | " + (x % 2) + "(resto)");
		System.out.println("---------------------------------------");
	}

}
