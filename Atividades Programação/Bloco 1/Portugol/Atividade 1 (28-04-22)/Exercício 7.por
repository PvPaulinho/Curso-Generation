programa
{
	
	funcao inicio()
	{
		real a, b, c, d, E, f, x, y
		escreva ("\nEntre com o valor de a: ")
		leia (a)
		escreva ("\nEntre com o valor de b: ")
		leia (b)
		escreva ("\nEntre com o valor de c: ")
		leia (c)
		escreva ("\nEntre com o valor de d: ")
		leia (d)
		escreva ("\nEntre com o valor de e: ")
		leia (E)
		escreva ("\nEntre com o valor de f: ")
		leia (f)
		x = ( (c * E) - (b * f) ) / ( (a * E) - (b * d) )
		y = ( (a * f) - (c * d) ) / ( (a * E) - (b * d) )
		escreva ("\nO valor de x é: ", x)
		escreva ("\nO valor de y é: ", y)
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */