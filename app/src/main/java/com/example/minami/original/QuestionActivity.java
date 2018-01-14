package com.example.minami.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


/**
 * Created by minami on 2017/02/19.
 */
public class QuestionActivity extends AppCompatActivity {
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
        mAdapter = new MyListAdapter(getApplicationContext(), R.layout.question_list_item);
        mAdapter.addAll(mlist);

        array = new ArrayList<Question>();

        for(int i = 0; i < EIGO_COUNT; i = i+1) {
            randomNumber = random.nextInt(mlist.size());
            array.add(i, mlist.get(randomNumber));
        }
        textView.setText(String.valueOf(randomNumber));
        textView.setText(array.get(answercount).question);

        String englishString = array.get(answercount).answer;
        edittext = (EditText)findViewById(R.id.editText);
        String editString = edittext.getText().toString();
        findViewById(R.id.button9);
        /*
            ほりー参上！！！
            w(￣▽￣;)wﾜｵｯ!!
         */
        //ﾔﾚﾔﾚ ┐(´ｰ｀)┌
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
            //ここに結果発表画面に移動するコードを書く
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }
        else {
            //まだ終わってななら次の問題に行く
            textView.setText(array.get(answercount).question);
            edittext.getText().clear();
        }
    }

    public void setDummyDate(){
        Question question1 = new Question("これ","this");
        question1.save();
        Question question2 = new Question("あれ","that");
        question2.save();
        Question question3 = new Question("これら","these");
        question3.save();
        Question question4 = new Question("あれら","those");
        question4.save();
        Question question5 = new Question("それ","it");
        question5.save();
        Question question6 = new Question("彼らの","their");
        question6.save();
        Question question7 = new Question("それらを","them");
        question7.save();
        Question question8 = new Question("そこで","there is");
        question8.save();
        Question question9 = new Question("〜がある（いる）","they");
        question9.save();
        Question question10 = new Question("彼らは","who");
        question10.save();
        Question question11 = new Question("誰が","what");
        question11.save();
        Question question12 = new Question("何を","when");
        question12.save();
        Question question13 = new Question("いつ","when");
        question13.save();
        Question question14 = new Question("どこで","where");
        question14.save();
        Question question15 = new Question("なぜ（どんな目的で）","why");
        question15.save();
        Question question16 = new Question("どうやって","how");
        question16.save();
        Question question17 = new Question("いくら","how much");
        question17.save();
        Question question18 = new Question("1月","January");
        question18.save();
        Question question19 = new Question("2月","February");
        question19.save();
        Question question20 = new Question("3月","March");
        question20.save();
        Question question21 = new Question("4月","April");
        question21.save();
        Question question22 = new Question("5月","May");
        question22.save();
        Question question23 = new Question("6月","June");
        question23.save();
        Question question24 = new Question("7月","July");
        question24.save();
        Question question25 = new Question("8月","August");
        question25.save();
        Question question26 = new Question("9月","September");
        question26.save();
        Question question27 = new Question("10月","October");
        question27.save();
        Question question28 = new Question("11月","November");
        question28.save();
        Question question29 = new Question("12月","December");
        question29.save();
        Question question30 = new Question("日曜日","Sunday");
        question30.save();
        Question question31 = new Question("月曜日","Monday");
        question31.save();
        Question question32 = new Question("火曜日","Tuesday");
        question32.save();
        Question question33 = new Question("水曜日","Wednesday");
        question33.save();
        Question question34 = new Question("木曜日","Thursday");
        question34.save();
        Question question35 = new Question("金曜日","Friday");
        question35.save();
        Question question36 = new Question("土曜日","Saturday");
        question36.save();
        Question question37 = new Question("国","country");
        question37.save();
        Question question38 = new Question("日本","Japan");
        question38.save();
        Question question39 = new Question("アメリカ","America");
        question39.save();
        Question question40 = new Question("イギリス","England");
        question40.save();
        Question question41 = new Question("中国","China");
        question41.save();
        Question question42 = new Question("オーストラリア","Australia");
        question42.save();
        Question question43 = new Question("ブラジル","Brazil");
        question43.save();
        Question question44 = new Question("インド","India");
        question44.save();
        Question question45 = new Question("イタリア","Italy");
        question45.save();
        Question question46 = new Question("カナダ","Canada");
        question46.save();
        Question question47 = new Question("フランス","France");
        question47.save();
        Question question48 = new Question("ドイツ","Germany");
        question48.save();
        Question question49 = new Question("ハワイ","Hawaii");
        question49.save();
        Question question50 = new Question("韓国","Korea");
        question50.save();
        Question question51 = new Question("英語","English");
        question51.save();
        Question question52 = new Question("日本語（国語）","Japanese");
        question52.save();
        Question question53 = new Question("算数（数学）","math");
        question53.save();
        Question question54 = new Question("音楽","music");
        question54.save();
        Question question55 = new Question("理科","science");
        question55.save();
        Question question56 = new Question("社会","social studies");
        question56.save();
        Question question57 = new Question("歴史","history");
        question57.save();
        Question question58 = new Question("学校","school");
        question58.save();
        Question question59 = new Question("校門","school gate");
        question59.save();
        Question question60 = new Question("修学旅行","school trip");
        question60.save();
        Question question61 = new Question("市役所","City Hall");
        question61.save();
        Question question62 = new Question("クラス","class");
        question62.save();
        Question question63 = new Question("教室","classroom");
        question63.save();
        Question question64 = new Question("体育館","gym");
        question64.save();
        Question question65 = new Question("時間","time");
        question65.save();
        Question question66 = new Question("〜年","year");
        question66.save();
        Question question67 = new Question("〜月","month");
        question67.save();
        Question question68 = new Question("〜週","week");
        question68.save();
        Question question69 = new Question("〜日","day");
        question69.save();
        Question question70 = new Question("〜時間","hour");
        question70.save();
        Question question71 = new Question("〜分","minute");
        question71.save();
        Question question72 = new Question("今日","today");
        question72.save();
        Question question73 = new Question("週末","weekend");
        question73.save();
        Question question74 = new Question("朝、午前中","morning");
        question74.save();
        Question question75 = new Question("午後","afternoon");
        question75.save();
        Question question76 = new Question("晩","evening");
        question76.save();
        Question question77 = new Question("夜","night");
        question77.save();
        Question question78 = new Question("深夜","midnight");
        question78.save();
        Question question79 = new Question("夕方","evening");
        question79.save();
        Question question80 = new Question("毎日","every day");
        question80.save();
        Question question81 = new Question("毎週","every week");
        question81.save();
        Question question82 = new Question("毎年","every year");
        question82.save();
        Question question83 = new Question("今月","this month");
        question83.save();
        Question question84 = new Question("今朝","this morning");
        question84.save();
        Question question85 = new Question("今日","today");
        question85.save();
        Question question86 = new Question("明日","tomorrow");
        question86.save();
        Question question87 = new Question("今夜","tonight");
        question87.save();
        Question question88 = new Question("昨日","yesterday");
        question88.save();
        Question question89 = new Question("一日中","all day");
        question89.save();
        Question question90 = new Question("日","day");
        question90.save();
        Question question91 = new Question("春","spring");
        question91.save();
        Question question92 = new Question("夏","summer");
        question92.save();
        Question question93 = new Question("秋","autumn");
        question93.save();
        Question question94 = new Question("冬","winter");
        question94.save();
        Question question95 = new Question("晴れ/元気","fine");
        question95.save();
        Question question96 = new Question("晴れ","sunny");
        question96.save();
        Question question97 = new Question("曇りの","cloudy");
        question97.save();
        Question question98 = new Question("雨が降っている","rainy");
        question98.save();
        Question question99 = new Question("雪が降っている","snowy");
        question99.save();
        Question question100 = new Question("風が強い","windy");
        question100.save();
        Question question101 = new Question("雨","rain");
        question101.save();
        Question question102 = new Question("雲","cloud");
        question102.save();
        Question question103 = new Question("太陽","sun");
        question103.save();
        Question question104 = new Question("月","moon");
        question104.save();
        Question question105 = new Question("星","star");
        question105.save();
        Question question106 = new Question("雪","snow");
        question106.save();
        Question question107 = new Question("風","wind");
        question107.save();
        Question question108 = new Question("スポーツ","sport");
        question108.save();
        Question question109 = new Question("野球","baseball");
        question109.save();
        Question question110 = new Question("サッカー","soccer");
        question110.save();
        Question question111 = new Question("テニス","tennis");
        question111.save();
        Question question112 = new Question("バスケットボール","basketball");
        question112.save();
        Question question113 = new Question("ゴルフ","golf");
        question113.save();
        Question question114 = new Question("バレーボール","volleyball");
        question114.save();
        Question question115 = new Question("ハイキング","hiking");
        question115.save();
        Question question116 = new Question("ホッケー","hockey");
        question116.save();
        Question question117 = new Question("ホームラン","home run");
        question117.save();


    }


}

