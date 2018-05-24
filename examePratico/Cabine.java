package examePratico;

import java.util.*;

public class Cabine implements Comparable<Cabine> {
	
	// Atributos
	private int num;
	private int maxOcupantes;
	private List<String> passageiros;
	
	// Construtor
	public Cabine(int num, int maxOcupantes) {
		this.num = num;
		this.maxOcupantes = maxOcupantes;
	}

	public List<String> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(String[] passageiros) {
		
		int cont = 0;
		for(String s : passageiros) {
			if(cont <= this.maxOcupantes) {
				this.getPassageiros().add(s);
				cont++;
			} else {
				System.out.println("Não adicionado devido a excesso de ocupantes !!");
			}
		}
	}

	public int getMaxOcupantes() {
		return maxOcupantes;
	}

	public void setMaxOcupantes(int maxOcupantes) {
		this.maxOcupantes = maxOcupantes;
	}

	@Override
	public int compareTo(Cabine o) {
		return this.num - o.num;
	}
	
}
