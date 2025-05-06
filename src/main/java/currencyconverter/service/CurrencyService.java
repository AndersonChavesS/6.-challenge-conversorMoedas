package currencyconverter.service;

import com.google.gson.Gson;
import currencyconverter.model.ExchageResponse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyService {
    private static final String API_KEY = "803b4bc4ac2bac9b390dd464";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public void converter(String from, String to, double amount) {
        try {
            String urlStr = BASE_URL + API_KEY + "latest/" + from;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Erro na conexão com a API.");
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder responseContent = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                responseContent.append(inputLine);
            }
            in.close();

            Gson gson = new Gson();
            ExchageResponse response = gson.fromJson(responseContent.toString(), ExchageResponse.class);

            Double taxaConversao = response.conversion_rates.get(to);
            if (taxaConversao == null) {
                System.out.println("Moeda não encontrada.");
                return;
            }

            double valorConvertido = amount * taxaConversao;
            System.out.printf("%.2f %s = %.2f %s\n", amount, from, valorConvertido, to);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
