package com.example.android.hitungluasbangun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lingkaran extends AppCompatActivity {

    EditText a;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        a = (EditText)findViewById(R.id.alas);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kososng", Toast.LENGTH_LONG).show();
                }else{
                    String isialas = a.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double hs = LuasPersegi(a);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasPersegi(double a){
        return 3.14*(a*a);
    }
}
