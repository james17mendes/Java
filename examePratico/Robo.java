package examePratico;

public class Robo extends ObjetoMovel implements Comparable<Robo>{
	
	private String id;
	private TipoJogador tipo;
	private int golosMarcados;
	
	public Robo(String id, TipoJogador tipo, int x, int y) {
		super(x, y);
		this.id = id;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "id=" + id + ", tipo=" + tipo;
	}



	public void marcaGolo() {
		this.golosMarcados += 1;
	}

	public int getGolos() {
		return golosMarcados;
	}

	public void setGolos(int golosMarcados) {
		this.golosMarcados = golosMarcados;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoJogador getTipo() {
		return tipo;
	}

	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Robo o) {
		return this.id.compareTo(o.id);
	}
	
	
	
	

}
