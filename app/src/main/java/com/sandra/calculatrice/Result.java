package com.sandra.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {
    private Button btnRetour;
    private  TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       btnRetour = findViewById(R.id.btnRetour);
       txtResult = findViewById(R.id.txtResult);


       String valeur = this.getIntent().getExtras().getString("result");

       txtResult.setText(valeur);
        //Toast.makeText(this, valeur, Toast.LENGTH_SHORT).show();

       btnRetour.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(intent);

           }
       });

    }
}
