package uninter;

public abstract class Moeda {
	protected double valor;
	
	// Construtor que inicializa o valor da moeda.
	public Moeda(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}
		this.valor = valor; // Atribui o valor informado à variável 'valor'.
	}
	
	// Método getter que retorna o valor da moeda.
	public double getValor() {
		return valor;
	}
	
	// Método setter que permite modificar o valor da moeda.
	public void setValor(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}
		this.valor = valor; // Atualiza o valor da moeda.
	}
	
	public abstract double converterParaReal();
	
	// Sobrescreve o método hashCode, garantindo que objetos com o mesmo valor tenham o mesmo código hash.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result; // Retorna o código hash.
	}
	
	// Sobrescreve o método equals para comparar dois objetos Moeda.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // Verifica se os objetos são a mesma instância.
			return true;
		if (obj == null || getClass() != obj.getClass()) // Verifica se o objeto comparado é nulo ou de uma classe diferente.
			return false;
		
		// Converte o objeto para a classe Moeda e compara os valores.
		Moeda moeda = (Moeda) obj;
		return Double.compare(moeda.valor, valor) == 0;
	}
	
	// Sobrescreve o método toString para retornar uma representação textual do objeto.
	@Override
	public String toString() {
		return "Moeda Valor: " + valor + ""; // Retorna uma string com o valor da moeda.

	}

}
