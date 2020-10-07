package portugol;

import java.util.Scanner;

public class Simulador {
	
	public static void main(String[] args) {
		
Scanner minion = new Scanner(System.in); //crio o teclado
		
		String nome ;
		int anoNascimento = 0 ;
		double salario ;
		int anoAtual = 2020;
		String chefeDeFamilia;
		
		
		System.out.println("ESCREVA SEU NOME");
		nome = minion.next();
		System.out.println(nome);
		System.out.println("Escreva seu ano de nascimento");
		anoNascimento = minion.nextInt();
		System.out.println(anoNascimento);
		
		int idade = 2020 - anoNascimento ;
		System.out.println("Informe seu salário");
		salario = minion.nextDouble();
		
		System.out.println("Você é chefe de familia?");
		chefeDeFamilia = minion.next();
		
		System.out.println("Qual seu gênero?");
		
		
	}

}
