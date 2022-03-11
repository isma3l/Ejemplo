package com.example.ejemplo.models;


public class CajaAhorro extends Cuenta{

    public CajaAhorro(String cuenta, double inicial) {
        super(cuenta, inicial);
    }

    @Override
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}
