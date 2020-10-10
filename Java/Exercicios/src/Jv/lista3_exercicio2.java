package Jv;

import java.util.Scanner;

public class lista3_exercicio2 {
	
	public static void main(String[] args) {
		
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
		
	
	
	Scanner leia = new Scanner(System.in);
	
	final int LIMITE =6;
	int numeros[] = new int [LIMITE] ;
	int par =0,impar= 0;
	int numeroPar[] = new int[LIMITE]; 
	int numeroImpar[] = new int[LIMITE];
	int somaPares =0;
	
	for(int i =0;i<LIMITE;i++) {
		System.out.printf("informe os valores dos números: ");
		numeros[i] = leia.nextInt();
	
		
	}
	for(int i =0;i<LIMITE;i++) {
		
			if(numeros[i]%2 ==0) {
			somaPares = somaPares +numeros[i];
			numeroPar[i] = numeros[i];
			
			}else {
				
				numeroImpar[i] =numeros[i];
				impar = impar +1;
				
			}
		
	}
	
			for (int i = 0; i < numeros.length; i++) {
		
				if (numeros[i]%2==0) {
			System.out.printf("\nNúmeros pares: %d",numeroPar[i]);
			
		}
		
	}
	
		for (int i = 0; i < numeros.length; i++) {
		
			if (numeros[i]%2!=0) {
			System.out.printf("\nNúmeros impares: %d",numeroImpar[i]);
		}
		
		}
	
	System.out.printf("\nA soma dos números pares digitados é: %d",somaPares);
	
	System.out.printf("\nA quantidade de números ímpares foi de: %d",impar);
	}
}
