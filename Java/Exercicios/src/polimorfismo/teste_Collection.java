package polimorfismo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class teste_Collection {
	
	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com 
	 * Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as 
	 * seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

	public static void main(String[] args) {
		
		Set<Produtos> conjunto = new HashSet<Produtos>();
		
		Produtos a = new Produtos("B01","Bolo de chocolate trufado",120.00);
		Produtos b = new Produtos("B02","Bolo de nozes com chocolate", 80.00);
		Produtos c = new Produtos("B03","Bolo de frutas vermelhas", 90.00);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
		
		conjunto.remove(a);
		
		System.out.println(conjunto);
		
		Set<Produtos> conjunto2 = Arrays.asList("Bolo de marshmallow", "Bolo de maçã"); //Informações adicionais para a collection.
		conjunto.addAll(conjunto2);
		
		System.out.println(conjunto);
		
	}
	
	
}
