programa
{
	
	funcao inicio()
	{
		real x[3][3], soma = 0.0, somadiagonal = 0.0
		para (inteiro i = 0; i < 3; i++){ 
			para (inteiro j = 0; j < 3; j++){
				escreva ("\nInsira o volar: ")
				leia (x[i][j])
				soma = soma + x[i][j]
				se (i == j){
					somadiagonal = somadiagonal + x[i][j]
				}
			}
		}
		escreva ("\nO valor da soma é: ", soma)
		escreva ("\nO valor da soma é: ", somadiagonal)
		
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */