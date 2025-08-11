package br.com.leonardo.conversordemoedas.menu;

import br.com.leonardo.conversordemoedas.conexao.ConversorApi;
import br.com.leonardo.conversordemoedas.modelos.Conversor;
import java.util.Scanner;

public class Menu {

    public void displayMenu() {

        Scanner leitor = new Scanner(System.in);
        ConversorApi conversor = new ConversorApi();
        int opcao = 0;
        double valor;

        while (opcao != 7) {
            try {

                String menu = """
                        ***********************************************************
                                SEJA BEM-VINDO/A AO CONVERSOR DE MOEDAS
                        
                        1) Real Brasileiro (BRL) =>>> Dólar Americano (USD)
                        2) Dólar Americano (USD) =>>> Real Brasileiro (BRL)
                        3) Real Brasileiro (BRL) =>>> Euro (EUR)
                        4) Euro (EUR) =>>> Real Brasileiro (BRL)
                        5) Dólar Americano (USD) =>>> Euro (EUR)
                        6) Libra Esterlina (GBP) =>>> Real Brasileiro (BRL)
                        7) SAIR
                        
                        Escolha uma opção válida:
                        """;
                System.out.println(menu);
                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor brlUsd = conversor.buscaConversor("BRL", "USD", valor);
                        System.out.println("\nVocê selecionou a opção 1. Real Brasileiro para Dólar Americano.");
                        System.out.println("O valor de: " + valor + " BRL convertido para Dólar é: " + brlUsd.conversion_result() + " USD");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor usdBrl = conversor.buscaConversor("USD", "BRL", valor);
                        System.out.println("\nVocê selecionou a opção 2. Dólar Americano para Real Brasileiro.");
                        System.out.println("O valor de: " + valor + " USD convertido para Real é: " + usdBrl.conversion_result() + " BRL");
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor brlEur = conversor.buscaConversor("BRL", "EUR", valor);
                        System.out.println("\nVocê selecionou a opção 3. Real Brasileiro para Euro");
                        System.out.println("O valor de: " + valor + " BRL convertido para Euro é: " + brlEur.conversion_result() + " EUR");
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor eurBrl = conversor.buscaConversor("EUR", "BRL", valor);
                        System.out.println("\nVocê selecionou a opção 4. Euro para Real Brasileiro");
                        System.out.println("O valor de: " + valor + " EUR convertido para Real é: " + eurBrl.conversion_result() + " BRL");
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor usdEur = conversor.buscaConversor("USD", "EUR", valor);
                        System.out.println("\nVocê selecionou a opção 5. Dólar Americano para Euro");
                        System.out.println("O valor de: " + valor + " USD convertido para Euro é: " + usdEur.conversion_result() + " EUR");
                        System.out.println(" ");
                        break;
                    case 6:
                        System.out.println("Digite o valor:");
                        valor = leitor.nextDouble();
                        Conversor gbpBrl = conversor.buscaConversor("GBP", "BRL", valor);
                        System.out.println("\nVocê selecionou a opção 6. Libra Esterlina para Real Brasileiro");
                        System.out.println("O valor de: " + valor + " GBP convertido para Real é: " + gbpBrl.conversion_result() + " BRL");
                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro na conversão. Verifique se o valor digitado está correto.");
                System.out.println("Programa encerrado.");
                break;
            }
    }
    }
}
