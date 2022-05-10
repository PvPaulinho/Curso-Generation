/*
3) Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4, q1, q2, q3, q4
		escreva("\nInsira o 1° número: ")
		leia(num1)
		escreva("\nInsira o 2° número: ")
		leia(num2)
		escreva("\nInsira o 3° número: ")
		leia(num3)
		escreva("\nInsira o 4° número: ")
		leia(num4)
		q1 = mat.potencia(num1, 2)
		q2 = mat.potencia(num2, 2)
		q3 = mat.potencia(num3, 2)
		q4 = mat.potencia(num4, 2)
		se(q3 >= 1000)
			escreva("\nO quadrado do terceiro número é: ", q3)
		senao{
			escreva("\nO 1° número é: ", num1, ", e o seu quadrado é: ", q1)
			escreva("\nO 2° número é: ", num2, ", e o seu quadrado é: ", q2)
			escreva("\nO 3° número é: ", num3, ", e o seu quadrado é: ", q3)
			escreva("\nO 4° número é: ", num4, ", e o seu quadrado é: ", q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */