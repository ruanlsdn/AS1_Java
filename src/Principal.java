import java.util.Scanner;

import GoT.Personagem;
import GoT.Seriado;
import GoT.Temporada;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		String sexo;
		int tempInicio, tempFim;
		int opcMenu;
		Seriado Got = new Seriado();
		Personagem personagem;
		Temporada maiorMorte = new Temporada(0);
		for (int i = 1; i < 9; i++) {
			Temporada temporada = new Temporada(i);
			Got.gerarTemporada(temporada);
		}
		do {
			System.out.print("1 - Novo personagem\n2 - Listar personagens\n3 - Exibir resultados\nInforme a opção: ");
			opcMenu = scanner.nextInt();
			switch (opcMenu) {
			case 1:
				System.out.print("NOVO PERSONAGEM\n");
				System.out.print("Digite o nome: ");
				nome = scanner.next();
				System.out.print("Digite o sexo: ");
				sexo = scanner.next();
				System.out.print("Digite a temporada que surgiu: ");
				tempInicio = scanner.nextInt();
				System.out.print("Digite a temporada que morreu: ");
				tempFim = scanner.nextInt();
				personagem = new Personagem(nome, sexo, tempInicio, tempFim);
				Got.cadastrar(personagem);
				Got.calcularQtdeMorte(tempFim);
				break;
			case 2:
				System.out.print("LISTAR PERSONAGENS\n");
				for (Personagem p : Got.getPersonagens()) {
					System.out.print("Nome: " + p.getNome() + "\n");
					System.out.print("Sexo: " + p.getSexo() + "\n");
					System.out.print("Temporada que surgiu: " + p.getTempInicio() + "\n");
					System.out.print("Temporada que morreu: " + p.getTempFim() + "\n");
				}
				break;
			case 3:
				System.out.print("EXIBIR RESULTADOS\n");
				for (Temporada t : Got.getTemporadas()) {
					System.out.print("Número da temporada: " + t.getNumTemporada() + "\n");
					System.out.print("Quantidade de mortes: " + t.getQtdeMorte() + "\n");
				}
				Got.retornarMaiorQtdeMorte(maiorMorte);
				System.out.print("A temporada com mais mortes foi a " + Got.getMaiorMorte().getNumTemporada() + ", com um total de " + Got.getMaiorMorte().getQtdeMorte() + " mortes.\n");
				break;
			}
		} while (opcMenu != 0);
		scanner.close();
	}
}
