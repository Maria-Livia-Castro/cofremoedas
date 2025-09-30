package uninter;

public class Real extends Moeda {
	
	public Real(double valor) {
        super(valor);
    }
	
	@Override
	public double converterParaReal() {
	        return valor;
	}
	
	@Override
	public String toString() {
	    return "Real: valor=" + valor;
	}
	
	@Override
	public int hashCode() {
	    return super.hashCode();
	}
	
	@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
