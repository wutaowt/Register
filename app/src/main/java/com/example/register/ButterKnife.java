package com.example.register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class ButterKnife extends AppCompatActivity {
    @BindView(R.id.user)
    EditText username;
    @BindView(R.id.pass)
    EditText password;
    @BindView(R.id.submit)
    Button submit;
    @OnClick(R.id.submit)
    void submitListener(){}
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterknife);
        ButterKnife.bind(this);
    }

    private static void bind(ButterKnife butterKnife) {
    }
}
