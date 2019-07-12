package com.sandra.calculette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    /*------------------------------------------------------------------------------------------*/
        //Attributs
    /*------------------------------------------------------------------------------------------*/
    /**
     * Declaration des pointeurs
     */
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMoins,btnMulti,btnDiviser,btnEgal,btnVirgule,btnClear;
    private TextView txtResult;
    private Double nombre1, nombre2;
    private String operator,chaine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * ces instanciations servent a lier les widjet au mainActivity
         */

        initButton();
        txtResult = findViewById(R.id.txtResult);
        nombre1 = 0.0;
        nombre2 = 0.0;
        chaine = "";

        /**
         * Ajout des écouteur sur les boutons
         */
        listenerButton();

    }
    /*------------------------------------------------------------------------------------------*/
        //Evenement
    /*------------------------------------------------------------------------------------------*/
    /**
     * rattacher l'ecouteur sur tous les boutons
     */
    @Override
    public void onClick(View view) {
        if(view.equals(btn0)){
            //Toast.makeText(this,"0",Toast.LENGTH_LONG).show();
            chaine = chaine + "0";
            txtResult.setText(chaine);
        }
        if(view.equals(btn1)){
            //Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
            //nombre1 = Double.parseDouble(chaine);
            chaine = chaine + "1";
            txtResult.setText(chaine);
        }
        if(view.equals(btn2)){
            //Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
            chaine = chaine + "2";
            txtResult.setText(chaine);
        }
        if(view.equals(btn3)){
            //Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
            chaine = chaine + "3";
            txtResult.setText(chaine);
        }
        if(view.equals(btn4)){
            //Toast.makeText(this,"4",Toast.LENGTH_LONG).show();
            chaine = chaine + "4";
            txtResult.setText(chaine);
        }
        if(view.equals(btn5)){
            //Toast.makeText(this,"5",Toast.LENGTH_LONG).show();
            chaine = chaine + "5";
            txtResult.setText(chaine);
        }
        if(view.equals(btn6)){
            //Toast.makeText(this,"6",Toast.LENGTH_LONG).show();
            chaine = chaine + "6";
            txtResult.setText(chaine);
        }
        if(view.equals(btn7)){
            //Toast.makeText(this,"7",Toast.LENGTH_LONG).show();
            chaine = chaine + "7";
            txtResult.setText(chaine);
        }
        if(view.equals(btn8)){
            //Toast.makeText(this,"8",Toast.LENGTH_LONG).show();
            chaine = chaine + "8";
            txtResult.setText(chaine);
        }
        if(view.equals(btn9)){
            //Toast.makeText(this,"9",Toast.LENGTH_LONG).show();
            chaine = chaine + "9";
            txtResult.setText(chaine);
        }
        if(view.equals(btnPlus)){
            //Toast.makeText(this,"+",Toast.LENGTH_LONG).show();
            nombre1 = Double.parseDouble(txtResult.getText().toString());
            operator = "+";
            chaine = "";
            txtResult.setText(chaine);
        }
        if(view.equals(btnMoins)){
            //Toast.makeText(this,"-",Toast.LENGTH_LONG).show();
            nombre1 = Double.parseDouble(txtResult.getText().toString());
            operator = "-";
            chaine = "";
            txtResult.setText(chaine);
        }
        if(view.equals(btnDiviser)){
            //Toast.makeText(this,"`/`",Toast.LENGTH_LONG).show();
            nombre1 = Double.parseDouble(txtResult.getText().toString());
            operator = "/";
            chaine = "";
            txtResult.setText(chaine);
        }
        if(view.equals(btnMulti)){
            //Toast.makeText(this,"*",Toast.LENGTH_LONG).show();
            nombre1 = Double.parseDouble(txtResult.getText().toString());
            operator = "*";
            chaine = "";
            txtResult.setText(chaine);
        }
        if(view.equals(btnVirgule)){
            //Toast.makeText(this,".",Toast.LENGTH_LONG).show();

                chaine =  chaine+ ".";
                txtResult.setText(chaine);

        }
        if(view.equals(btnClear)){
            //Toast.makeText(this," ",Toast.LENGTH_LONG).show();
            operator = "";
            chaine = "";
            nombre1 = 0.0;
            nombre2 = 0.0;
            txtResult.setText(chaine);
        }
        if(view.equals(btnEgal)){
            switch (operator){
                case "+":
                    nombre2 =  nombre1 + Double.parseDouble(chaine);

                    //Toast.makeText(this,"="+nombre2,Toast.LENGTH_LONG).show();

                    txtResult.setText("" + nombre2);
                    break;
                case "-":
                    nombre2 =  nombre1 - Double.parseDouble(chaine);

                    //Toast.makeText(this,"="+nombre2,Toast.LENGTH_LONG).show();

                    txtResult.setText("" + nombre2);

                    break;
                case "/":
                    nombre2 =  nombre1 / Double.parseDouble(chaine);

                    txtResult.setText("" + nombre2);
                    break;
                case "*":
                    nombre2 =  nombre1 * Double.parseDouble(chaine);

                    txtResult.setText("" + nombre2);
                    break;

                default:


            }
        }
    }
    /*------------------------------------------------------------------------------------------*/
        //Méthodes
    /*------------------------------------------------------------------------------------------*/
    /**
     * factorisation des méthodes
     */
    //pour les boutons
    public void initButton(){
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMoins = findViewById(R.id.btnMoins);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiviser = findViewById(R.id.btnDiviser);
        btnVirgule = findViewById(R.id.btnVirgule);
        btnClear = findViewById(R.id.btnClear);
        btnEgal = findViewById(R.id.btnEgal);

        txtResult= findViewById(R.id.txtResult);
    }

    public void listenerButton(){
        /**
         * Ajout des écouteur sur les boutons
         */
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMoins.setOnClickListener(this);
        btnDiviser.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnVirgule.setOnClickListener(this);
        btnEgal.setOnClickListener(this);
    }
}
