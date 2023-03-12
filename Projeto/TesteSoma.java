package Projeto;

public class TesteSoma {
	public static void main(String[] args) {
		
		//declara as variáveis
		int INDICE = 13;
		int SOMA = 0;
		
		// Inicializa, condição, e incremento
		for(int K = 0; K < INDICE;  K++) {
			SOMA = SOMA + K;  // SOMA recebe o somtatorio do contador cada vez que ele repete o loop, até a condição
			System.out.println(SOMA);
			
		}
			System.out.print(" Valor Final.");
	}

}
