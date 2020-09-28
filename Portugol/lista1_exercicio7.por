programa
{
	
	funcao inicio()
	{

		//7.Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcul
		//a e mostra os valores de x e y.

		real a
		real b
		real c
		real d
		real the
		real f
		real x = 0
		real y = 0
	

		
		escreva("De um valor para a: ")
		leia(a)
		escreva("De um valor para b: ")
		leia(b)
		escreva("De um valor para c: ")
		leia(c)
		escreva("De um valor para d: ")
		leia(d)
		escreva("De um valor para e: ")
		leia(the)
		escreva("De um valor para f: ")
		leia(f)

		x=((c*the)-(b*f)/(a*the)-(b*d))
		y=((a*f)-(c*d)/(a*the-b*d))
		
		escreva("O valor de X é: "+x)
		escreva("O valor de Y é: "+y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */