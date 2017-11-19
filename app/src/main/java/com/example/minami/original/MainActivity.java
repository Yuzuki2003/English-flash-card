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


    public void button (View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
