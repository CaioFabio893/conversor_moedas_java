import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoedas {

    public Moedas dolar() {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/8c5c8b578a73c6e2667064ce/latest/USD");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ApiResponse apiResponse = new Gson().fromJson(response.body(), ApiResponse.class);
            ApiResponse.ConversionRates rates = apiResponse.getConversion_rates();
            return new Moedas(rates.getUSD(), rates.getARS(), rates.getCOP(), rates.getBRL());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a API de câmbio", e);
        }
    }
}