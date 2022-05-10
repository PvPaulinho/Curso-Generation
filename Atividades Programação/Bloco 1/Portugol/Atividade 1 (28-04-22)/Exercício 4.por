programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro A, B, C
		real D, R, S
		escreva ("\nDigite o 1° numero: ")
		leia (A)
		escreva ("\nDigite o 2° numero: ")
		leia (B)
		escreva ("\nDigite o 3° numero: ")
		leia (C)
		R = mat.potencia ((A+B),2.0)
		S = mat.potencia ((B+C), 2.0)
		D = (R + S) / 2
		escreva ("\nO valor de D é: ", D)
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */