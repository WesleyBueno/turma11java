programa
{
	
	funcao inicio()
	{
		//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		//calculo de média é a soma de todas as notas dividida pela quantidade
		real a,b,c
		real pesoA = 0
		real pesoB = 0
		real pesoC = 0
		real media = 0
		inteiro qntNotas = 3
		escreva("Sua nota na prova A: ")
		leia(a)
		escreva("Sua nota na prova B: ")
		leia(b)
		escreva("Sua nota na pova C: ")
		leia(c)
		pesoA= (a)*2
		pesoB= (b)*3
		pesoC= (c)*5
		media = (pesoA + pesoB + pesoC)/qntNotas)
		escreva("Sua média é: "+ media)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */