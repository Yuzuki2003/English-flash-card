package com.example.minami.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Presecondgrade extends AppCompatActivity {

    private static final int EIGO_COUNT = 10;

    TextView textView;
    EditText edittext;
    Random random = new Random();
    MyListAdapter mAdapter;
    ListView mListView;
    int randomNumber;
    int[] questions;

    List<Question> array;

    int seikai = 0;
    int matigai = 0;
    int answercount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        textView =  (TextView)findViewById(R.id.textView);
        setDummyDate();

        questions = new int [EIGO_COUNT];

        List<Question> mlist = Question.listAll(Question.class);
        List<Question> presecondList = new ArrayList();
        mAdapter = new MyListAdapter(getApplicationContext(), R.layout.question_list_item);
        mAdapter.addAll(mlist);
        for (int i = 0; i<mlist.size(); i++){
            if (mlist.get(i).getGrade().equals("準2級")){
                presecondList.add(mlist.get(i));
            }
        }

        array = new ArrayList<Question>();

        for(int i = 0; i < EIGO_COUNT; i = i+1) {
            randomNumber = random.nextInt(presecondList.size());
            array.add(i, presecondList.get(randomNumber));
        }
        textView.setText(String.valueOf(randomNumber));
        textView.setText(array.get(answercount).question);

        String englishString = array.get(answercount).answer;
        edittext = (EditText)findViewById(R.id.editText);
        String editString = edittext.getText().toString();
        findViewById(R.id.button9);
    }
    public void complete(View v){
        edittext.getText().toString();
        String editString = edittext.getText().toString();
        String eigoString= array.get(answercount).answer;
        if (editString.length() == 0){
            Toast.makeText(this,"答えを書いてください",Toast.LENGTH_SHORT).show();
            return;
        }
        if (eigoString.equals(editString)){
            seikai = seikai+1;
        }
        else{
            matigai = matigai+1;
        }

        answercount++;
        if (answercount == EIGO_COUNT){
            Log.e("TAG","TAG");
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("DATE1",seikai);
            startActivity(intent);

        }
        else {
            textView.setText(array.get(answercount).question);
            edittext.getText().clear();
        }
    }
    public void setDummyDate(){
        Question question1 = new Question();
        question1.save();

    }
}