programa
{
	inclua biblioteca Util
	/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

 * 
 */
	const inteiro tamanho =3
		inteiro N1[tamanho][2],ln1,cn1
		inteiro N2[tamanho][2],ln2,cn2

	para(ln1=0;ln1<tamanho;ln1++){

		para(cn1=0;cn1<2;cn1++){

			escreva("Valor: ")
			leia(N1[ln1][cn1])
			}
		}

		limpa()
		para(ln1=0;ln1<tamanho;ln1++){

			para(cn1=0;cn1<2;cn1++){
				escreva("["+mat[ln1][cn1]+"]")
				}
				escreva("\n")

			
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */