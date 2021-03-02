package GoT;

public class Temporada {
	private int numTemporada;
	private int qtdeMorte;
	
	public Temporada (int numTemporada) {
		this.numTemporada = numTemporada;
	}
	
	public void calcularQtdeMorte() {
		this.qtdeMorte++;
	}
	
	public int getNumTemporada() {
		return numTemporada;
	}

	public int getQtdeMorte() {
		return qtdeMorte;
	}

}
