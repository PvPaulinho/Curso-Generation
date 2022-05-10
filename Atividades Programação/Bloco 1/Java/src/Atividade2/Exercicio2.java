package Atividade2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int contp = 0, conti = 0, num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				contp++;
			}
			else
				conti++;
		}
		System.out.println("\nA quantidade de números pares é: " + contp);
		System.out.println("\nA quantidade de números impares é: " + conti);
	}

}
