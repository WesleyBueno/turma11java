programa
{
	
	funcao inicio()
	{
		/*
		 * 3.Faça um sistema que leia o tempo de duração de um evento 
		 * em uma fábrica expressa em segundos e mostre-o expresso 
		 * em horas, minutos e segundos. 
		 * 1seg = 1seg 
		 * 1min = 60seg 
		 * 1h = 60min 60*60= 3600 seg 

		 */
		//ingredientes-variaveis
		inteiro tempoDuracao =0
		inteiro horas =0
		inteiro segundos =0
		inteiro minuto =0

		//modo de preparo processamento
		escreva("digite tempo em segundos:")
		leia(tempoDuracao)
		horas = tempoDuracao/3600
		escreva("\ntotal de horas ", horas)
		minuto= ( tempoDuracao %3600)/60
		escreva("\ntotal de minuto :",minuto)
		segundos =( tempoDuracao %3600)%60
		escreva("\ntotal de segundos ",segundos)
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */