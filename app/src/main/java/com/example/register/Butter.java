package com.example.register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    void submitListener(){}
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterknife);
        ButterKnife.bind(this);
    }

}
