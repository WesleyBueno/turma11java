package Jv;

import java.util.Scanner;

public class tabuada {

		Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			  int cont1, cont2, tab;
	          cont1 = 1; cont2 = 1;
	       
	          while (cont1 <= 10)
	          {
	              while (cont2 <= 10)
	              {
	                  tab = cont1 * cont2;
	                  System.out.println(cont1 + " x " + cont2 + " = " + tab);
	                  cont2 = cont2 + 1;
	                  
	              }
	          cont2 = 1;
	          cont1 = cont1 + 1;
	          }
		        

	}

}
