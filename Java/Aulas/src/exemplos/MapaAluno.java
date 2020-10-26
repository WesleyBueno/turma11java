package exemplos;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	
	public static void main(String[] args) {
	
	Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
	
	Aluno a = new Aluno("Mario Albuquerque", "Python", 7.0);
	Aluno b = new Aluno("Gisele Matriarca", "Kotlin" , 8.0);
	Aluno c = new Aluno("Jurema Heleonor","JavaScript", 10.0);
	Aluno d = new Aluno("Timão Pumba", "Css", 6.9);
	Aluno e = new Aluno("Simba Leoni", "Angular", 5.5);
	
	mapa.put("Mario Albuquerque",a);
	mapa.put("Gisele Matriarca",b);
	mapa.put("Jurema Heleonor",c);
	mapa.put("Timão Pumba",d);
	mapa.put("Simba Leoni",e);
	
	System.out.println(mapa);
	System.out.println(mapa.get("Timão Pumba"));
	
	Collection<Aluno> alunos = mapa.values();
	for(Aluno f:alunos) {
		
		System.out.println(f);
	}
	

}
	
}
