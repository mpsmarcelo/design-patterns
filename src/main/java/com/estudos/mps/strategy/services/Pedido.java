package com.estudos.mps.strategy.services;

public class Pedido {
    private double total;

    public Pedido(double valor) {
        this.total = valor;
    }

    public double getValorPedido(){
        return total;
    }
}
