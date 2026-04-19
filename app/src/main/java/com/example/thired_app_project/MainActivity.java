package com.example.thired_app_project;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //logginig is the method of printing some thing in the conosle window using (Log.d)
    //there are two arguments in logging 1. tag and 2. message for example =
    // Log.d("Tag","Hi i am prem Kumar")


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button5);
        //dp = dencity independent pixel is used to make the size same in every screen ratio
        //concstranrt layout
        Log.e("genral","this is Prem Kumar");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "PremKumar", Toast.LENGTH_SHORT).show();
                Log.d("genral","Prem Kumar");
            }
        });

    }
}