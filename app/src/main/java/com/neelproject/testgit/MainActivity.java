package com.neelproject.testgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void print(View view) {
        TextView t = findViewById(R.id.textView);
        Button b = findViewById(R.id.button);
        EditText e = findViewById(R.id.Text);
        Button d = findViewById(R.id.delete);


        String r = "Hello Raghu";
        t.setText(e.getText().toString());

    }


    public void delete(View view) {
        TextView t = findViewById(R.id.textView);
        t.setText("");

    }
}