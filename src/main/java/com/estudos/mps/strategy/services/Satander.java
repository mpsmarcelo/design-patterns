package com.estudos.mps.strategy.services;

public class Satander implements CalculaJurosStrategy{
    @Override
    public double getTaxaDeJuros(Pedido pedido) {
            return 20;
    }
}
