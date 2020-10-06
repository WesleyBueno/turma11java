programa
{
	inclua biblioteca Matematica --> mat
	/*
1) Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da 
condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o 
cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/
	funcao inicio()
	{
		 const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {100.00, 300.50, 90.75, 250.00}
		inteiro x
		inteiro codigo
		inteiro pgto = 0
		inteiro valorDinheiro = 0
		inteiro valorCartao = 0
		inteiro valor2 = 0
 		inteiro valor4 =0
		real calculo = 0

		
		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		escreva("Vai compra o que? Digite o codigo do produto:")
		leia(codigo)
		codigo= codigo-1
		pulalinha()
		escreva("Vc escolheu ",produtos[codigo]," no valor de ", precos[codigo])
		pulalinha()
		escreva("Vai pagar como:\n")
		escreva("1 À vista em dinheiro ou cheque, recebe 20% de desconto \n")
		escreva("2 À vista no cartão de crédito, recebe 15% de desconto \n")
		escreva("3 Em duas vezes, preço normal de etiqueta sem juros \n")
		escreva("4 Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		escreva("Digite o numero da opcao:")
		leia(pgto)
		
		se(pgto ==1){
			
			

			calculo = (20*precos[codigo])/100
			valorDinheiro = precos[codigo] - calculo

			escreva("Você escolheu a condição de pagamento ", pgto, " e com 20% de desconto seu produto tem um total de: ",  mat.arredondar(valorDinheiro,3))
			
			}
			se(pgto ==2){

			calculo = (15*precos[codigo])/100
			valorCartao = precos[codigo] - calculo

			escreva("Você escolheu a condição de pagamento ", pgto, " e com 15% de desconto seu produto tem um total de: ",  mat.arredondar(valorCartao,3))
				
				}

			se(pgto == 3){
				valor2 = precos[codigo]

				escreva("Você escolheu a condição de pagamento ", pgto, " em duas vezes seu produto tem um total de: ",  mat.arredondar(valor2,3))
				}

			se(pgto == 4){
				calculo = (10*precos[codigo])/100)
				valor4 = (precos[codigo]*3)+calculo

				escreva("Você escolheu a condição de pagamento ", pgto, " em três vezes, mais 10% de juros seu produto tem um total de: ",  mat.arredondar(valor4,3))
				}
			
		
	}
	
	funcao pulalinha()
	{
		escreva("\n")
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */