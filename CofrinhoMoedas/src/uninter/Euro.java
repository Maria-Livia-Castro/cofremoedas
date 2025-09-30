package uninter;

public class Euro extends Moeda {
	private static final double taxaCambioEuro = 6.15; // Valor atualizado (26/03/2025).
	
	public Euro(double valor) {
	super(valor);
	}
	
	@Override
	public double converterParaReal() {
		return valor * taxaCambioEuro;
	}
	
	@Override
	public String toString() {
        return "Euro: valor = " + valor;
    }
	
	@Override
    public int hashCode() {
		return super.hashCode();
	}
	
	 @Override
	    public boolean equals(Object obj) {
		 if (this == obj)
	            return true;
	        if (!super.equals(obj))
	            return false;
	        return getClass() == obj.getClass();
	    }
}
