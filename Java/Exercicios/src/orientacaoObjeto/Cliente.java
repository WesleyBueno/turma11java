package orientacaoObjeto;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String rg;

	
		public Cliente (String nome, String cpf, String rg) {
			
			this.nome =nome;
			this.cpf = cpf;
			this.rg =rg;
		}
		
		public String getCl() {
			
			String Cl =nome+" "+cpf+" "+rg;
			return Cl;
			
		}
}
