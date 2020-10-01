programa
{
	inclua biblioteca Matematica --> mat
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
	 * A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/
	funcao inicio()
	{
		inteiro habitante =3
		real salario = 0
		inteiro filho
		inteiro soma
		inteiro media
		real maiorSalario = 0
		inteiro somaFilhos = 0
		inteiro mediaFilhos
		inteiro percentual = 0
		real salarioMenosDeCem = 0
		
		para(inteiro i=1;i<=habitante;i++){

			escreva("Informe o salário: ")
			leia(salario)
			escreva("Informe a quantidade de filhos(as): ")
			leia(filho)

			se(salario>maiorSalario){
				maiorSalario = salario
				
				}
				se(salario<=100){

				salarioMenosDeCem +=1
					}
			soma = salario + salario
			somaFilhos = somaFilhos+filho
			
			
			
			}
			
			
		media = salario/habitante
		mediaFilhos = somaFilhos/habitante
		percentual = (salarioMenosDeCem*100)/habitante

		escreva("Média salarial : "+ mat.arredondar(media,2))
		escreva("\nMédia filhos: "+ mediaFilhos)
		escreva("\n Maior salario: "+maiorSalario)
		escreva("\n Pessoas com salário menor que 100: "+percentual+"%")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */