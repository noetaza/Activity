package com.example.noe.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void mostrarAlerta (View view){
        Toast toast = Toast.makeText (getApplicationContext(),
                "¡Has pulsado el botón!", Toast.LENGTH_LONG);
        toast.show();
    }
}
