package java;

import java.util.Arrays;
import java.util.Scanner;


	public class lista1_exercicio2 {
	
	public static void main(String[] args) {
	
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	Scanner minion = new Scanner(System.in);
	
	int[] listaNumeros = new int[3];
	
	for(int i=1;i<listaNumeros.length;i++) {
		
		System.out.println("Informe os valores de A,B e C");
		listaNumeros[i] = minion.nextInt();
		
	}
	
	Arrays.sort(listaNumeros);
	
	System.out.println("A ordem crescente �: "+listaNumeros);
	
	}

}
