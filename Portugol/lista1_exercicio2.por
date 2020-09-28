programa
{
	
	funcao inicio()
	{
		// 2.Faça um sistema que leia a idade de uma pessoa expressa em dias 
		//e mostre-a expressa em anos, meses e dias. 

		inteiro idade
		inteiro ano
		inteiro meses
		inteiro dias

		/*escreva("Indique sua idade em dias: ")
		leia(idade)
		escreva("Sua idade em anos é: "+(idade/365))
		escreva("\n Sua idade em meses é: "+(idade/12))
		escreva("\n Sua idade em dias é: "+idade)*/

		escreva("informe sua idade: ")
		leia(idade)
		ano= idade/365
		escreva("\nSua idade em anos é: "+ano)
		meses=(idade%365)/30
		escreva("\nSua idade em meses é: "+meses)
		dias=(idade%365)%30
		escreva("\nSua idade em dias é:" +dias)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */