/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são 
altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas
*/

programa
{
	
	funcao inicio()
	{
		real ip
		escreva("\nIndique o número do índice de poluição: ")
		leia(ip)
		se (ip <= 0.25)
			escreva ("\nÍndice de poluição está menor que 0.25, está em nível aceitável. Assim todas as empresas podem continuar com suas atividade.")
		senao se (ip > 0.25 e ip < 0.3){
			escreva("\nÍndice de pouluição não está em um nível aceitável, estando entre 0.25 e 0.3, ")
			escreva("\n\t1° grupo de impresas podem continuar suas atividades")
			escreva("\n\t2° grupo de impresas podem continuar suas atividades")
			escreva("\n\t3° grupo de impresas podem continuar suas atividades")
		}
		senao se (ip >= 0.3 e ip < 0.4){
			escreva("\nÍndice de pouluição não está em um nível aceitável, estando entre 0.3 e 0.4.")
			escreva("\n\t1° grupo de impresas devem suspender suas atividades")
			escreva("\n\t2° grupo de impresas podem continuar suas atividades")
			escreva("\n\t3° grupo de impresas podem continuar suas atividades")
		}
		senao se (ip >= 0.4 e ip < 0.5){
			escreva("\nÍndice de pouluição não está em um nível aceitável, estando 0.4 e 0.5.")
			escreva("\n\t1° grupo de impresas devem suspender suas atividades")
			escreva("\n\t2° grupo de impresas devem suspender suas atividades")
			escreva("\n\t3° grupo de impresas podem continuar suas atividades")
		}
		senao {
			escreva("\nÍndice de pouluição não está em um nível aceitável, estando maior que 0.5.")
			escreva("\n\t1° grupo de impresas devem suspender suas atividades")
			escreva("\n\t2° grupo de impresas devem suspender suas atividades")
			escreva("\n\t3° grupo de impresas devem suspender suas atividades")
		}
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */