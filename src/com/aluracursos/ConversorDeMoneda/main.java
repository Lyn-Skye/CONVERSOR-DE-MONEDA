package com.aluracursos.ConversorDeMoneda;

import com.aluracursos.ConversorDeMoneda.modelos.Conversor;
import com.aluracursos.ConversorDeMoneda.modelos.Monedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado =new Scanner(System.in);
        int opcion=0;
        String json;
        String monedaBase;
        String monedaObjetivo;
        double monto;

        Conversor convierte = new Conversor();
        Monedas monedas;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (opcion != 11){
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
            try{
                opcion = teclado.nextInt();

                switch (opcion){
                    case 1:
                    monedaBase ="USD";
                    monedaObjetivo= "ARS";
                        System.out.println("Has elegido convertir de Dólares a Pesos Argentinos");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 2:
                        monedaBase ="ARS";
                        monedaObjetivo= "USD";
                        System.out.println("Has elegido convertir de Pesos Argentinos a Dólares");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 3:
                        monedaBase ="USD";
                        monedaObjetivo= "BRL";
                        System.out.println("Has elegido convertir de Dólares a Reales Brasileños");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 4:
                        monedaBase ="BRL";
                        monedaObjetivo= "USD";
                        System.out.println("Has elegido convertir de Reales Brasileños a Dólares");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 5:
                        monedaBase ="USD";
                        monedaObjetivo= "COP";
                        System.out.println("Has elegido convertir de Dólares a Pesos Colombianos");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 6:
                        monedaBase ="COP";
                        monedaObjetivo= "USD";
                        System.out.println("Has elegido convertir de Pesos Colombianos a Dólares");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 7:
                        monedaBase ="USD";
                        monedaObjetivo= "MXN";
                        System.out.println("Has elegido convertir de Dólares a Pesos Mexicanos");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 8:
                        monedaBase ="MXN";
                        monedaObjetivo= "USD";
                        System.out.println("Has elegido convertir de Pesos Mexicanos a Dólares");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 9:
                        monedaBase ="USD";
                        monedaObjetivo= "JPY";
                        System.out.println("Has elegido convertir de Dólares a Yens");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 10:
                        monedaBase ="JPY";
                        monedaObjetivo= "USD";
                        System.out.println("Has elegido convertir de Yens a Dólares");
                        System.out.println("Elije el monto a convertir");
                        monto= teclado.nextDouble();
                        monedas = convierte.ConversorDeMoneda(monedaBase, monedaObjetivo, monto);
                        System.out.println(monedas.toString());
                        Thread.sleep(5000);
                        break;

                    case 11:
                        System.out.println("Has elegido salir del programa, adios");
                        opcion=11;
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Que escribas un número, burro");
                System.out.println("Finalizando la aplicación.");
                Thread.sleep(5000);
                System. exit(0);
            }

        }
    }
}

