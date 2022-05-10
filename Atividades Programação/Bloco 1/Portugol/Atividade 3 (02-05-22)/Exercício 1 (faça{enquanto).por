programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro cont = 233
		faca {
			limpa ()
			escreva ("\nContagem: ", cont)
			Util.aguarde(1000)
			cont = cont+3
		}enquanto (cont < 300)
		faca {
			limpa ()
			escreva ("\nContagem: ", cont)
			Util.aguarde(1000)
			cont = cont+5
		}enquanto (cont < 400)
		faca {
			limpa ()
			escreva ("\nContagem: ", cont)
			Util.aguarde(1000)
			cont = cont+3
		}enquanto (cont < 456)
		limpa ()
		escreva ("\nContagem finalizada")
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */