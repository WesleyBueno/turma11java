programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LIMITE = 10
		inteiro valoresDado[LIMITE]
		
		escreva("Sorteando valores")
		pula()
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
		}
		para (inteiro x = 0; x < LIMITE; x++){
			escreva("O valor ",(x+1), " foi ",valoresDado[x])
			pula()
			
		}
		
		
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
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */