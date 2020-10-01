programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario
		escreva("Digite um valor: ")
		leia(valorUsuario)
		parImpar(valorUsuario)
	}

	funcao parImpar(inteiro valorUsuario){
		se(valorUsuario %2==0 e valorUsuario>0)
		
		escreva("O número, "+valorUsuario+" é par e positivo!")
		
			
			
		senao se(valorUsuario %2==0 e valorUsuario<0){
			
			escreva("O número, "+valorUsuario+" é par e negativo!")
			 
			}
		senao se(valorUsuario %2>0 e valorUsuario>0){
			
			escreva("O número, "+valorUsuario+" é impar e positivo!")
					
					}
		senao se(valorUsuario %2>0 e valorUsuario<0){
			
			escreva("O número, "+valorUsuario+" é impar e negativo!")
			
						}
		senao se(valorUsuario == 0){
			escreva("Você digitou 0!")}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */