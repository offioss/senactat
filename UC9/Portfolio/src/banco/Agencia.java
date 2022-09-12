package banco;

public class Agencia {
	public double saldo = 2000;

	public void metodoSimples() {
		
	/**
	 * Método simples que executa um codigo
	 * Método ou função são blocos de codigos reutilizaveis
	 */
	System.out.println("Banco do Brasil");
    System.out.println("Agência Tatuapé");

	}
	
    /**
     * Método com passagem de valores (parâmetros)
     * Obs: Valores obrigatoriamente são variaveis
     */
    public void depositar(double valor) {
    	saldo+= valor;
    	System.out.println("Total: " + saldo);
    
    
        
    }
}	