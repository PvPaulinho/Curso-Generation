/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo
*/

programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva ("\nEntre com a altura do triângulo: ")
		leia (altura)
		escreva ("\nEntre com a base do triângulo: ")
		leia (base)
		se (altura <= 0 ou base <= 0){
			escreva ("\nOs valores inseridos não são válidos")
		}
		senao{
			area = (base * altura)/2
			escreva ("\nA área do triângulo é: ", area)
		}
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */