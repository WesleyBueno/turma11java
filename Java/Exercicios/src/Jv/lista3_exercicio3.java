package Jv;

import java.util.Scanner;

public class lista3_exercicio3 {

	public static void main(String[] args) {
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/		Scanner minion = new Scanner(System.in);
		
		int[][] matriz = new int[3][3] ;
		int contador =0;
			
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.printf("Informe um número: ");
				matriz[i][j] = minion.nextInt();
				
				if (matriz[i][j]>10) {
					contador++;
				}
			
			}
		}
		
		System.out.printf("Foram digitados: %d",contador);
	}

}
