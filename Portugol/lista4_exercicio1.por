programa
{
	/*1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	 * Encontre após a maior pontuação e a apresente.
*/
	funcao inicio()
	{
		inteiro pontuacao[5],p 
		inteiro maiorPontuacao = 0
		inteiro total = 0

		para(p=0;p<5;p++){
			escreva("Informe sua pontuação: ")
			leia(pontuacao[p])
			total = pontuacao[p]+total
			
			se(pontuacao[p]>maiorPontuacao){
				maiorPontuacao = pontuacao[p]
				
				}
			}

			
			escreva("Sua pontuação foi: "+(total))
			escreva("\nMaior pontuação foi: "+(maiorPontuacao))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */