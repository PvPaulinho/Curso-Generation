programa
{
	
	funcao inicio()
	{
		real valor=0.0, soma=0.0, media
		inteiro cont=0
		enquanto (valor >= 0){
			escreva ("\nDigite um valor: " )
			leia (valor)
			soma += valor
			cont ++
		}
		media = soma/cont
		escreva ("\nA quantidade de valores lidos foi: ", cont)
		escreva ("\nA soma dos valores inseridos é: ", soma)
		escreva ("\nA média dos valores inseridos é: ",media)
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */