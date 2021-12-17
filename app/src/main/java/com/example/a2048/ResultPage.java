package com.example.a2048;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class ResultPage extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int result= getIntent().getExtras().getInt("Result");
        Button btn= findViewById(R.id.ResultBtn);
        TextView tv = findViewById(R.id.ResultTxt);
        if(result==0)
        {
            btn.setText("메인으로");
            tv.setText("축하합니다!\n이겼습니다");
        }
        else
        {
            tv.setText("게임 오버!");
            btn.setText("다시하기");
        }
    }
    public void retry(View v)
    {
        Intent i= new Intent(ResultPage.this,MainActivity.class);
        startActivity(i);
    }
}
