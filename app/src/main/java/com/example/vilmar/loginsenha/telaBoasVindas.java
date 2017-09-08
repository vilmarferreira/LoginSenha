package com.example.vilmar.loginsenha;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        user = getIntent().getExtras().getString("login");
        carregaPerfil();

    }
    public void carregaPerfil ()
    {

        if (user.equals("Vilmar"))
        {
            vrImage.setImageResource(R.mipmap.img_user);
        }
        else
        {
            if(user.equals("admin"))
            {
                vrImage.setImageResource(R.mipmap.img_user2);
            }
        }
    }
}
