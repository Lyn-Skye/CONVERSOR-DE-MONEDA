package com.aluracursos.ConversorDeMoneda.modelos;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    double resultado;
    String monedaBase;
    String monedaObjetivo;
    double monto;

    public Monedas ConversorDeMoneda(String monedaBase, String monedaObjetivo, double monto){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.monto = monto;

        URI url = URI.create("https://v6.exchangerate-api.com/v6/306f84d95ae020a634e31e9b/pair/"+monedaBase+"/"+monedaObjetivo+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    return new Gson().fromJson(response.body(), Monedas.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
