package com.example.ejemplo.interfaces;

/**
 * Representa la interfaz de usuario para realizar operaciones
 */
public class PanelOperaciones implements IUConsulta, IUDeposito, IURetiro, IUTransferencia {
    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public void depositar(double monto) {

    }

    @Override
    public void retirar(double monto) {

    }

    @Override
    public void transferir(double monto) {

    }

    public void LeerEntrada() {
    }

    public void mostrarInformacion() {
    }
}
