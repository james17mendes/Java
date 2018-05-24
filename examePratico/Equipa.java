package examePratico;

import java.util.*;

public class Equipa {
	
	private String nome;
	private String responsavel;
	private int totalGM;
	private int totalGS;
	private Set<Robo> robos = new TreeSet<>(); 
	
	public Equipa(String nome, String responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		String s = "Equipa " + nome + ", treinada por " + responsavel + " (" + robos.size() + " jogadores)\n";
		s += "   robos= ";
		for(Robo r : robos) {
			s += r + " *;* ";
		}
		s += "\n   golosMarcados=" + totalGM + "\n";
		return s;
	}



	public void add(Robo r) {
		robos.add(r);
	}
	
	public void remove(Robo r) {
		robos.remove(r);
	}

	public Robo[] getRobos() {
		Robo[] r = new Robo[robos.size()];
		int i = 0;
		for(Robo ro : robos) {
			r[i] = ro;
			i++;
		}
		return r;
	}

	public String getGolosMarcados() {
		for(Robo r : robos) {
			this.totalGM += r.getGolos();
		}
		return "" + totalGM;
	}
	
}
