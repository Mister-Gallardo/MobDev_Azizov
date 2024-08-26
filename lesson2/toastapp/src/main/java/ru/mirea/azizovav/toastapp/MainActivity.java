package ru.mirea.azizovav.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void calculateCharacters(View view) {
        String inputText = editText.getText().toString();
        int charCount = inputText.length();

        String toastText = "СТУДЕНТ N1 (по списку) ГРУППА БСБО-04-22 Количество символов - " + charCount;

        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}