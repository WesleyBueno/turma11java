programa
{
	
	funcao inicio()
	{

		//4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
		//e calcule a seguinte expressão: 
		//R = (a+b)*(a+b)
		// S = (b+c)*(b+c)
		// D = (R+S)/2
		
		inteiro a,b,c
		
		
		
		escreva("\n Informe o operador A: ")
		leia(a)
		escreva("\n Informe o operador B: ")
		leia(b)
		escreva("\n Informe o operador C: ")
		leia(c)

		inteiro R = (a+b)*(a+b)
		inteiro S = (b+c)*(b+c)
		inteiro D = (R+S)/2
		
		escreva("\n O valor de R é: "+R)
		escreva("\n O valor de S é: "+S)
		escreva("\n O valor de D é: "+D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */