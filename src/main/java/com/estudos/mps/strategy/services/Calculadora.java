package com.estudos.mps.strategy.services;

public class Calculadora {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(10.00);
        CalculadoraDeJuros calculadoraDeJuros = new CalculadoraDeJuros();
        System.out.println("Juros: " + calculadoraDeJuros.calculaJuros(pedido));

    }
}
