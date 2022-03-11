package com.example.ejemplo.models;


public abstract class Cuenta {
    private String numeroCuenta;
    protected double saldo;

    public Cuenta(String cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    abstract public void retirar(double cantidad);

    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

}
