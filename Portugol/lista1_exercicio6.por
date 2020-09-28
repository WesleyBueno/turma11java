programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		//6. Construa um programa em c que, 
		//tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		//escreva a distância entre eles. A fórmula que efetua tal cálculo é: 

		real x1
		real y1
		real x2
		real y2
		real d =0
		escreva("Informe o valor dos pontos x1: ")
		leia(x1)
		escreva("Informe o valor dos pontos y1: ")
		leia(y1)
		escreva("Informe o valor dos pontos x2: ")
		leia(x2)
		escreva("Informe o valor dos pontos y2: ")
		leia(y2)
		
		
	 	//d= math.raiz((x2-x1)*(x2-1)+(y2-y1)*(y2-1))
	 	escreva("o valor de d é: "+(mat.raiz(mat.potencia(x2-x1, 2)+ mat.potencia(y2-y1, 2),2)))


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */