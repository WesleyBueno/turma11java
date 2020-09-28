programa
{
	
	funcao inicio()
	{
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		//meses e dias e mostre-a expressa apenas em dias.

		//variaveis
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias
		
		escreva("Digite os anos: ")
		leia(anos)
		escreva("Digite os meses: ")
		leia(meses)
		escreva("Digite os dias: ")
		leia(dias)

		totalDias = ((anos*365)+(meses*30)+dias)

		escreva("Total de dias é: "+totalDias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */