package examePratico;

public class Refrigerante extends Alimento implements Frigorifico {
	
	private double tempMin = 3.0;
	private double tempMax = 5.0;

	public Refrigerante(String nome, double preco, int calorias, String data) {
		super(nome, preco, calorias, data);
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
		return "Refrigerante [tempMin=" + tempMin + ", tempMax=" + tempMax +  super.toString() + "]";
	}
	
	

}
