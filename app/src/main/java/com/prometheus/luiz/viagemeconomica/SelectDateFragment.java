package com.prometheus.luiz.viagemeconomica;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Luiz on 15/04/2016.
 */
public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener  {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, dia, mes, ano);
    }

    public SelectDateFragment() {
        // Required empty public constructor
    }

 /*   public void onDateSet(DatePicker view, int dia, int mes, int ano) {
        populateSetDate(dia, mes + 1, ano);
    }


    public void populateSetDate(int dia, int mes, int ano) {
        TextView t = (TextView) getView().findViewById(R.id.dataChegada);
        t.setText(dia + "/" + mes + "/" + ano);
    }  */

    public void onDateSet(DatePicker view, int dia, int mes, int ano) {
        //Do something with the date chosen by the user
        TextView data = (TextView) getActivity().findViewById(R.id.dataChegada);
        data.setText("Date changed...");
        data.setText(data.getText() + "\nDia: " + dia);
        data.setText(data.getText() + "\nMês: " + mes);
        data.setText(data.getText() + "\nAno: " + ano);

        String stringOfDate = dia + "/" + mes + "/" + ano;
        data.setText(data.getText() + "\n\nFormatted date: " + stringOfDate);
    }
}
