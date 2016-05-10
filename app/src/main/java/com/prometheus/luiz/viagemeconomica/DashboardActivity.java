package com.prometheus.luiz.viagemeconomica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Luiz on 11/04/2016.
 */
public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }
    public void selecionarOpcao(View view) {
    /* com base na view que foi clicada iremos tomar a ação correta */
        TextView textView = (TextView) view;
        String opcao = "Opção: " + textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();

        switch (view.getId()) {
            case R.id.nova_viagem:
                startActivity(new Intent(this, NovaViagemActivity.class));
                break;

            case R.id.novo_gasto:
                startActivity(new Intent(this, NovoGastoActivity.class));
                break;
        }
    }

}
