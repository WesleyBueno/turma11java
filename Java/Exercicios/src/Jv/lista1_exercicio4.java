package Jv;

import java.util.Scanner;

public class lista1_exercicio4 {

	public static void main(String[] args) {
	/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner minion = new Scanner(System.in);
		
		int valorUsuario;
		int raiz;
		int quadrado;
		
		
		System.out.print("Informe um valor: ");
		valorUsuario = minion.nextInt();
		
		
		if(valorUsuario>0) {
			
			if((valorUsuario%2) == 0) {
				
				raiz =(int) Math.sqrt(valorUsuario);
				System.out.println("O valor é positivo e par! \nE sua raiz é: "+raiz);
			}else {
				
				quadrado = (int) Math.pow(valorUsuario, 2);
				System.out.println("O valor é positivo e impar! \nE seu quadrado  é: "+quadrado);
			}
				
		}else if(valorUsuario == 0){
			
			System.out.print("Você digitou 0!");
			
		}else {
			
			System.out.println("Você digitou um número negativo");
		}
		
	}
		
		
	
}
