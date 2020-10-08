package Jv;

import java.util.Scanner;

public class lista2_exercicio2 {

	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		
		 Scanner leia =  new Scanner (System.in);
		 
		 
		 int numeros =0;
		 int totalPar = 0;
		 int totalImpar  = 0;
		 int contador = 0;
		 
		 for(numeros=1;numeros<=10;numeros++) {
			 
			 System.out.printf("Informe um valor: ");
			 numeros = leia.nextInt();
			 
			 if((numeros%2)==0) {
				 
				 totalPar = totalPar +1;
				 
			 } else {
				 
				 totalImpar = totalImpar +1;
			 }
			  
		 }
		 
		 System.out.printf("\nTotal de números pares: %d",totalPar);
		 System.out.printf("\nTotal de números ìmpares: %d",totalImpar);
	}

}
