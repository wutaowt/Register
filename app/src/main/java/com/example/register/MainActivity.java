package com.example.register;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> list = new ArrayList<>();
    private Button login_btn_login;
    private Button login_btn_register;

        @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);
                 listView=(ListView)findViewById(R.id.listview) ;
            for (int i=0;i<10;i++){
                list.add(i+"");//通过for循环将 数据写入list
            }
                //创建一个适配器
            ArrayAdapter arrayAdapter= new ArrayAdapter(MainActivity.this,
                    android.R.layout.simple_list_item_1,list);
            listView.setAdapter(arrayAdapter);
            //通知适配器刷新
            arrayAdapter.notifyDataSetChanged();


                 login_btn_login = (Button)findViewById(R.id.login_btn_login);
                 login_btn_register=(Button)findViewById(R.id.login_btn_register);

        Button.OnClickListener mybtnListener = new Button.OnClickListener() {
            @Override

            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.login_btn_register:
                        Toast.makeText(MainActivity.this,"进入注册页面！",Toast.LENGTH_LONG).show();
                        Intent login_btn_register = new Intent(MainActivity.this,Register.class);//页面的跳转
                        startActivity(login_btn_register);
                        finish();
                        break;


                    case  R.id.login_btn_login:
                        Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_LONG).show();
                        Intent intlogin_btn_loginent = new Intent(MainActivity.this,NavigationFragment.class);//页面的跳转
                        startActivity(intlogin_btn_loginent);
                        finish();


                }
            }
        };
        login_btn_login.setOnClickListener(mybtnListener);
        login_btn_register.setOnClickListener(mybtnListener);
        //Intent intent = new Intent(this,TwoActivity.class);
       // startActivity(intent);


        }
}
