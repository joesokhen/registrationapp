package com.example.austregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button register;
    EditText name, email;
    CheckBox english, french;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.btnRegister);
        name = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        english = findViewById(R.id.chEnglish);
        french = findViewById(R.id.chFrench);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = name.getText().toString();
                String mail = email.getText().toString();
                String lang = "";
                if (english.isChecked())
                    lang += "English ";
                if (french.isChecked())
                    lang += "French ";

                Toast.makeText(MainActivity.this,
                        "Name: " + fullName
                        + "\nEmail: " + mail
                        + "\nLanguage: " + lang
                        , Toast.LENGTH_LONG).show();
            }
        });


    }
}