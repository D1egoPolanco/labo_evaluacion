package com.example.labo_evaluacion;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private EditText e1,e2;
private Button btnguardar;
private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.user);
        e2 = findViewById(R.id.mail);
        Button btn =  findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), receptor.class);
                intent.putExtra("user",e1.getText().toString());
                intent.putExtra("mail",e2.getText().toString());
                startActivityForResult(intent, 0);
            }
        });

    }
}
