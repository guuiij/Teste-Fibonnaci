package Projeto;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int temp = 1;
		int num;

		Scanner numero = new Scanner(System.in);
		System.out.println("Informe numero");
		num = numero.nextInt();
		do {
			a = b;
			b = temp;
			temp = a + b;
			System.out.println(temp);
			if (num == temp) {
				System.out.println("Pertence a sequênica de FIBO");
			}

		} while (temp < 100);
	}
}