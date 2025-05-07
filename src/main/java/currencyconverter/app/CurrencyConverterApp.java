package currencyconverter.app;

import currencyconverter.service.ConversionHistory;
import currencyconverter.service.CurrencyService;

import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversionHistory history = new ConversionHistory();
        CurrencyService service = new CurrencyService(history);

        int opcao;

        do {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1 - USD para BRL");
            System.out.println("2 - EUR para BRL");
            System.out.println("3 - BRL para USD");
            System.out.println("4 - BRL para EUR");
            System.out.println("5 - USD para EUR");
            System.out.println("6 - EUR para USD");
            System.out.println("7 - USD para JPY");
            System.out.println("8 - BRL para CAD");
            System.out.println("9 - Ver histórico de conversões");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            if (opcao == 9) {
                history.showHistory();
                continue;
            }

            System.out.print("Digite o valor a converter: ");
            double valor = teclado.nextDouble();

            switch (opcao) {
                case 1 -> service.converter("USD", "BRL", valor);
                case 2 -> service.converter("EUR", "BRL", valor);
                case 3 -> service.converter("BRL", "USD", valor);
                case 4 -> service.converter("BRL", "EUR", valor);
                case 5 -> service.converter("USD", "EUR", valor);
                case 6 -> service.converter("EUR", "USD", valor);
                case 7 -> service.converter("USD", "JPY", valor);
                case 8 -> service.converter("BRL", "CAD", valor);
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        teclado.close();
    }
}