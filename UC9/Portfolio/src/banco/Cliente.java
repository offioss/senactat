package banco;

public class Cliente {

	/**
	 * Método principal - > Ponto de partida
	 * Observação: só pode existir um método principal
	 * @param args
	 */
     public static void main(String[] args) {
    	 System.out.println("============================");
    	 // Acessar os métodos e variaveis de outra classe
    	 Agencia agencia = new Agencia();
    	 // Método simples
    	 agencia.metodoSimples();
    	 // Método com passagem de valor
    	 agencia.depositar(3000);
     }
}
