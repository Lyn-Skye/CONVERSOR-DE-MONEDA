package com.aluracursos.ConversorDeMoneda.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaTasaDeCambio {

    public Monedas buscaTasaDeCambio(int opcion){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/306f84d95ae020a634e31e9b/latest/USD");

        HttpClient client = HttpClient.newHttpClient(); // sacado de java doc, http request
        HttpRequest request = HttpRequest.newBuilder() //builder es un patrón de diseño
                .uri(url) //Acá ponemos la url de donde sacaremos datos
                .build();

        try {
            HttpResponse<String> response = null;
            response = client              // este de java doc, http response
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class); //el pelicula.class indica a lo  que se debe de transformar
        } catch (IOException | InterruptedException e) { //el Alt + 124 | es para que el mismo catch atrape y lance el mismo error para 2 errores
            throw new RuntimeException(e);
        }
    }

}

 /* API key 306f84d95ae020a634e31e9b
     https://v6.exchangerate-api.com/v6/306f84d95ae020a634e31e9b/latest/USD

     Simple Java Currency Conversion Example

This example relies on Google's GSON library.


// Setting URL
String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";

// Making Request
URL url = new URL(url_str);
HttpURLConnection request = (HttpURLConnection) url.openConnection();
request.connect();

// Convert to JSON
JsonParser jp = new JsonParser();
JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
String req_result = jsonobj.get("result").getAsString();


This will return the exchange rates from USD to all other currencies we support:

{
	"result": "success",
	"documentation": "https://www.exchangerate-api.com/docs",
	"terms_of_use": "https://www.exchangerate-api.com/terms",
	"time_last_update_unix": 1585267200,
	"time_last_update_utc": "Fri, 27 Mar 2020 00:00:00 +0000",
	"time_next_update_unix": 1585353700,
	"time_next_update_utc": "Sat, 28 Mar 2020 00:00:00 +0000",
	"base_code": "USD",
	"conversion_rates": {
		"USD": 1,
		"AUD": 1.4817,
		"BGN": 1.7741,
		"CAD": 1.3168,
		"CHF": 0.9774,
		"CNY": 6.9454,
		"EGP": 15.7361,
		"EUR": 0.9013,
		"GBP": 0.7679,
		"...": 7.8536,
		"...": 1.3127,
		"...": 7.4722, etc. etc.
	}
}
     */