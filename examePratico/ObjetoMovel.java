package examePratico;

public class ObjetoMovel {
	
	// Atributos
	private int x;
	private int y;
	private double velocidade;
	private double distancia;
	
	// Construtor
	public ObjetoMovel(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Metodo toString()
	@Override
	public String toString() {
		return "ObjetoMovel [x=" + x + ", y=" + y + ", velocidade=" + velocidade + ", distanciaPercorrida="
				+ distancia + "]";
	}
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void move(int newX, int newY) {
		distancia += Math.sqrt(Math.pow(this.x - newX , 2) + Math.pow(this.y - newY , 2));
		this.x = newX;
		this.y = newY;
	}
	
	public void move(int newX, int newY, double velocidade) {
		distancia += Math.sqrt(Math.pow(this.x - newX , 2) + Math.pow(this.y - newY , 2));
		this.x = newX;
		this.y = newY;
		this.velocidade = velocidade;
	}
	
	
	
	
	
	
	
	
}
