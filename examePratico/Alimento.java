package examePratico;

public class Alimento implements Comparable<Alimento>{
	
	// Atributos
	private String nome;
	private double preco;
	private int calorias;
	private String data;
	
	// Construtor
	public Alimento(String nome, double preco, int calorias, String data) {
		this.nome = nome;
		this.preco = preco;
		this.calorias = calorias;
		this.data = data;
	}
	
	
	
	@Override
	public String toString() {
		return "Alimento [nome=" + nome + ", preco=" + preco + ", calorias=" + calorias + ", data=" + data + "]";
	}



	// Getters and Setters
	@Override
	public int compareTo(Alimento a) {
		return this.nome.compareTo(a.nome);
	}
	
	
	
	
	
	
}
