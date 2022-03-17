package com.example.ejemplo.models;


public class Cuenta {
    private String numeroCuenta;
    protected double saldo;

    public Cuenta(String cuenta, double montoInicial) {
        numeroCuenta = cuenta;
        saldo = montoInicial;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

}
