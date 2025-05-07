package currencyconverter.service;

import currencyconverter.util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
    private final List<String> history = new ArrayList<>();

    public void addRecord(String record) {
        String logRecord = LoggerUtil.log(record);
        history.add(logRecord);
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