package com.example.register;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;

public class Butter extends AppCompatActivity {
    @BindView(R.id.user)
    EditText username;
    @BindView(R.id.pass)
    EditText password;
    @BindView(R.id.submit)
    Button submit;
    @OnClick(R.id.submit)void click(){
        Toast.makeText(Butter.this,"Hellow",Toast.LENGTH_LONG);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterknife);
        ButterKnife.bind(this);
    }

}
