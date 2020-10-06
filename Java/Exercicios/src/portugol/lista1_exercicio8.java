package portugol;

import java.util.Scanner;

public class lista1_exercicio8 {

	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		double total,impostos,distribuidor,custoFabrica;
		
		System.out.println("Digite o valor de custo");
		custoFabrica=minion.nextDouble();
		
		impostos =(45*custoFabrica)/100;
		distribuidor =(28*custoFabrica)/100;
		total = custoFabrica + impostos + distribuidor;
		
		System.out.println("Seu carro terá um valor de: "+total);

	}

}
