programa
{
	
	funcao inicio()
	{
		real N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		para (inteiro i = 0; i < 4; i++){
			para (inteiro j = 0; j < 4; j++){
				escreva ("\nEntre com o valor de N1 da posição linha ", i+1, " coluna ", j+1, ": ")
				leia (N1[i][j])
				escreva ("\nEntre com o valor de N2 da posição linha ", i+1, " coluna ", j+1, ": " )
				leia (N2[i][j])
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
			}
		}
		para (inteiro i = 0; i < 4; i++){
			para (inteiro j = 0; j < 4; j++){
				escreva ("\nO resultado  da soma matriz soma na posição linha ", i+1, " coluna ", j+1, " é: ", M1[i][j])
			}
		}
		escreva("\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro j = 0; j < 4; j++){
				escreva ("\nO resultado  da soma matriz soma na posição linha ", i+1, " coluna ", j+1, " é: ", M2[i][j])
			}
		}
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */