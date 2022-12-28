package com.example.iman_tulenaliev_hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textreset = findViewById(R.id.text_reset);
        TextView textreset2 = findViewById(R.id.text_reset2);
        TextView textreg = findViewById(R.id.text_reg);
        TextView textentrance = findViewById(R.id.text_entrance);
        EditText editTextpassword = findViewById(R.id.edit_text_password);
        EditText editTextmail = findViewById(R.id.edit_text_mail);
        Button button = findViewById(R.id.button_login);
        editTextmail.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                if (editTextpassword.getText().toString().equals("") || editTextmail.getText().toString().equals("")) {
                    button.setBackgroundResource(R.drawable.button_gray);
                } else {
                    button.setBackgroundResource(R.drawable.button_orange);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        editTextpassword.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                if (editTextpassword.getText().toString().equals("") || editTextmail.getText().toString().equals("")) {
                    button.setBackgroundResource(R.drawable.button_gray);
                } else {
                    button.setBackgroundResource(R.drawable.button_orange);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        button.setOnClickListener(view -> {
            if (editTextpassword.getText().toString().equals("admin")
                    && editTextmail.getText().toString().equals("admin")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Вы успешно зарегистрировались!",
                        Toast.LENGTH_SHORT);
                toast.show();
                textreset.setVisibility(View.GONE);
                textreset2.setVisibility(View.GONE);
                editTextmail.setVisibility(View.GONE);
                editTextpassword.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                textreg.setVisibility(View.GONE);
                textentrance.setVisibility(View.GONE);
            } else {
                Toast toast2 = Toast.makeText(getApplicationContext(), "Неправильный логин и пароль", Toast.LENGTH_SHORT);
                toast2.show();
            }
        });
    }
}

