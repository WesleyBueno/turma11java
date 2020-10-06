programa
{

	/*2.Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/

	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LIMITE = 10
		inteiro valoresDado[LIMITE]
		inteiro soma = 0
		real media = 0
		real maiorValor = 0
		inteiro contador = 0
		
		escreva("Jogando dados")
		pula()
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6) 

			soma = soma + valoresDado[x]

			media = soma/LIMITE

			se(valoresDado[x]>maiorValor){
				maiorValor = valoresDado[x]
				
				}

			

				
		}
		para (inteiro x = 0; x < LIMITE; x++){
			escreva("O valor ",(x+1), " foi ",valoresDado[x])
			pula()

			se(valoresDado[x] == maiorValor){
				contador++
				}
			
			
		}
		escreva("Soma"+soma)
		escreva("\n A média é: "+ media)
		escreva("\n Maior valor foi: "+maiorValor)
		escreva("\nO maior valor apareceu "+contador+" vezes")
		
		
	}
	funcao pula(){
		
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 928; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */