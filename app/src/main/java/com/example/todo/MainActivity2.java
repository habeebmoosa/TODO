package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;
    Button button;
    public String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = new String();
                text = editText.getText().toString();
                Toast.makeText(MainActivity2.this, "Hey yahoooo, added successfully", Toast.LENGTH_SHORT).show();
                startActivity(getParentActivityIntent());
            }
        });

    }
}