programa
{
	/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
	funcao inicio()
	{

		inteiro b
		inteiro h
		escreva("informe o valor da base:")
		leia(b)
		escreva("informe o valor da altura")
		leia(h)

		se(b>=0 e h>=0){
			escreva("A área do triangulo é:"+((b*h)/2))
			}
		senao{
			escreva("Valores inválidos!")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */