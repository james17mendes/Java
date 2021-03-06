package aula07;

public class Retangulo extends Figura {
	
	private double comprimento;
	private double largura;

	public Retangulo(double x, double y, String cor, double c, double l) {
		super(x, y, cor);
		this.comprimento = c;
		this.largura = l;
		
	}

	public Retangulo(Ponto p, String cor, double c, double l) {
		super(p, cor);
		this.comprimento = c;
		this.largura = l;
	}
	
	public Retangulo(double c, double l) {
		super(0,0);
		this.comprimento = c;
		this.largura = l;
	}
	
	public Retangulo(double x, double y, double c, double l) {
		super(x,y);
		this.comprimento = c;
		this.largura = l;
	}

	@Override
	public String toString() {
		return  "Retangulo de " + super.toString() + ", Comprimento: " + comprimento + ", Largura: " + largura + ", Area: " + this.area() + ", Perimetro: " + this.perimetro();
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area() {
		return comprimento * largura;
	}
	
	public double perimetro() {
		return 2 * comprimento + 2 * largura;
	}
	
}
