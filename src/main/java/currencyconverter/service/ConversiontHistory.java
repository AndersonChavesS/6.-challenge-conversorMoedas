package currencyconverter.service;

import java.util.ArrayList;
import java.util.List;

public class ConversiontHistory {
    private final List<String> history = new ArrayList<>();

    public void addRecord(String record) {
        history.add(record);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            System.out.println("\n==== Histórico de Conversões ====");
            history.forEach(System.out::println);
        }
    }
}
