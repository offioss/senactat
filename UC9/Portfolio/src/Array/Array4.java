/**
 *  Fundamentos do Java
 *  Estudo do array de duas dimensões (MATRIZ)
 */
package Array;

public class Array4 {

	public static void main(String[] args) {
		// [][] [linha][coluna]
		String[][] agenda = { { "Bill Gates", "94002-8922", "manobill@outlook.com" },
				{ "Felipe Parisi", "94002-8923", "manoparisi@outlook.com" },
				{ "Higor Breakfast", "94003-8933", "manobreakfast@outlook.com" } };
		// Recuperar o email do Parisi
		// System.out.println(agenda[1][2]);
		// Recuperar o telefone do Bill Gates
		// System.out.println(agenda[0][1]);
		// Percorrendo a amtrix com o laço for
		System.out.println("===================================================================");
		System.out.println("===================== Agenda de Contatos ==========================");
		System.out.println("===================================================================");
		System.out.println("");
		for (int i = 0; i < agenda.length; i++) {

			// 2º laço faz a varredura das colunas
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}
}
