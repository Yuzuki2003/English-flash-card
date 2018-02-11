package com.example.minami.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyListAdapter mAdapter;
    List<Question> mList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = Question.listAll(Question.class);
        // 配列
        // String[] array = hoge hogejogeo ho
        // str = array[1]

        // Listの場合
        // List list = dljfnaldfkl dfjan ljdf an
        // str1 = list.get(1)

    }
    public void eiken1 (View v) {
        Intent intent = new Intent(this, Firstgrade.class);
        startActivity(intent);
    }

    public void eikenzyun1 (View v) {
        Intent intent = new Intent(this, Prefirstgrade.class);
        startActivity(intent);
    }

    public void eiken2 (View v) {
        Intent intent = new Intent(this, Secondgrade.class);
        startActivity(intent);
    }

    public void eikenzyun2 (View v) {
        Intent intent = new Intent(this, Presecondgrade.class);
        startActivity(intent);
    }

    public void eiken3 (View v) {
        Intent intent = new Intent(this, TertiaryActivity.class);
        startActivity(intent);
    }

    public void eiken4 (View v){
        Intent intent = new Intent(this,QuaternaryActivity.class);
        startActivity(intent);
    }

    public void eiken5 (View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }


}
