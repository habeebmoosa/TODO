package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        Intent intent = new Intent(this, MainActivity2.class);
        listView = findViewById(R.id.listView);
        ArrayAdapter obj = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        MainActivity2 ma2 = new MainActivity2();
//        obj.add(ma2.text);
//        listView.setAdapter(obj);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
//                obj.add(ma2.text);

            }
        });
    }
}