package orientacaoObjeto;

public class Testeprojeto {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa("Maria");
		Fornecedor f1 = new Fornecedor("Francis","Rua x","378137",100.89,40.67);
		
		
	
	
		
		
		System.out.println("Saldo da "+f1.getNome()+" "+f1.obterSaldo());

	}

}
