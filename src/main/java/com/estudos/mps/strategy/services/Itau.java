package com.estudos.mps.strategy.services;

public class Itau implements CalculaJurosStrategy{
    @Override
    public double getTaxaDeJuros(Pedido pedido) {
            return 10.00;
    }
}
