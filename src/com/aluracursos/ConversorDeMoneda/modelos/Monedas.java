package com.aluracursos.ConversorDeMoneda.modelos;

public record Monedas(String result, double conversion_rate, double conversion_result) {

    @Override
    public String toString() {
        return "Resultado: " + result + "\nTasa de conversión: " + conversion_rate + "\nEl resultado de la conversión es: " + conversion_result;
    }
}




