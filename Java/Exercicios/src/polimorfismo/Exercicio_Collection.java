package polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exercicio_Collection {
	
	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com 
	 * Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender as 
	 * seguintes funcionalidades:

	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
*/
	
	public static void main(String[] args) {
	
	Collection<String> produtos = new ArrayList();
	
	produtos.add("Bolo de chocolate trufado");
	produtos.add("Bolo de chocolate com nozes");
	produtos.add("Bolo de frutas vermelhas");
	

	
	System.out.println("MENU");
	
		for(String menu : produtos) {
	
			System.out.println(menu);
		
}
		
	produtos.remove("Bolo de chocolate trufado");
	Pula();
	System.out.println("MENU");
	
	
	for(String menu : produtos) {

		System.out.println(menu);
	
	}
	
	Collection<String> produtos2 = Arrays.asList("Bolo de marshmallow", "Bolo de caramelo "); //Informa��es adicionais para a collection.
	produtos.addAll(produtos2);
	
	Pula();
	System.out.println("MENU");
	
	for(String menu : produtos) {

		System.out.println(menu);
	
	}
	
	}
	
	//Fun��o pula linha
	public static void Pula() {
		System.out.println("\n");
	}
}
