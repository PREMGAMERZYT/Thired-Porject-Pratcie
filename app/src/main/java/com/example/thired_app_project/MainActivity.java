package com.example.thired_app_project;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    private EditText editTextText;
    private EditText editTextNumberPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long  pass = 2563440563L;
        String name1 = "Prem Kumar";
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextText = findViewById(R.id.editTextText);
        editTextNumberPassword = findViewById(R.id.editTextNumberPassword);
        // button = findViewById(R.id.button5);
        //dp = dencity independent pixel is used to make the size same in every screen ratio
        //concstranrt layout
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editTextText.getText().toString();
                Log.d("names", name);
                String passw = editTextNumberPassword.getText().toString();
                if (passw.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter The password", Toast.LENGTH_SHORT).show();
                    return;
                }
                long password = Long.parseLong(passw);
                Log.d("names",passw);

                if (name1.equals(name) && password == pass) {
                    Toast.makeText(MainActivity.this, "Sucess Login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Wrong Name Or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}