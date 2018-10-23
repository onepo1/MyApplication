package com.example.edu.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
         public void OnClicked(View v){// 항상 View를 상속 받아야한다.
             Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-1234") );
             //intent와 intent를 연결한다.
             startActivity(intent);//Activity 해도 view를 가지고 잇어야 한다.
         }
}
