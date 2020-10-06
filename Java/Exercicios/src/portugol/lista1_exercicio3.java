package portugol;

import java.util.Scanner;

public class lista1_exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner minion = new Scanner(System.in);
		
		int tempoDuracao;
		int horas;
		int segundos;
		int minuto;
		
		System.out.println("Digite o tempo em segundos: ");
		tempoDuracao = minion.nextInt();
		
		horas = tempoDuracao/3600;
		System.out.println("Total de horas: "+horas);
		
		minuto = (tempoDuracao%3600)/60;
		System.out.println("Total de minutos: "+minuto);
		
		segundos =(tempoDuracao%3600)%60;
		System.out.println("Total de segundos: "+segundos);
		
	}
	

}
