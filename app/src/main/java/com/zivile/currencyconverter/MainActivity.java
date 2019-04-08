package com.zivile.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void clickFunction (View view){
        EditText numberText = findViewById(R.id.numberText);
        double a = Double.parseDouble(numberText.getText().toString());
        double result = (a*0.903370179);
        Toast.makeText(this, "€" +numberText.getText() + " is " + "£" + String.format("%.2f",  result) , Toast.LENGTH_LONG).show();

    }
}
