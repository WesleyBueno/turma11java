package orientacaoObjeto;

public class aviao {
	
	private String bancos;
	private String passageiro;
	private String piloto;
	
	
	public aviao(String bancos, String passageiro, String piloto) {
		

		this.bancos =bancos;
		this.passageiro = passageiro;
		this.piloto = piloto;
	}
	
	public String getAviao() {
		
		String aviao =bancos+" "+passageiro+" "+piloto;
		return aviao;
		
	}

}
	

