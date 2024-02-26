package com.example.exc0610;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    ConstraintLayout wp;
    Button btn;
    Switch swich;
    ToggleButton tobtn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swich = findViewById(R.id.swich);
        wp = findViewById(R.id.wp);
        btn = findViewById(R.id.btn);
        tobtn = findViewById(R.id.tobtn);
    }

    public void knifeace(View view) {
        if(!(swich.isChecked()) && !(tobtn.isChecked())){
            wp.setBackgroundColor(Color.BLACK);
        }
        if(!(swich.isChecked()) && (tobtn.isChecked())){
            wp.setBackgroundColor(Color.BLUE);
        }
        if((swich.isChecked()) && !(tobtn.isChecked())){
            wp.setBackgroundColor(Color.RED);
        }
        if((swich.isChecked()) && (tobtn.isChecked())){
            wp.setBackgroundColor(Color.GREEN);
        }

    }
}