package GoT;

public class Personagem {
	private String nome;
	private String sexo;
	private int tempInicio;
	private int tempFim;
	
	public Personagem(String nome, String sexo, int tempInicio, int tempFim) {
		this.nome = nome;
		this.sexo = sexo;
		this.tempInicio = tempInicio;
		this.tempFim = tempFim;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public int getTempInicio() {
		return this.tempInicio;
	}

	public int getTempFim() {
		return this.tempFim;
	}
	
	
}
