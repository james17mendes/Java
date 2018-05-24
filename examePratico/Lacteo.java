package examePratico;

public class Lacteo extends Alimento implements Frigorifico {

	// Atributos
	private double gordura;
	private double tempMin = 3.0;
	private double tempMax = 5.0;
	
	// Construtores
	public Lacteo(String nome, double preco, int calorias, String data) {
		super(nome, preco, calorias, data);
	}
	
	public Lacteo(String nome, double preco, int calorias, String data, double gordura) {
		super(nome, preco, calorias, data);
		this.gordura = gordura;
	}
	
	// Getters and Setters
	
	public double getGordura() {
		return gordura;
	}

	public void setGordura(double gordura) {
		this.gordura = gordura;
	}

	@Override
	public void setTemp(double tempMin, double tempMax) {
		this.tempMin = tempMin;
		this.tempMax = tempMax;
	}

	@Override
	public double getTempMin() {
		return this.tempMin;
	}

	@Override
	public double getTempMax() {
		return this.tempMax;
	}

	@Override
	public String toString() {
		return "Lacteo [gordura=" + gordura + ", tempMin=" + tempMin + ", tempMax=" + tempMax + super.toString() + "]";
	}

	

}
