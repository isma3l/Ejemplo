package com.example.ejemplo.models;

import android.util.Log;

public class CajaAhorro extends Cuenta{

    public CajaAhorro(String cuenta, double inicial) {
        super(cuenta, inicial);
    }

    @Override
    public void retirar(double cantidad) {
        saldo -= cantidad;
        Log.v(CajaAhorro.class.getSimpleName(), String.valueOf(cantidad));
    }
}
