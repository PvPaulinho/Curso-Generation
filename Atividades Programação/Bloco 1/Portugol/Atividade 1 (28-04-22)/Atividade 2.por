programa
{
	
	funcao inicio()
	{
		inteiro totaldias, ano, mes, dia, resto
		escreva("\nInforme a sua idade em dias: ")
		leia (totaldias)
		ano = totaldias/365
		resto = totaldias%365
		mes = resto/30
		dia = resto%30
		escreva ("\nSua idade é: ", ano, " anos, ", mes, " meses, ", dia, " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */