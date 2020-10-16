package polimorfismo;

public class Preguiça extends Animal {
	
	public Preguiça(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	
	public void Som() {
		
		System.out.println("Snif snif");
	}
	
	public void correr() {
		
		System.out.println("Escalando");
	}
}
