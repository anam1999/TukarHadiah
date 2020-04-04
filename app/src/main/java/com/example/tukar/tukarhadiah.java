package com.example.tukar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class tukarhadiah extends AppCompatActivity {
ImageView hadiah1,hadiah2;
TextView poin1,poin2,isi,poinsaya;
Hitung hitung=new Hitung();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukarhadiah);
        hadiah1=findViewById(R.id.hadiah1);
        hadiah2=findViewById(R.id.hadiah2);
        poin1=findViewById(R.id.hadiah1poin);
        poin2=findViewById(R.id.hadiah2poin);
        poinsaya=findViewById(R.id.poinsaya);
        isi=findViewById(R.id.status);

        hadiah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringpoin1=poin1.getText().toString();
                String stringpoinsaya=poinsaya.getText().toString();

                double poinsaya=Double.parseDouble(stringpoinsaya);
                double poin1=Double.parseDouble(stringpoin1);

               String hitunglah =hitung.hitung(poinsaya,poin1);
               isi.setText(hitunglah);
            }
        });

        hadiah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringpo2=poin2.getText().toString();
                String stringpoinsaya=poinsaya.getText().toString();

                double poin2=Double.parseDouble(stringpo2);
                double poinsaya=Double.parseDouble(stringpoinsaya);

                String hitunglah =hitung.hitung2(poinsaya,poin2);
                isi.setText(hitunglah);
            }
        });

    }
}
