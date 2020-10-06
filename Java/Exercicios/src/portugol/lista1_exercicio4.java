package portugol;

import java.util.Scanner;

public class lista1_exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Informe o operador A: ");
		a=minion.nextInt();
		
		System.out.println("Informe o operador B: ");
		b=minion.nextInt();
		
		System.out.println("Informe o operador C: ");
		c=minion.nextInt();
		
		int r =(a+b)*(a+b);
		int s =(b+c)*(b+c);
		int d =(r+s)/2;
		
		System.out.println("O valor de R é: "+r);
		System.out.println("O valor de S é:"+s);
		System.out.println("O valor de D é: "+d);
		
	}

}
