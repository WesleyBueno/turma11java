package Jv;

import java.util.Scanner;

public class testezinho {

	public static void main(String[] args) {
		
		int opp =0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua opção de pagamento 1,2,3 ou 4");
		opp = leia.nextInt();
		
		if(opp == 1) {
			
			System.out.println("Legal");
		}
		
		if(opp == 2) {
			
			System.out.println("Legal");
		}
		if(opp == 3) {
			
			System.out.println("Legal");
		}
		if(opp == 4) {
			
			System.out.println("Legal");
		}
		if(opp >4) {
			
			System.out.println("Código inválido");
		}
		
		if((opp!=1 && opp!=2 && opp!=3 && opp!=4)) {
			
			System.out.println("Código inválido!");
		}
		
	}
	
	

}
