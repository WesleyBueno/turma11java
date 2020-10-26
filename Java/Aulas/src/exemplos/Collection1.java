package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		
Collection<String> nomes = new ArrayList();  //Cria a Collection

nomes.add("Matheus");
nomes.add("Carlos");
nomes.add("Lucifer");
nomes.add("Angela");
nomes.add("Miriam");
nomes.add("Sebastian");

for(String name : nomes) {
	
	System.out.println("Lista de nomes: "+name);
}


//Collection<String> nomes2 = Arrays.asList("Flávia", "Joana"); //Informações adicionais para a collection.
//nomes.addAll(nomes2); //Adiciona informações de um array em outro.

//nomes.contains("Miriam"); //Procura no array uma informação e retorna true ou false
//nomes.clear();            //Limpa todas as posições do array
//nomes.remove("Carlos");	//Limpa uma informação especifica do Array.

//System.out.println("Lista de nomes: "+nomes+nomes.contains("Miriam"));

	}

}
