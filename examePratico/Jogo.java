package examePratico;


public class Jogo {
	private Equipa[] equipas = new Equipa[2];
	private Bola bola;
	private int tempoTotal;
	private int tempoDecorrido;
	
	public Jogo(Equipa e1, Equipa e2, Bola bola, int tempoTotal) {
		this.equipas[0] = e1;
		this.equipas[1] = e2;
		this.bola = bola;
		this.tempoTotal = tempoTotal;
	}

	@Override
	public String toString() {
		return "Jogo entre " + equipas[0].getNome() + " e " + equipas[1].getNome() + "\n";
		
	}
	
	
}
