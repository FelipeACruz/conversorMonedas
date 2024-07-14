package mx.com.felipe.conversormonedas.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class BusquedaTipoCambio {

    private String uri;
    private String monedaBase;
    private String monedaCambio;
    private double cantidad;

    public BusquedaTipoCambio(String monedaBase, String monedaCambio, Double cantidad) {
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.cantidad = cantidad;
    }


    public MonedaCambio monedaCambio() {

        this.uri = "https://v6.exchangerate-api.com/v6/210cd9ab4352db192ab69b2f/pair/"
                + this.monedaBase + "/" + this.monedaCambio + "/" + this.cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.uri))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), MonedaCambio.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No encontre el tipo de cambio!");
        }

    }


}
