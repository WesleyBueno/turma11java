programa
{
	/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos 
	 * de três e que se encontram no conjunto dos números de 1 até 500.
*/
	funcao inicio()
	{
		const inteiro limite = 500
		inteiro totalImpares = 0

		para(inteiro x = 1; x <=limite;x++){
			se (	((x % 3) == 0) e ((x%2)!=0)){
					totalImpares = totalImpares + x
				}
			}
			escreva("Total de impares multiplos de 3= "+totalImpares)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */