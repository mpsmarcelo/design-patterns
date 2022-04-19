package com.estudos.mps.strategy.services;

public interface CalculaJurosStrategy {

    default double getTaxaDeJuros(Pedido pedido){
        return pedido.getValorPedido();
    }
}
