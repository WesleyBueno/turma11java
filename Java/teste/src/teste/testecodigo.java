package teste;

import java.util.Random;
import java.util.Scanner;

public class testecodigo {

	public static void main(String[] args) {
		
		
		
		//metodo main
		
			//declaração de variáveis
			int opc = 0, qtdeAlunos, x, y, grupos;
			//cria e preenche o array "alunos"
			String[] alunos = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa",
					"Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos",
					"Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter",
					"Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva",
					"Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto",
					"Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Leonardo Iamur Terra",
					"Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok",
					"Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque",
					"Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes",
					"Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos",
					"Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
			
			//instancia o Scanner
			Scanner entrada = new Scanner(System.in);
			
			//Cria um laço que sustem a execução enquanto 4 não for selecionada
			while(opc != 4){
				System.out.println("Digite a opção que deseja acessar: ");
				System.out.println("1 - Ver a lista de alunos");
				System.out.println("2 - Ver a Quantidade de alunos da sala de aula");
				System.out.println("3 - Separa-los em grupos randomicos");
				System.out.println("4 - Encerrar a aplicação");
				opc = entrada.nextInt();
				
				//seleciona a opção do Menu
				switch(opc) {
				//exibe o conteúdo de alunos
				case 1:
					System.out.print("Os alunos da sala são: ");
					for (int i = 0; i < alunos.length; i++) {
						System.out.print("\n"+(i+1)+" - "+alunos[i]);
					}break;
					
				//exibe a quantidade de alunos
				case 2:
					System.out.println("A sala possui "+alunos.length+" alunos");
					break;
				
				//exibe os grupos
				case 3:
					embaralhar(alunos);
					
					//captura o n° de alunos por grupo
					System.out.println("\nQual a qantidade desejada de alunos por grupo?");
					qtdeAlunos = entrada.nextInt();
					
					//encontra a quantidade de grupos
					grupos = alunos.length/qtdeAlunos;
					
					//exibe a quantidade de grupos
					System.out.println("serão "+grupos+" grupos");
					
					//utiliza o x como parametro para calcular o resto das divisões e atribuir cada uma a um grupo
					for(x = 0; x <grupos; x++) {
						System.out.print("\nGrupo: "+(x+1));
						
						//percorre o vetor
						for (y = 0; y <alunos.length; y++) {
							
							//toda vez que a sobra da divisão (indice do vetor/quantidade de grupos) for igual a x ele exibe o aluno
							if(y%grupos == x) {
								System.out.print("\n"+alunos[y]);
							}			
						}
						System.out.println("");
					}break;
				//finaliza o programa
				case 4:
					System.out.println("Obrigado e volte sempre!");
				}
				System.out.println("\n");
			}
		}
	
	public static void embaralhar(String [] vetor) {
		Random random = new Random();
		for (int i=0; i < (vetor.length); i++) {
			//encontra um indice aleatório
			 int j = random.nextInt(vetor.length);
			//troca o conteúdo dos índices i e j do vetor usando uma variavel auxiliar(aux)
			String aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}
}
	