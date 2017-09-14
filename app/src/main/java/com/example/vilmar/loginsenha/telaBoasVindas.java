package com.example.vilmar.loginsenha;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class telaBoasVindas extends AppCompatActivity {
    ImageView vrImage;
    TextView vrText;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template_tela_boas_vindas);
        vrImage=(ImageView) findViewById(R.id.ImagUser);
        vrText=(TextView)findViewById(R.id.textPerfil);

        carregaPerfil();

    }
    public void carregaPerfil ()
    {
        user = getIntent().getExtras().getString("login");
        if (user.equals("Vilmar"))
        {
            vrImage.setImageResource(R.mipmap.img_user);
            vrText.setText("Seja bem Vindo: "+user);
        }
        else
        {
            if(user.equals("admin"))
            {
                vrImage.setImageResource(R.mipmap.img_user2);
                vrText.setText("Seja bem Vindo: "+user);
            }
        }
    }
    public void onClickVoltar (View v)
    {
        user = getIntent().getExtras().getString("login");
        Intent resultado= new Intent();
        Bundle dados= new Bundle();
        dados.putString("login",user);
        resultado.putExtras(dados);
        setResult(Activity.RESULT_OK,resultado);
        this.finish();
    }
}
