package com.example.ejemplo.interfaces;

/**
 * Permite realizar distintas operaciones
 */
public class PanelOperaciones implements IConsulta, IDeposito, IRetiro, ITransferencia {

    public void LeerEntrada() {
    }

    public void mostrarInformacion() {
    }

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
}
