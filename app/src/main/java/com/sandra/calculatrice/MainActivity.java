package com.sandra.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * Declaration des pointeurs
     */
    private EditText txtNb1, txtNb2, txtResult;
    private Button btnCalcul;
    Double nombre1, nombre2, somme;
    private Spinner spOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * ces instanciations servent a lier les widjet au mainActivity
         */

        txtNb1 = findViewById(R.id.txtNb1);
        txtNb2 = findViewById(R.id.txtNb2);
        //txtResult = findViewById(R.id.txtResult);
        btnCalcul = findViewById(R.id.btnCalcul);

        spOperator = findViewById(R.id.spOperator);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.op, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);


        spOperator.setAdapter(adapter);
        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pour demarrer une activité a partir d'une autre, on demarre une intension

                Intent intent =  new Intent(getApplicationContext(),Result.class);

                nombre1 = Double.parseDouble(txtNb1.getText().toString());
                nombre2 = Double.parseDouble(txtNb2.getText().toString());
                somme = nombre1 + nombre2;
                Toast.makeText(getApplicationContext(),""+ somme, Toast.LENGTH_SHORT).show();
                intent.putExtra("result", Double.toString(somme));



                startActivity(intent);




            }
        });

    }
}
