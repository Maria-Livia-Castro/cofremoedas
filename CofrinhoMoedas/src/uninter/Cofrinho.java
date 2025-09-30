package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	

	public double calcularValorTotal() {
		double total = 0;
		for(Moeda moeda : listaMoedas) {
			total += moeda.converterParaReal();
		}
		return total;
	}

	public boolean remover(Moeda moeda) {
		boolean removida = listaMoedas.remove(moeda);
		if (removida) {
		}
		return removida;
	}

	public void listar() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
		}
		else {
			for (Moeda moeda: listaMoedas) {
				System.out.println(moeda);
			}
		}
	}

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	

	public void limpar() {
        listaMoedas.clear();
    }
}
