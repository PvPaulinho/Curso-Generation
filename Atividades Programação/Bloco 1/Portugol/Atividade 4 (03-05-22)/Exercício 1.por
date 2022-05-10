programa
{
	
	funcao inicio()
	{
		real pontuacao [5], maior = 0
		para (inteiro i = 0; i < 5; i++){
			escreva ("\nEntre com uma pontuação: ")
			leia (pontuacao [i])
		}
		para (inteiro i = 0; i < 5; i++){
			escreva ("\n", i, " ° pontuação: ", pontuacao [i])
			se (pontuacao [i] > maior){
				maior = pontuacao [i]
			}
		}
		escreva ("\n\nA maior pontuação é: ", maior)
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */