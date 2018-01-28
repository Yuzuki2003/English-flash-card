package com.example.minami.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    int seikai = 0;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        seikai = intent.getIntExtra("DATE1",0);

        result = (TextView)findViewById(R.id.result);
        result.setText(seikai + "/10");

        findViewById(R.id.back).setOnClickListener(this);
    }

    public void onClick(View v){

    }
}
