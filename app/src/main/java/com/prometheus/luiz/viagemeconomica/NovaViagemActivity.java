package com.prometheus.luiz.viagemeconomica;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Luiz on 12/04/2016.
 */
public class NovaViagemActivity extends FragmentActivity {
    TextView depDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novaviagem);
    }

    public void selecionarData(View v){
        DialogFragment newFragment = new SelectDateFragment();
        newFragment.show(getFragmentManager(), "Date Picker");
    }


}


