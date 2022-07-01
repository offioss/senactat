/**
 * 
 */
package fundamentos;

/**
 * @author Igor Oliveira
 *
 */
public class OperadoresAtribuicao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double x = 5;
    System.out.println("       Operadores Aritméticos     ");
	System.out.println("----------------------------------");
	System.out.println("| Operador | Exemplo |  Resultado");
    System.out.println("|    =     |  x = 5  | " + x );
    System.out.println("|    x=    | x  += 5 | " + (x += 5));
    System.out.println("|    -=    | x  -= 4 | " + (x -= 4));
    System.out.println("|    *=    | x  *= 3 | " + (x *= 3));
    System.out.println("|    /=    | x  /= 2 | " + (x /= 2));
    
    System.out.println("|    ++    |   x++   | " + x);
    x++; // Soma 1 a Variavel ( x= x + 1)
    System.out.println("|    --    |   x--   | " + x);
    x--; // Subtrai 1 a Variavel (x = x - 1)
    System.out.println("----------------------------------");
	}

}
