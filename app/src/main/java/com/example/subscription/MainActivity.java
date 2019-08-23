package com.example.subscription;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView userNameInput = findViewById(R.id.userNameInput);
        final TextView userEmailInput = findViewById(R.id.userEmailInput);


        final TextView resultText = findViewById(R.id.txtResult);
        Button btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userName = userNameInput.getText().toString();
                final String userEmail = userEmailInput.getText().toString();
                resultText.setText("Подписка на рассылку успешно оформлена для пользователя " + userName + " на электронный адрес " + userEmail);
            }
        });

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userEmailInput.getEditableText().clear();
                userNameInput.getEditableText().clear();
            }
        });
    }
}
