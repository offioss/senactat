/**
 * 
 */
package fundamentos;

/**
 * @author Igor Oliveira
 *
 */
public class EstruturasControle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String nome = "Igor Oliveira";
		int idade = 22;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		// Exemplo 1
		System.out.println("Exeplo 1 (if)");
		
		if (idade > 18) {
			System.out.println("Maior de Idade");
		}
        if (idade < 18) {
			System.out.println("Menor de Idade");
        }
		if (idade == 18) {
			System.out.println("Maio de Idade");
		}
		
		// Exemplo 2
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
        }
        if (idade <= 18) {
			System.out.println("Menor de Idade");

	    }
        // Entrada 3
        
        System.out.println("Exmplo 3 (if else)");
        if (idade < 18) {
        	System.out.println("Menor de Idade");
        } else {
        	System.out.println("Maior de Idade");
        }
}
}