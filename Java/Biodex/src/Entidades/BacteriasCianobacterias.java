package Entidades;

public class BacteriasCianobacterias extends Taxonomia {

	

	
	public BacteriasCianobacterias(String nome,String reino, String filo, String classe, String ordem, String familia, String genero, String especie) {
		super(nome,reino,filo,classe,ordem,familia,genero,especie);
		
	}



@Override
public void Info() {
	
	
	System.out.println("Nome comum: "+ getNome() +"\nReino: "+ getReino() + "\nFilo: "+ getFilo() + "\nClasse: "+ getClasse() +"\nOrdem: "+ getOrdem() +"\nFamilia: "+ getFamilia() +"\nGenero: "+ getGenero() +"\nEspecie: "+ getEspecie());
	
	
}
}
