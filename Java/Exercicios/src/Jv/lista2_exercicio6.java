package Jv;

import java.util.Scanner;

public class lista2_exercicio6 {

	public static void main(String[] args) {
		
		/*Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

*/
		Scanner leia = new Scanner(System.in);
		
		int i = 0;
		int multiplos3 = 0;
		int media = 0;
		int totalValores = 0;
		do {
			System.out.printf("Informe um valor inteiro: ");
			i = leia.nextInt();
			
			if(i%3 ==0) {
				
				
				multiplos3 = multiplos3 +1;
				totalValores = totalValores + i;
				media = totalValores/multiplos3;
			}
			
		}while(i !=0);
		
		System.out.printf("\nA média foi é: %d",media);
	}
	

}
