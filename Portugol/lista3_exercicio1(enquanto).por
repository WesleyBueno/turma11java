programa
{

	/*Enquanto*/
	/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
	 * final o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
	 * valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o 
	 * usuário fornecer um valor negativo.
*/
	funcao inicio()
	{
		inteiro valor =0
		inteiro somatoria = 0
		inteiro media
		inteiro total = 0
		

		enquanto(valor>=0){
			
			escreva("Informe um valor: ")
			leia(valor)

			
			se(valor>0){
				total= total+1
				somatoria = somatoria + valor
				
				} senao se(valor==0){
					escreva("0 não soma\n")
					}
				senao{escreva("Negativo ")}
			} 
			se(somatoria>0){
			media = somatoria/total
			
			escreva("\n Soma dos números "+somatoria)
			escreva("\n Media dos valores "+ media)
			escreva("\n Total de numeros positivos informados "+ total)
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */