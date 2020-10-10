package Jv;

import java.util.Scanner;

public class lista3_exercicio4 {

	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na 
própria matriz.
*/
		Scanner minion = new Scanner(System.in);

		
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		
		int opcoes = 0;
		int somaMatriz1 =0;
		int subtraiMatriz1 = 0;
		int somaMatriz2 =0;
		int subtraiMatriz2 = 0;
		int total =0;
		
		final int x=2;
		final int y =2;
		
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				
				System.out.println("informe os valores da matriz 1: ");
				matriz1[i][j] = minion.nextInt();
				
				somaMatriz1 += matriz1[i][j];
				subtraiMatriz1 += matriz1[i][j];
			}
		}
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				
				System.out.println("informe os valores da matriz 2: ");
				matriz2[i][j] = minion.nextInt();
				
				somaMatriz2 += matriz2[i][j];
				subtraiMatriz2 += matriz2[i][j];
				
			}
			
		
			}
		System.out.println("Escolha o que deseja fazer: 1-Somar as duas matrizes 2- Para subtrair a primeira da segunda "
				+ "3- Adicionar uma constante as duas matrizes 4-Imprimir as matrizes");
		opcoes = minion.nextInt();
		
		if(opcoes ==1) {
			
			total = somaMatriz1 + somaMatriz2;
			
			System.out.println("A soma das matrizes é: "+total);
			}
			if(opcoes ==2) {
				
				total = subtraiMatriz1 - subtraiMatriz2;
				System.out.println("A subtração das matrizes é: "+total);
			
			}
			
			if (opcoes ==3) {
				
				for (int i = 0; i < x; i++) {
					for (int j = 0; j <y; j++) {
						
						System.out.println("Matriz X: "+matriz1[i][j]);
					}
				}
				
				for (int i = 0; i <x; i++) {
					for (int j = 0; j <y; j++) {
						
						System.out.println("Matriz Y: "+matriz2[i][j]);
					}
				
				
			}
			}
			if(opcoes ==4) {
				
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1.length; j++) {
						
						System.out.println("A matriz 1 é: "+matriz1[i][j]);
						
					}
				}
				for (int i = 0; i < matriz2.length; i++) {
					for (int j = 0; j < matriz2.length; j++) {
						
						
						System.out.println("A matriz 2 é: "+matriz2[i][j]);
					}
				}
				
				
			}
	}

}
