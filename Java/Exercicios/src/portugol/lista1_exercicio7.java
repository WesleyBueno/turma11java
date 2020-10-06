package portugol;

import java.util.Scanner;

public class lista1_exercicio7 {

	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		double x=0;
		double y=0;
		
		
		System.out.print("De um valor para a: ");
		a = minion.nextInt();
		System.out.print("De um valor para b: ");
		b = minion.nextInt();
		System.out.print("De um valor para c: ");
		c = minion.nextInt();
		System.out.print("De um valor para d: ");
		d = minion.nextInt();
		System.out.print("De um valor para e: ");
		e = minion.nextInt();
		System.out.print("De um valor para f: ");
		f = minion.nextInt();
		
		
		x=((c*e)-(b*f)/(a*e)-(b*d));
		y=((a*f)-(c*d)/(a*e-b*d));
		
		System.out.println("O valor de X é: "+x);
		System.out.println("O valor de Y é: "+y);

	}

}
