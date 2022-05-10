programa
{
	
	funcao inicio()
	{
		inteiro totalsegundos, hora, minuto, segundos, resto
		escreva("\nInforme a duração do evento em segundos: ")
		leia (totalsegundos)
		hora = totalsegundos/3600
		resto = totalsegundos%3600
		minuto = resto/60
		segundos = resto%60
		escreva ("\nA duração do evento foi: ", hora, " horas, ", minuto, " minutos, ", segundos, " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */