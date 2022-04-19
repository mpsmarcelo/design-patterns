package com.estudos.mps.strategy.services;

import java.util.function.Function;

public class CalculadoraDeJuros {

    private CalculaJurosStrategy calculadorDeJuros;


    public void CalculadoraDeJuros(CalculaJurosStrategy calculaJurosStrategy){
        this.calculadorDeJuros = calculaJurosStrategy;
    }

    public double calculaJuros(Pedido pedido){
        return calculadorDeJuros.getTaxaDeJuros(pedido);
    }
}
