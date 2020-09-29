programa
{
	/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
	funcao inicio()
	{
		inteiro A = 0
		inteiro B = 0
		inteiro C = 0
		inteiro D = 0
		
		escreva("Informe o valor o valor de A: ")
		leia(A)
		escreva("Informe o valor o valor de B: ")
		leia(B)
		escreva("Informe o valor o valor de C: ")
		leia(C)
		escreva("Informe o valor o valor de D: ")
		leia(D)

		se((C*C)>=1000){
			escreva("O valor de C é:"+C+" e seu quadrado é:"+(C*C))
			
		}senao{

			escreva( "\nValor de A: "+A+" e seu quadrado é: "+(A*A))
			escreva( "\nValor de B: "+B+" e seu quadrado é: "+(B*B))
			escreva( "\nValor de C: "+C+" e seu quadrado é: "+(C*C))
			escreva( "\nValor de D: "+D+" e seu quadrado é: "+(D*D))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */