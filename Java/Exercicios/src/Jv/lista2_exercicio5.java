package Jv;

import java.util.Scanner;

public class lista2_exercicio5 {

		public static void main(String[] args) {
			
			/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
			 * No final, mostre a soma dos números digitados.(DO...WHILE)
*/
			
			Scanner leia = new Scanner(System.in);
			int i =0;
			int somaValores = 0;
			do {
				System.out.printf("Informe um número: ");
				i = leia.nextInt();
				
				somaValores = somaValores + i;
				
			} while(i !=0); 
				
				
			System.out.printf("\nA soma dos valores é: %d",somaValores);
		}
}
