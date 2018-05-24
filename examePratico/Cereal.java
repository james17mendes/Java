package examePratico;

public class Cereal extends Alimento {

	private TIPO_CEREAL comp;
	
	public Cereal(String nome, double preco, int calorias, String data) {
		super(nome, preco, calorias, data);
	}

	public TIPO_CEREAL getComp() {
		return comp;
	}

	public void setComp(TIPO_CEREAL comp) {
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Cereal [comp=" + comp + super.toString() + "]";
	}
	
	

}
