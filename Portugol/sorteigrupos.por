programa
{
	inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			escreva("═")
		}
	}
	
	funcao inicio()
	{
		//DECLARANDO OS VETORES
		const inteiro LIMITE = 39
		inteiro mat[LIMITE] // 0-38
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro x = 0
		inteiro grupos[20]
		para (x = 0; x <LIMITE; x++)
		{
			mat[x] = x+1
		}
		escreva("Matricula       Alunox")
		pula()
		para (x = 0; x < LIMITE; x++)
		{
			//fuciona bem até o 9
			se (x < 9)
			{
				escreva("  ",mat[x],"             ",lista[x]) 	
			}
			senao
			{
				escreva("  ",mat[x],"            ",lista[x]) 	
			}
			pula()
		}
		para(x=0; x<20;x++){
			escreva("Informe a quantidade por grupo")
			leia(grupos[20])

			

			escreva("Os grupos são: "+(grupos[20]))
			
			
			}
		
	}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */