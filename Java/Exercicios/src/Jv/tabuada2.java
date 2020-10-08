package Jv;

import java.util.Scanner;

public class tabuada2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num = 0;
		int tabu = 0;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		for(tabu = 0; tabu <= 10; tabu++) {
			System.out.printf("%d X %d = %d",num,tabu,(num*tabu));
			System.out.println();
		}
		
	
	}

	

}
