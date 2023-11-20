package com.example.app_ec3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.app_ec3.databinding.ActivityLoginBinding;
import com.example.app_ec3.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnacc.setOnClickListener(this);



    }
    private boolean validarEmail() {
        String emailIngresado = binding.txtemail.getText().toString().trim();
        boolean respuesta = true;

        // Verificar si el correo ingresado es diferente a "jeffesonferre@gmail.com"
        if (!emailIngresado.equalsIgnoreCase("jeffesonferre@gmail.com")) {
            binding.txtemail.setFocusableInTouchMode(true);
            binding.txtemail.requestFocus();
            respuesta = false;
        }

        return respuesta;
    }

    private boolean validarCont() {
        String contraseñaIngresada = binding.txtcont.getText().toString().trim();
        boolean respuesta = true;
        String contraseñaDeseada = "SYS123";

        if (!contraseñaIngresada.equals(contraseñaDeseada)) {
            binding.txtcont.setFocusableInTouchMode(true);
            binding.txtcont.requestFocus();
            respuesta = false;
        }

        return respuesta;
    }



    private Boolean validarFormulario(){
        boolean respuesta = false;
        String mensaje = "";
        if(!validarEmail()){
            mensaje ="Ingrese email";
        }else if(!validarCont()){
            mensaje = "ingrese su contraseña";
        } else
            respuesta = true;
        if(!respuesta)
            Snackbar.make(binding.getRoot(), mensaje, Toast.LENGTH_LONG).show();
        return respuesta;
    }
    private void registrarPersona() {
        if (validarFormulario()) {
            StringBuilder infoPersona = new StringBuilder();
            infoPersona.append(binding.txtemail.getText().toString() + "-");
            infoPersona.append(binding.txtcont.getText().toString() + "-");
            Snackbar.make(binding.getRoot(), "Accces", Toast.LENGTH_LONG).show();
        }
    }




    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnacc){
            registrarPersona();
            Intent intentLista = new Intent(getApplicationContext(),
                    login.class);

        }
    }
}