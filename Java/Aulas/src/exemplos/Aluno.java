package exemplos;

public class Aluno {
	
	private String nome;
	private String curso;
	double nota;
	
	public Aluno(String nome, String curso, double nota) {
		
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
			
	}
	
	public String toString() {
		
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
