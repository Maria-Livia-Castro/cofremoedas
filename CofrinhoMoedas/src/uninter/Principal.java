package uninter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = -1;
		Cofrinho cofrinho = new Cofrinho();
		

		while (true) {
            try {
                System.out.println("----COFRINHO----");
                System.out.println("1 - Adicionar Moeda");
                System.out.println("2 - Remover Moeda");
                System.out.println("3 - Listar Moedas");
                System.out.println("4 - Calcular total convertido para Real");
                System.out.println("5 - Limpar Cofrinho");
                System.out.println("0 - Encerrar");
                opcao = teclado.nextInt();

                if (opcao == 0) 
                	break; // Sai do loop se o usuário escolher a opção para encerrar.
                
                switch (opcao) {
                case 1:
                    try {
                        System.out.println("Escolha o tipo de moeda: ");
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        int tipoMoeda = teclado.nextInt();

                        System.out.println("Digite o valor: ");
                        double valor = teclado.nextDouble();

                        Moeda moeda = switch (tipoMoeda) {
                            case 1 -> new Dolar(valor);
                            case 2 -> new Euro(valor);
                            case 3 -> new Real(valor);
                            default -> throw new IllegalArgumentException("Tipo de moeda inválido!");
                        };
                        
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Entrada inválida! Certifique-se de inserir números.");
                        teclado.nextLine(); // Limpa o buffer do Scanner.

                    }
                    break;
                    
                case 2:
                    try {
                        System.out.println("Digite o tipo de moeda para remover: ");
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        int tipoMoeda = teclado.nextInt();
                        System.out.println("Digite o valor da moeda: ");
                        double valor = teclado.nextDouble();

                        Moeda moeda = switch (tipoMoeda) {
                            case 1 -> new Dolar(valor);
                            case 2 -> new Euro(valor);
                            case 3 -> new Real(valor);
                            default -> null;
                        };
                        
                        if (moeda != null && cofrinho.remover(moeda)) {
                            System.out.println("Moeda removida com sucesso!");
                        } else {
                            System.out.println("Erro: Moeda não encontrada.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Entrada inválida!");
                        teclado.nextLine();
                    }
                    break;
                    
                case 3:
                    cofrinho.listar();
                    break;

                case 4:
                    System.out.println("Total convertido para Real: R$ " + cofrinho.calcularValorTotal());
                    break;

                case 5:
                    cofrinho.limpar(); // Limpa todo o conteúdo do cofrinho.
                    System.out.println("Cofrinho esvaziado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Certifique-se de inserir números.");
                teclado.nextLine(); 
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        teclado.close(); // Fecha o Scanner.
        System.out.println("Final do programa.");
        
	  }

}