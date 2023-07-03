package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b;
        EditText txt;
        TextView tv;
        b = findViewById(R.id.button);
        txt = findViewById(R.id.editText);
        tv = findViewById(R.id.textView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = txt.getText().toString();
                int a = Integer.parseInt(t);
                double b = 1000*a;
                tv.setText("km value of input is " + b);
            }
        });

    }
}