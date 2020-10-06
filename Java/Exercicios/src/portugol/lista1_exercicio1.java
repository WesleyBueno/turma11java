package portugol;

import java.util.Scanner;

public class lista1_exercicio1 {
	
	public static void main (String[] args) {
		
		Scanner minion = new Scanner(System.in);
	
	int anos;
	int meses;
	int dias;
	int totalDias;
	
	System.out.println("Digite os anos");
	anos = minion.nextInt();
	
	System.out.println("Digite os meses");
	meses = minion.nextInt();
	
	System.out.println("Digite os dias");
	dias = minion.nextInt();
	
	
	totalDias =((anos*360)+(meses*30)+dias);
	
	System.out.println("Total de dias é: "+totalDias);
	
	
	
	
	}

}
