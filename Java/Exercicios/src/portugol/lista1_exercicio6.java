package portugol;

import java.util.Scanner;

public class lista1_exercicio6 {

	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		double x1,y1,x2,y2;
		double d =0;
		
		System.out.println("informe o valor do ponto x1: ");
		x1=minion.nextDouble();
		
		System.out.println("informe o valor do ponto y1: ");
		y1=minion.nextDouble();
		
		System.out.println("informe o valor do ponto x2: ");
		x2=minion.nextDouble();
		
		System.out.println("informe o valor do ponto y2: ");
		y2=minion.nextDouble();
		
		d=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2));
		
		System.out.println("O valor de d é "+d);

	}

}
