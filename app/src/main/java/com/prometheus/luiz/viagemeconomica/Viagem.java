package com.prometheus.luiz.viagemeconomica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Luiz on 11/04/2016.
 */
public class Viagem extends Activity {

    private EditText usuario;
    private EditText senha;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText)findViewById(R.id.usuario);
        senha = (EditText)findViewById(R.id.senha);
    }

    public void entrarOnClick(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if("luiz".equals(usuarioInformado)&& "123456".equals(senhaInformada)){
            //vai para outra activity
            startActivity(new Intent(this, DashboardActivity.class));
        }else{
            //mensagem de erro
            String mensagemErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this,mensagemErro,Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
