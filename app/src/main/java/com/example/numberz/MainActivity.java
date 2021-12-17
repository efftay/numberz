package com.example.numberz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView maintext;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maintext = (TextView) findViewById(R.id.maintext);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int dicenum = 0;


                Random random = new Random();

                dicenum = random.nextInt(100)+1;

                maintext.setText(String.valueOf(dicenum));
            }
        });
    }
}