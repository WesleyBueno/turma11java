package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criar um teclado dentro do programa
		
		Scanner minion = new Scanner(System.in); //crio o teclado
		
		String nome ;
		int anoNascimento = 0 ;
		double salario ;
		int anoAtual = 2020;
		
		
		System.out.println("ESCREVA SEU NOME");
		nome = minion.next();
		System.out.println(nome);
		System.out.println("Escreva seu ano de nascimento");
		anoNascimento = minion.nextInt();
		System.out.println(anoNascimento);
		
		int idade = 2020 - anoNascimento ;
		System.out.println("Informe seu salário");
		salario = minion.nextDouble();
		System.out.println(salario);
		System.out.printf("Oi, %s, sua idade é %d em anos e seu salario %.2f",nome,idade,salario);
	}

}
