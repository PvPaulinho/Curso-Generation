package Atividade2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos 
		 * indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
		 * calcule e mostre: (WHILE)
			�	o n�mero de pessoas calmas; 
			�	o n�mero de mulheres nervosas; 
			�	o n�mero de homens agressivos; 
			�	o n�mero de outros calmos;
			�	o n�mero de pessoas nervosas com mais de 40 anos; 
			�	o n�mero de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, p,cont = 0, pcalma = 0, mnervosa = 0, hagressivo = 0, ocalmo = 0;
		int p40nervosa = 0, p18calma = 0;
		
		while (cont != 5) {
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			System.out.println("\nSe for mulher digite 1, se for homem digite 2, para outros digite 3:  ");
			sexo = leia.nextInt();
			System.out.println("\nInforme a caracter�stica psicol�gica \nDigite 1 para calma, Digite 2 para nervosa, Digite3 para agressiva");
			p = leia.nextInt();
			
			if (p == 1) {
				pcalma++;
				if (sexo == 3) {
					ocalmo++;
				}
				if (idade < 18) {
					p18calma++;
				}
			}
			if (sexo == 1 && p == 2) {
				mnervosa++;
			}
			if (sexo == 2 && p == 3) {
				hagressivo++;
			}
			if (p == 2 && idade > 40) {
				p40nervosa++;
			}
			cont++;
		}
		System.out.println("\nO n�mero de pessoas calmas �: " + pcalma);
		System.out.println("\nO n�mero de mulheres nervosas �: " + mnervosa);
		System.out.println("\nO n�mero de homens agressivos �: " + hagressivo);
		System.out.println("\nO n�mero de outros calmos �: " + ocalmo);
		System.out.println("\nO n�mero de pessoas nervosas aciama de 40 anos �: " + p40nervosa);
		System.out.println("\nO n�mero de pessoas calmas abaixo de 18 anos �: " + p18calma);
		
	}

}
