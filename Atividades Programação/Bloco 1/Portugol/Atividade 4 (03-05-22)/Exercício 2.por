programa
{
	
	funcao inicio()
	{
		inteiro dado[10], soma = 0, cont = 0
		real media
		para (inteiro i = 0; i < 10; i++){
			escreva ("\nEscreva o valor tirado no dado: ")
			leia (dado[i])
			soma += dado[i]
			se (dado[i] == 6){
				cont++
			}
		}
		escreva ("\nNúmeros que sairam nos lançamentos do dado:")
		para (inteiro i = 0; i < 10; i++){
			escreva (" ", dado[i], " ")
		}
		media = soma/10
		escreva ("\nA média dos números dos dados é: ", media)
		escreva ("\nA maior pontuação do dado saiu ", cont, " vezes.")
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */