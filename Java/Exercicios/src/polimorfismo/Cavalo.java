package polimorfismo;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Som() {
		System.out.println("rinnnnn rinnnnnn");
		
	}
	
	public void correr() {
		System.out.println("Cavalgando");
		
	}
	
	

}
