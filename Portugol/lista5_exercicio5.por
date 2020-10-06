programa
{
/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
 * Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem 
 * inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
*/
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo = 0
		inteiro x = 0

		para(x =0;x<5;x++){

		escreva("Informe os valores para o vetor: ")
		leia(vetor[x])
		limpa()
			
			}
		escreva("O que deseja fazer?"+"\nDigite 0 para sair"+"\nDigite 1 para imprimir o vetor na ordem direta"
		+"\nDigite 2 para imprimir o vetor na ordem inversa"+"\n")
		leia(codigo)

		se(codigo ==0){
			escreva("Fim")
			}
		senao se (codigo ==1){
			
			para (x = 0; x <5; x += 1){
				escreva (vetor[x],", ")}
			}
			senao se (codigo == 2){
			para (x = 4; x> = 0; x -= 1)
			{
				escreva ("", vetor [x], ",")
			}

			
			}
			senao{
				escreva("Opção invalida")
				}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */