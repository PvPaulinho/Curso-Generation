package Atividade2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int contp = 0, conti = 0, num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				contp++;
			}
			else
				conti++;
		}
		System.out.println("\nA quantidade de n�meros pares �: " + contp);
		System.out.println("\nA quantidade de n�meros impares �: " + conti);
	}

}
