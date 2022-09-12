/**
 * Sistema de verificação de Eleitor
 * Fundamentos do Java
 * Exemplo 
 */
package fundamentos;

/**
 * @author Igor Oliveira
 *
 */
public class Eleitor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int idade = 15;
		System.out.println("Idade: " + idade);
		if (idade < 16) {
			System.out.println("Proibido votar|");
		} else if (idade == 16 || idade == 17 || idade > 70) {
        System.out.println(" Voto facultativo");
		} else {
			System.out.println(" Voto obrigatorio");
		}
	}

}
