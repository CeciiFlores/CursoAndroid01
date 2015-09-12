package com.example.curso_android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn_aceptar;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_aceptar = (Button)findViewById(R.id.btn_aceptar);
        user = (EditText)findViewById(R.id.txtUser);
        pass = (EditText)findViewById(R.id.txtPass);
    }

    public void Saludar(View view){
        String _user = user.getText().toString();
        String _pass = pass.getText().toString();
        if(_user.compareTo("Pequeño") == 0 && _pass.compareTo("atuvieja") == 0){
            Toast.makeText(getApplicationContext(), "Hola Vieja", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "No Gil Pusiste Mal", Toast.LENGTH_LONG).show();
        }
    }
}
