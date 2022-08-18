package fundamentos;

public class EstruturaRepeticoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Estrutura for
		System.out.println("Exemplo 1 - for");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		System.out.println("-----------------------------");
		System.out.println("Exemplo 2 - for");
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}

		System.out.println("-----------------------------");
		System.out.println("Exemplo 3 - tabuada");
		int valor = 7;
		for (int x = 1; x < 11; x++) {
			System.out.println(valor + " x " + x + " = " + (valor * x));
		}

		System.out.println("-----------------------------");
		System.out.println("Exemplo 4 - tabuadas");
		for (int tabuada = 1; tabuada < 11; tabuada++) {
			System.out.println("");
			for (int calcular = 1; calcular < 11; calcular++) {
				System.out.println(tabuada + " x " + calcular + " = " + (tabuada * calcular));
			}
		}
		
		System.out.println("-----------------------------");
		System.out.println("Exemplo 5 - while");
		int z = 0;
		while (z < 10) {
			System.out.println(z);
			z++;
		}
		
		System.out.println("-----------------------------");
		System.out.println("Exemplo 6 - do while");
		int y = 10;
		do {
			System.out.println("teste");
		} while (y > 20);
		
		System.out.println("-----------------------------");
		System.out.println("Exemplo 7 - tabuada while");
		int tabuada7 = 7;
		int i = 1;
		while (i < 11) {
			System.out.println(tabuada7 + " x " + i + " = " + (tabuada7 * i));
			i++;
		}
		
		System.out.println("-----------------------------");
		System.out.println("Exemplo 8 - tabuada do while");
		int tabuada8 = 8;
		int v = 1;
		do {
			System.out.println(tabuada8 + " x " + v + " = " + (tabuada8 * v));
			v++;
		} while(v < 11);		
		
	}

}