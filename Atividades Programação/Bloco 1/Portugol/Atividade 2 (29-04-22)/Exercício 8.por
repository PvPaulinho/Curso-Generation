/*
8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
caso contrário imprimi-la com o valor zero
*/

programa
{
	
	funcao inicio()
	{
		real N
		escreva ("\nInsira um número: ")
		leia (N)
		se (N > 100){
			escreva ("\nO número é: ", N)
		}
		senao
			escreva ("0")
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */