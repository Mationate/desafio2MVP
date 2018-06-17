package com.mationate.desafio2mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PasswordCallback {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.inputEt);
        textView = findViewById(R.id.passTv);
        Button button = findViewById(R.id.resultBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = editText.getText().toString();
                new PasswordValidation(MainActivity.this).isValidated(password);


            }
        });

    }

    @Override
    public void validated() {
        textView.setText("Tu contraseña ha sido validada, cumple con los requisitos.");
    }

    @Override
    public void denegated() {
        textView.setText("Tu contraseña tiene menos de 8 caracteres. Validación denegada.");
    }
}
