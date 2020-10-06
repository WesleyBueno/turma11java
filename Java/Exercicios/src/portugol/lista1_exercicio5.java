package portugol;

import java.util.Scanner;

public class lista1_exercicio5 {

	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		double a,b,c;
		double pesoA =0,pesoB=0,pesoC=0;
		double media = 0;
		int qntNotas =3;
		
		System.out.println("Qual sua nota na prova A: ");
		a=minion.nextDouble();
		
		System.out.println("Qual sua nota na prova B: ");
		b=minion.nextDouble();
		
		System.out.println("Qual sua nota na prova C: ");
		c=minion.nextDouble();
		
		pesoA=(a)*2;
		pesoB=(b)*3;
		pesoC=(c)*5;
		
		media = (pesoA + pesoB + pesoC)/qntNotas;
		
		System.out.println("Sua média é: "+media);
		

	}

}
