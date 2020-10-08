package Jv;

import java.util.Scanner;

public class lista2_exercicio3 {
	
	public static void main(String[] args) {
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int total20 = 0;
		int total51 = 0;
		
		while(idade>-99) {
			
			System.out.printf("Informe uma idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				
				total20 = total20 +1;
			}
			
			if(idade>50) {
				
				total51 = total51 +1;
			}
		}
		
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d",total20);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d",total51);
	}

}
