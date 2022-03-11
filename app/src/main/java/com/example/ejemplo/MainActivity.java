package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ejemplo.models.CajaAhorro;
import com.example.ejemplo.models.CuentaCorriente;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private CajaAhorro cajaAhorro;
    private CuentaCorriente cuentaCorriente;
    private TextView nroCtaCorriente;
    private TextView saldoCtaCorriente;
    private TextView nroCajaAhorro;
    private TextView saldoCajaAhorro;
    private TextInputEditText ctaCorrienteEditText;
    private TextInputEditText cajaAhorroEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
        initAccounts();
        updateAccounts();
    }

    private void initAccounts() {
        cajaAhorro = new CajaAhorro("100", 2000);
        cuentaCorriente = new CuentaCorriente("200", 4800);
    }

    private void initViews() {
        nroCtaCorriente = (TextView)findViewById(R.id.nroCtaCorriente);
        saldoCtaCorriente = (TextView)findViewById(R.id.saldoCtaCorriente);
        nroCajaAhorro = (TextView)findViewById(R.id.nroCajaAhorro);
        saldoCajaAhorro = (TextView)findViewById(R.id.saldoCajaAhorro);
        ctaCorrienteEditText = (TextInputEditText)findViewById(R.id.inputExtraerCtaCorriente);
    }

    private void initListeners() {
        // Cuenta corriente
        Button botonExtraerCtaCorriente = (Button) findViewById(R.id.botonExtraerCtaCorriente);
        botonExtraerCtaCorriente.setOnClickListener(view -> {
            double amount = Double.parseDouble(ctaCorrienteEditText.getText().toString());
            cuentaCorriente.retirar(amount);
            updateAccounts();
        });

        Button botonDepositarCtaCorriente = (Button) findViewById(R.id.botonDepositarCtaCorriente);
        botonDepositarCtaCorriente.setOnClickListener(view -> {
            double amount = Double.parseDouble(ctaCorrienteEditText.getText().toString());
            cuentaCorriente.depositar(amount);
            updateAccounts();
        });

        // Caja de ahorro
        Button botonExtraerCajaAhorro = (Button) findViewById(R.id.botonExtraerCajaAhorro);
        botonExtraerCajaAhorro.setOnClickListener(view -> {
            double amount = Double.parseDouble(cajaAhorroEditText.getText().toString());
            cajaAhorro.retirar(amount);
            updateAccounts();
        });

        Button botonDepositarCajaAhorro = (Button) findViewById(R.id.botonDepositarCtaCorriente);
        botonDepositarCajaAhorro.setOnClickListener(view -> {
            double amount = Double.parseDouble(cajaAhorroEditText.getText().toString());
            cajaAhorro.depositar(amount);
            updateAccounts();
        });
    }

    @SuppressLint("SetTextI18n")
    private void updateAccounts() {
        nroCtaCorriente.setText(cuentaCorriente.obtenerNumeroCuenta());
        saldoCtaCorriente.setText(Double.toString(cuentaCorriente.obtenerSaldo()));

        nroCajaAhorro.setText(cajaAhorro.obtenerNumeroCuenta());
        saldoCajaAhorro.setText(Double.toString(cajaAhorro.obtenerSaldo()));
    }

}