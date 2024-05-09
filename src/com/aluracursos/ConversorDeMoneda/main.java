package com.aluracursos.ConversorDeMoneda;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        int opcion;
        String json;
        int salir=0;

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (salir != 11){
            System.out.println("""
                *****************************************************************
                Bienvenido al conversor de Monedas =]
                
                Elija la opción que corresponde a la moneda que quiere convertir
                
                1)  Dolar > Peso Argentino
                2)  Peso Argentino > Dolar
                3)  Dolar > Real Brasileño
                4)  Real Brasileño > Dolar
                5)  Dolar > Peso Colombiano
                6)  Peso Colombiano > Dolar
                7)  Dolar > Peso Mexicano
                8)  Peso Mexicno > Dolar
                9)  Dolar > Yen
                10) Yen > Dolar
                11) Salir
                *****************************************************************
                """);

        }
    }
}

