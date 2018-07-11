package com.example.android.hitungluasbangun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button detail1, detail2, detail3, detail4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detail1 = (Button) findViewById(R.id.detail1);
        detail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://id.wikipedia.org/wiki/Persegi_panjang"));
                startActivity(intent);
            }
        });
        detail2 = (Button) findViewById(R.id.detail2);
        detail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://id.wikipedia.org/wiki/Segitiga"));
                startActivity(intent);
            }
        });
        detail3 = (Button) findViewById(R.id.detail3);
        detail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://id.wikipedia.org/wiki/Lingkaran"));
                startActivity(intent);
            }
        });
        detail4 = (Button) findViewById(R.id.detail4);
        detail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/masrizaleka/"));
                startActivity(intent);
            }
        });

    }

    public void persegi(View view) {
        Intent intent = new Intent(MainActivity.this, persegi.class);
        startActivity(intent);
    }
    public void segitiga(View view) {
        Intent intent = new Intent(MainActivity.this, segitiga.class);
        startActivity(intent);
    }
    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, lingkaran.class);
        startActivity(intent);
    }
}
