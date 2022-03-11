package com.example.ejemplo.models;


public class CuentaCorriente extends Cuenta{

    private final float DESCUENTO = 2;

    public CuentaCorriente(String cuenta, double inicial) {
        super(cuenta, inicial);
    }

    @Override
    public void retirar(double cantidad) {
        saldo = saldo - cantidad - DESCUENTO;
    }
}
