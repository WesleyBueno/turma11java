programa
{
/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos:
[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.*/
	funcao inicio()
	{
		inteiro n = 1
		inteiro i1 =0
		inteiro i2 =0
		inteiro i3 =0
		inteiro i4 =0

		enquanto(n>0){
			escreva("Informe um número: ")
			leia(n)
			limpa()
			
			se(n>0 e n<=25){
				i1 = i1+1
				}
			senao se(n>=26 e n<=50){
				i2 = i2+1
				}
			senao se(n>=51 e n<=75){
				i3 = i3+1
				}
			senao se(n>=76 e n<=100){
				i4 = i4+1
				}
				}

				escreva("A quantidade de números entre 0-25 foi: ",i1,"\n A quantidade de números entre 26-50 foi: "+i2+
				"\n A quantidade de núemros entre 51-75 foi: "+i3+"\n A quantidade de números entre 76-100: "+i4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */