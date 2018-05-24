package examePratico;

import java.util.*;

public class LojaAlimentar {
	
	// Atributos
	private String nome;
	private String endereco;
	private Set<Alimento> alimentos = new TreeSet<>();
	
	// Construtor
	public LojaAlimentar(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void add(Alimento a) {
		this.alimentos.add(a);
	}
	
	

	public Set<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(Set<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	// Metodos
	@Override
	public String toString() {
		String s = "Bem vindo a loja alimentar " + nome + "!\nEndereco: " + endereco + "\nAlimentos:\n";
		for(Alimento a : alimentos) {
			s += a +"\n";
		}
		return s;
	}
	
	
	
	
}
