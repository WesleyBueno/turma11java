programa
{
	
	funcao inicio()
	{
		// pegar/receber/colher do usuario o nome e manda uma mensage de bom dia
		// colocando sr ou sra conforme a  opcao
		// ingredientes - variaveis
		cadeia nomeUsuario
		caracter opcao
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino :")
		leia(opcao)
		se (opcao == 'F'){
				escreva("Oi Senhora ",nomeUsuario)
		}
		senao se (opcao =='f'){
				escreva("Oi Senhora ",nomeUsuario)
		}
		senao se (opcao =='M'){
				escreva("Oi Senhor ",nomeUsuario)
		}
		senao se (opcao =='m'){
				escreva("Oi Senhor ",nomeUsuario)
		}
		senao {
		 		escreva("Oi Senhorx, ",nomeUsuario)
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */