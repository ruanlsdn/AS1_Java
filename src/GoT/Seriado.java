package GoT;

import java.util.ArrayList;
import java.util.List;

public class Seriado {
	private List<Personagem> personagens;
	private List<Temporada> temporadas;
	private Temporada maiorMorte;

	public Seriado() {
		this.personagens = new ArrayList<Personagem>();
		this.temporadas = new ArrayList<Temporada>();
	}

	public void cadastrar(Personagem personagem) {
		this.personagens.add(personagem);
	}

	public void gerarTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
	}

	public void calcularQtdeMorte(int tempFim) {
		for (Temporada temporada : this.temporadas) {
			if (tempFim == temporada.getNumTemporada()) {
				temporada.calcularQtdeMorte();
			}
		}
	}

	public Temporada retornarMaiorQtdeMorte(Temporada maiorMorte) {
		for (Temporada temporada : this.temporadas) {
			if (temporada.getQtdeMorte() > maiorMorte.getQtdeMorte()) {
				this.maiorMorte = temporada;
			}
		}
		return maiorMorte;
	}

	public List<Personagem> getPersonagens() {
		return this.personagens;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public Temporada getMaiorMorte() {
		return maiorMorte;
	}

}
