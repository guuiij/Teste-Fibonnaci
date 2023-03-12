package Projeto;

import java.util.Scanner;

public class PalavraInvertida {
	public static void main(String[] args) {

		// Algoritmo onde usuario digita algo e é imprimido ao contrário

		Scanner ler = new Scanner(System.in); // entrada usuario

		System.out.println("Digite o que deve ser invertido");
		String entrada = ler.nextLine(); // string que recebe palavra digitada
		String saida = ""; // variavel para saida

		for (int i = entrada.length() - 1; i >= 0; i--) { // entrada.lengh ( TAMANHO DA ENTRADA )
			saida = saida + entrada.charAt(i); // charAt() pega o caractere do determinado indice e atribui a variavel
												// saida

		}
		System.out.println(saida);
		
		// OUTRA POSSÍVEL FORMA
	//	String s = "TEXTO"; String invertida = new StringBuilder(s).reverse().toString();

	}

}
