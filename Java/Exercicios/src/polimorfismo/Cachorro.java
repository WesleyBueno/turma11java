package polimorfismo;

public class Cachorro extends Animal{
	
	
	

	public Cachorro(String nome, int idade ) {
		super(nome,idade);
	}

	@Override
	public void Som () {
		System.out.println("AUAUAUAU");
	}
	
	public void correr () {
		System.out.println("Correndo");
	}

}
