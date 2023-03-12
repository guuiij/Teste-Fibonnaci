package Projeto;
	

import java.util.Scanner;

public class NomeSexo {
	public static void main(String[] args ) {
		int soma = 2;
		
		// informa nome e sexo
		String nome;
		String sexo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		nome = ler.nextLine();
		System.out.println("Informe Sexo \n( M ) Masculino, ( F ) Feminino;");
		sexo = ler.nextLine();
		
		if((sexo == "M" ) || (sexo == "m")) { 
			System.out.println("Seja bem-vindo Sr. " + nome );
		} else {
			System.out.println("Seja bem-vinda Sra. " + nome);
		}
		


		
		
		
		
		
		
		
		/*int i;
		// o especificador de formato para caractere (%c)
		// mostra o i-ésimo caractere da tabela ASCII
		System.out.printf("Caracteres numérscos:\n");
		for (i = 48; i <= 57; i++) {
			System.out.printf("%c", i);
		}
		System.out.printf("\n\nCaracteres alfabéticos maiúsculos:\n");
		for (i = 65; i <= 90; i++) {
			System.out.printf("%c", i);
		}

		System.out.printf("\n\nCaracteres alfabéticos minúsculos:\n");
		for (i = 97; i <= 122; i++) {
			System.out.printf("%c", i);
		}
		System.out.printf("\n");
*/
	}

}
