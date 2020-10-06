programa
{
	/*4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
	 * soma dos valores da primeira diagonal, ou seja, diagonal principal.
*/
	funcao inicio()
	{
		const inteiro tamanho = 3
		inteiro mat[3][3],l,c

		inteiro somaTotal = 0
		inteiro somaDiagonal = 0
		

		para(l=0;l<tamanho;l++){

		para(c=0;c<3;c++){

			escreva("Valor: ")
			leia(mat[l][c])

			somaTotal = somaTotal + mat[l][c]
			somaDiagonal = (mat[0][0]) + (mat[1][1]) + (mat [2][2])
			}
		}

		limpa()
		para(l=0;l<tamanho;l++){

			para(c=0;c<3;c++){
				escreva("["+mat[l][c]+"]")
				}
				escreva("\n")

			}

			escreva("\nSoma total : "+somaTotal)
			escreva("\nSoma da diagonal: "+somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */