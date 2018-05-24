package examePratico;

public class CabineComVaranda extends Cabine implements Extras {
	
	private TipoDeVaranda tipoVaranda;
	private Extra extra;
	
	public CabineComVaranda(int num, int maxOcupantes,TipoDeVaranda tipoVaranda) {
		super(num, maxOcupantes);
		this.tipoVaranda = tipoVaranda;
	}

	public TipoDeVaranda getTipo() {
		return tipoVaranda;
	}

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		this.tipoVaranda = tipoVaranda;
	}

	@Override
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
		
	}
	
	

}
