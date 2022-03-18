package com.example.ejemplo.models;

import android.util.Log;


public class CuentaCorriente extends Cuenta{

    private final float DESCUENTO = 10;

    public CuentaCorriente(String cuenta, double inicial) {
        super(cuenta, inicial);
    }

    @Override
    public void retirar(double monto) {
        saldo = saldo - monto - DESCUENTO;
        Log.v(CuentaCorriente.class.getSimpleName(), String.valueOf(monto));
    }
}
