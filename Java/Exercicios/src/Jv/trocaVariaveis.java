package Jv;

import java.util.Scanner;

public class trocaVariaveis {

	
		public static void main(String[] args) {
			
			int a,b;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Insira a:");
			a = entrada.nextInt();
			
			System.out.println("insira b:");
			b = entrada.nextInt();
			
			entrada.close();
			
			System.out.printf("O valor de a: %d%n", a);
			System.out.printf("O valor de b: %d%n", b);
			
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.printf("O valor de a: %d%n", a);
			System.out.printf("O valor de b: %d%n", b);
		}


	

}
