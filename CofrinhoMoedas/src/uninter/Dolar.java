package uninter;

public class Dolar extends Moeda{
	private static final double taxaCambioDolar = 5.70; // Valor atualizado (26/03/2025).

	
	public Dolar(double valor) {
		super(valor);
	}
	
	// Implementa o método abstrato da classe Moeda para converter o valor para Real.
	@Override
	public double converterParaReal() {
		return valor * taxaCambioDolar;
	}
	
	public String toString() {
		return "Dolar: valor = " + valor;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// Verifica se os objetos são a mesma instância ou se possuem os mesmos valores no contexto da classe Moeda.
        if (this == obj)
            return true;
        if (!super.equals(obj)) // Compara os valores da classe base (Moeda).
            return false;
        return getClass() == obj.getClass(); // Garante que ambos os objetos sejam da mesma classe.

	}
}
