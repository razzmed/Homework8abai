package com.example.homework8abai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView result;

    int user;
    boolean finishGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.enter);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

        user = (int) (Math.random() * 10);
        finishGame = false;
    }

        public void onClick(View v) {
        if (!finishGame) {
            int num = Integer.parseInt(editText.getText().toString());
            if (num > user)
                result.setText(getResources().getString(R.string.max));
            if (num < user)
                result.setText(getResources().getString(R.string.min));
            if (num == user) {
                result.setText(getResources().getString(R.string.bingo));
                button.setText(getResources().getString(R.string.replay));
                finishGame = true;
            }
        }

        else {
            user = (int) (Math.random()*10);
            button.setText(getResources().getString(R.string.nameBtn));
            result.setText(getResources().getString(R.string.find_number));
            finishGame = false;
        }
        editText.setText("");
    }
}
