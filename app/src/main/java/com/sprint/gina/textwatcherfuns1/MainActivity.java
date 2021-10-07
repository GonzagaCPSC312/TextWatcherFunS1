package com.sprint.gina.textwatcherfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = findViewById(R.id.nameEditText);
        TextView helloTextView = findViewById(R.id.helloTextView);
        Button helloButton = findViewById(R.id.helloButton);
        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                if (name.length() > 0) {
                    helloTextView.setText("Hello, " + name);
                }
                else {
                    // show a toast message
                    // a toast is a small message that shows up towards the bottom of the screen
                    // it displays for a short time and the user cannot interact with
                    Toast toast = Toast.makeText(MainActivity.this, "Enter your name first", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }
}