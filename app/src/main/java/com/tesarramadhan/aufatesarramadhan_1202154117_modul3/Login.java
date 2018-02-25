package com.tesarramadhan.aufatesarramadhan_1202154117_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //deklarasi variable
    private Button log;
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Log In"); //set title bar

        //mengambil id edit text dan button yang ada di layout
        log = findViewById(R.id.buttonLogin);
        user = findViewById(R.id.editUser);
        pass = findViewById(R.id.editPass);
    }
    //method untuk login
    public void login(View view) {
        final String nama = user.getText().toString();
        String word = pass.getText().toString();

        //kondisi saat login berhasil
        if (nama.equals("EAD") && word.equals("MOBILE")){
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();
            //pindah screen ke screen daftarmenu
            Intent intent = new Intent(Login.this, Menu.class);
            startActivity(intent);
            //kondisi ketika nama dan password tidak sama
        }else if (!nama.equals("EAD") && !word.equals("MOBILE")){
            Toast.makeText(this, "Username dan Password tidak cocok", Toast.LENGTH_LONG).show();
            //kondisi ketika field tidak diisi
        }else if (nama.isEmpty() && word.isEmpty()){
            Toast.makeText(this, "Isi dulu username dan passwordnya", Toast.LENGTH_LONG).show();
        }
    }
}
