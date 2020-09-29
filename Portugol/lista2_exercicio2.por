programa
{

/*    2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
 *     de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 *     Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso 
 *     contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o 
 *     salário total e o salário excedente.
*/
	
	funcao inicio()
	{
		real codigo
		real tempoTrabalhado 
		real salarioTotal
		real excesso 
		inteiro tempoMedio = 50
		
		escreva("Quantas linhas de código você fez?")
		leia(codigo)
		escreva("Quantas horas você passou programando?")
		leia(tempoTrabalhado)
		salarioTotal = (tempoTrabalhado*10)
		excesso = (tempoTrabalhado - tempoMedio)

		se(tempoTrabalhado <= 50){
			escreva("Seu salário total é de:"+salarioTotal+"\n E seu salário excedente é de:0")
			}
			se nao(tempoTrabalhado >50){
				escreva("Seu salário total é de:"+salarioTotal+"\n E seu salário excedente é de:"+excesso)
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */