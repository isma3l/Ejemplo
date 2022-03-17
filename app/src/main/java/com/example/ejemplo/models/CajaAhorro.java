package com.example.ejemplo.models;

import android.util.Log;

public class CajaAhorro extends Cuenta{

    private final float DESCUENTO = 4;

    public CajaAhorro(String cuenta, double inicial) {
        super(cuenta, inicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo <= 6000) {
            saldo = saldo - cantidad - DESCUENTO;
        } else {
            saldo =  saldo - cantidad;
        }

        Log.v(CajaAhorro.class.getSimpleName(), String.valueOf(cantidad));
    }
}
