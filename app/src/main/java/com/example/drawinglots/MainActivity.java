package com.example.drawinglots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1;
    TextView t2;
    Random r1 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        et1=findViewById(R.id.et);
        t2=findViewById(R.id.t2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = et1.getText().toString();
                str = str.trim();
                int number = Integer.parseInt(str);
                int cn = r1.nextInt(number)+1;
                t2.setText(Integer.toString(cn));

            }
        });
    }
}