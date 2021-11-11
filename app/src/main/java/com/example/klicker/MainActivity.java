package com.example.klicker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Deklaration
    Button btKlickmich;
    TextView tvStatus;
    int z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objekte erstellen und mit View Elementen verknüpfen
        btKlickmich = findViewById(R.id.btKlickMich);
        tvStatus = findViewById(R.id.tvStatus);

        //Listener für den Button an Methode delegieren
        btKlickmich.setOnClickListener(View -> geklicktButton());
        btKlickmich.setOnLongClickListener(View -> clickedLongButton());

    }

    private boolean clickedLongButton() {
        z=0;
        tvStatus.setText("Anzahl:"+z);
        return true;
    }

    private void geklicktButton() {
        z++;
        tvStatus.setText("Anzahl:"+z);

    }


}