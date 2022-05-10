programa
{
	
	funcao inicio()
	{
		real salario, ss = 0.0, ms, mf, ps, maiors = 0.0
		inteiro cont=0, filhos, sf=0
		para (inteiro x=1; x<=20; x++){
			escreva ("\nDigite o salário da pessoa em R$: ")
			leia (salario)
			escreva ("\nDigite o número de filhos da pessoa: ")
			leia (filhos)
			ss = ss + salario
			sf = sf + filhos
			se (salario > maiors){
				maiors = salario
			}
			se (salario <= 100){
				cont++
			}
		}
		ms = ss / 20
		mf = sf / 20
		ps = (cont / 20.0) * 100.0
		escreva ("\nA média do salário da população é: ", ms, " R$.")
		escreva ("\nA média de filhos da população é: ", mf)
		escreva ("\nO maior salário entre a população é: ", maiors, " R$.")
		escreva ("\nO persentual de salários abaixo de 100 R$ é: ", ps, " % da população.")
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */