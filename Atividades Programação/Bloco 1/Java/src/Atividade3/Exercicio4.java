package Atividade3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int [][] matriz1 = new int[3][3];
		int [][] matriz2 = new int[3][3];
		int [][] matriz3 = new int[3][3];
		int constante, menu = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("\nEntre com o valor da Matriz 1 [%d][%d]: ", i+1, j+1);
				matriz1 [i][j] = leia.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("\nEntre com o valor da Matriz 2 [%d][%d]: ", i+1, j+1);
				matriz2 [i][j] = leia.nextInt();
			}
		}
		
		while (menu != 5) {
			System.out.println("\n\n\tMenu\n1 - Somar as daus matrizes.\n2 - Subtrair a primeira matriz da segunda.\n3 - Adicionar uma contante as duas matrizes.\n4 - Imprimir as matrizes.\n5 - Sair");
			menu = leia.nextInt();
			if (menu == 1) {
				System.out.println("\nSoma das matrizes: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						matriz3 [i][j] = matriz1 [i][j] + matriz2 [i][j];
						System.out.printf("\t %d \t", matriz3 [i][j]);
					}
				}
			}
			else if (menu == 2) {
				System.out.println("\nSubtração das matrizes: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						matriz3 [i][j] = matriz2 [i][j] - matriz2 [i][j];
						System.out.printf("\t %d \t", matriz3 [i][j]);
					}
				}
			}
			else if (menu == 3) {
				System.out.println("\nInforme a constante que sedeja atribuir as matrizes: ");
				constante = leia.nextInt();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						matriz1 [i][j] += constante;
						matriz2 [i][j] += constante;
					}
				}
			}
			else if (menu == 4) {
				System.out.println("\n\nMatriz 1: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.printf("\t %d \t", matriz1 [i][j]);
					}
				}
				System.out.println("\n\nMatriz 2: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.printf("\t %d \t", matriz2 [i][j]);
					}
				}
				System.out.println("\n\nMatriz 3: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.printf("\t %d \t", matriz3 [i][j]);
					}
				}
			}
			else if (menu != 5){
				System.out.println("\nOpção inválidade, escolha uma das opções indicadas.");
			}
		}
		System.out.println("\nPrograma finalizado, obrigado por utilizar.");
	}
}
