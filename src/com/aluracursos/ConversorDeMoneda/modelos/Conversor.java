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

/*
dolar > peso argentino
peso argentino > dolar
dolar > real brasileño
real brasileño > dolar
dolar > peso colombiano
peso colombiano > dolar
dolar > peso mexicano
peso mexicno > dolar
dolar > yen
yen > dolar
 */

/*
    public double Usd_A_Ars (double usd, double ars){
        resultado = usd * ars;
        return resultado;
    }

    public double Ars_A_Usd (double ars, double usd){
        resultado = ars / usd;
        return resultado;
    }

    public double Usd_A_Brl (double usd, double brl){
        resultado = usd * brl;
        return resultado;
    }

    public double Brl_A_Usd (double brl, double usd){
        resultado = brl / usd;
        return resultado;
    }

    public double Usd_A_Cop (double usd, double cop){
        resultado = usd * cop;
        return resultado;
    }

    public double Cop_A_Usd (double cop, double usd){
        resultado = cop / usd;
        return resultado;
    }

    public double Usd_A_Mxn (double usd, double mxn){
        resultado = usd * mxn;
        return resultado;
    }

    public double Mxn_A_Usd (double mxn, double usd){
        resultado = mxn / usd;
        return resultado;
    }

    public double Usd_A_Jpy (double usd, double jpy){
        resultado = usd * jpy;
        return resultado;
    }

    public double Jpy_A_Usd (double jpy, double usd){
        resultado = jpy / usd;
        return resultado;
    }
 */