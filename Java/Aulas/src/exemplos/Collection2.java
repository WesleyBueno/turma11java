package exemplos;

import java.util.HashSet;
import java.util.Set;

public class Collection2 {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("Mario Albuquerque", "Python", 7.0);
		Aluno b = new Aluno("Gisele Matriarca", "Kotlin" , 8.0);
		Aluno c = new Aluno("Jurema Heleonor","JavaScript", 10.0);
		Aluno d = new Aluno("Timão Pumba", "Css", 6.9);
		Aluno e = new Aluno("Simba Leoni", "Angular", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);
		
		System.out.println(conjunto);
		
		
	}

}
