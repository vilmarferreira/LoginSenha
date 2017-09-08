package com.example.vilmar.loginsenha;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class telaPrincipal extends AppCompatActivity {

    EditText vrEditLogin,vrEditSenha;
    final int COD_SEGUNDA_TELA =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_principal);
        vrEditLogin=(EditText)findViewById(R.id.editLogin);
        vrEditSenha=(EditText)findViewById(R.id.editSenha);
    }

    public void OnClickLogar (View v)
    {
        if((vrEditLogin.getText().toString().equals("Vilmar")&&vrEditSenha.getText().toString().equals("123456"))
                || (vrEditLogin.getText().toString().equals("admin")&&vrEditSenha.getText().toString().equals("admin")))
        {
            Bundle vrDados=new Bundle();
            vrDados.putString("login",vrEditLogin.getText().toString());
            Intent vrIntent = new Intent(this,telaBoasVindas.class);
            vrIntent.putExtras(vrDados);
            startActivityForResult(vrIntent,COD_SEGUNDA_TELA);
        }
        else
        {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro!");
            alertDialog.setMessage("Nome de usuário e/ou senha incorretos!!");
            alertDialog.show();
        }
    }

    public void onActivityResult(int codTela, int result, Intent dados)
    {
        if(result== Activity.RESULT_CANCELED)
        {
            return;
        }
        if(codTela==COD_SEGUNDA_TELA)
        {
            Bundle bundle= dados.getExtras();
            String login=bundle.getString("Login");
            login=login;
        }
    }
}
