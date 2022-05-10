/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
e se é positivo ou negativo.
*/

programa
{
	
	funcao inicio()
	{
		inteiro num, resto
		escreva("\nDigite um número: ")
		leia(num)
		resto = num%2
		se (resto ==0){
			escreva("\nEste número é par.")
		}
		senao
			escreva("\nEste número é impar.")
		se (num < 0)
			escreva("\nEste número é negativo.")
		senao
			escreva("\nEste número é posivo.")
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */