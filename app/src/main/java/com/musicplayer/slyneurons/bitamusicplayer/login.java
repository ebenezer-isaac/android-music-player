package com.musicplayer.slyneurons.bitamusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;
public class login extends AppCompatActivity {
EditText et1;
EditText et2;
    public void loginchk (View log1)
    {
        String cuser = "itsouls";
        String cpass = "1234";
        String username = et1.getText().toString();
        String password = et2.getText().toString();
        if(username.equals(cuser))
        {
            if(password.equals(cpass))
            {
                Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(login.this, player.class));
            }
            else
            {
                Toast.makeText(this, "Wrong Pin", Toast.LENGTH_SHORT).show();
                et2.setText("");
            }
        }
        else
        {
            Toast.makeText(this, "Wrong Username", Toast.LENGTH_SHORT).show();
            et2.setText("");
        }
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1 =findViewById(R.id.et1);
        et2 =findViewById(R.id.et2);
    }
}
