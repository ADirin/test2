package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * this is a test
 * @author  Amir Dirin
 *
 */

public class MainActivity extends AppCompatActivity {
// This is a method
TextView myText;

Button btnClick;
EditText edtName;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.txtName);
        btnClick = findViewById(R.id.btnName);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((edtName.text).toString());
            }
        });


    }
}
