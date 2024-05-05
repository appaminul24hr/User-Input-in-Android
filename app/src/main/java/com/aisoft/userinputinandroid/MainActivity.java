package com.aisoft.userinputinandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText edName;
    Button clickBtn;
    TextView tvDisplay;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //find============================================================
        edName = findViewById(R.id.edName);
        clickBtn = findViewById(R.id.clickBtn);
        tvDisplay = findViewById(R.id.tvDisplay);



        //OnClick code here===================================================
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String userInput = edName.getText().toString();
                tvDisplay.setText("Welcome\n"+userInput+"\nThanks.!");


            }
        });




    }

}