package Atividade3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner leia = new Scanner (System.in);
		
		int [][] matriz = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("\nEntre com o valor da Matriz [%d][%d]: ", i+1, j+1);
				matriz [i][j] = leia.nextInt();
				if (matriz [i][j] > 10) {
					cont++;
				}
			}
		}
		
		System.out.println("\nA quantidade de números maiores que 10 na Matriz é: " + cont);
		
	}

}
