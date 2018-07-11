package com.example.android.hitungluasbangun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {

    EditText a,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        a = (EditText)findViewById(R.id.alas);
        t = (EditText)findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan Lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }else if (a.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }else if (t.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else{
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasPersegi(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasPersegi(double a, double t){
        return a*t;
    }
}
