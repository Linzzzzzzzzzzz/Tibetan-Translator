package com.example.tibetan_translator;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TranslatorActivity extends AppCompatActivity {
    TextView language1;
    TextView language2;

    EditText inputText;
    TextView outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        language1 = (TextView) findViewById(R.id.language2);
        language2 = (TextView) findViewById(R.id.language1);

        inputText = (EditText) findViewById(R.id.inputText);
        outputText = (TextView) findViewById(R.id.outputText);

    }

    public void language (View view) {
        String tempText = language1.getText().toString();
        language1.setText(language2.getText());
        language2.setText(tempText);
    }

    public void translate(View view) {
        outputText.setText(inputText.getText());
    }
}