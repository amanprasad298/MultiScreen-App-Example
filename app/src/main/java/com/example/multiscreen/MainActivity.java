package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.Multiscreen.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jumpTo(View view){
        //click handler
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.asd);
        EditText editText2 = findViewById(R.id.asd2);
        EditText editText3 = findViewById(R.id.asd3);
        String message = "Your Name: \n" + editText1.getText().toString() + " " + editText2.getText().toString() + " " + editText3.getText().toString();

        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}