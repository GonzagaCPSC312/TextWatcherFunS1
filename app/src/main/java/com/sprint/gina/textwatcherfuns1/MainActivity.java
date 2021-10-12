package com.sprint.gina.textwatcherfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

        // we don't need the hello button
        // we can listen for text changed events
        // with the TextWatcher interface
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // we can use this one to get the name the user types
            }

            @Override
            public void afterTextChanged(Editable s) {
                // we can also use this one to get the name the user types
                String name = s.toString();
                if (name.length() > 0) {
                    helloTextView.setText("Hello, " + name);
                }
                else {
                    helloTextView.setText("");
                }
            }
        });
    }
}