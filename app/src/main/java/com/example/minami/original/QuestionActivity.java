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
        List<Question> fiveList = new ArrayList();
        mAdapter = new MyListAdapter(getApplicationContext(), R.layout.question_list_item);
        mAdapter.addAll(mlist);
        for (int i = 0; i<mlist.size(); i++){
            if (mlist.get(i).getGrade().equals("5級")){
                fiveList.add(mlist.get(i));
            }
        }

        array = new ArrayList<Question>();

        for(int i = 0; i < EIGO_COUNT; i = i+1) {
            randomNumber = random.nextInt(fiveList.size());
            array.add(i, fiveList.get(randomNumber));
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
            Log.e("TAG","TAG");
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("DATE1",seikai);
            startActivity(intent);

        }
        else {
            //まだ終わってないなら次の問題に行く
            textView.setText(array.get(answercount).question);
            edittext.getText().clear();
        }
    }

    public void setDummyDate(){
        Question question1 = new Question("これ","this","5級");
        question1.save();
        Question question2 = new Question("あれ","that","5級");
        question2.save();
        Question question3 = new Question("これら","these","5級");
        question3.save();
        Question question4 = new Question("あれら","those","5級");
        question4.save();
        Question question5 = new Question("それ","it","5級");
        question5.save();
        Question question6 = new Question("彼らの","their","5級");
        question6.save();
        Question question7 = new Question("それらを","them","5級");
        question7.save();
        Question question8 = new Question("そこで","there is","5級");
        question8.save();
        Question question9 = new Question("〜がある（いる）","they","5級");
        question9.save();
        Question question10 = new Question("彼らは","who","5級");
        question10.save();
        Question question11 = new Question("誰が","what","5級");
        question11.save();
        Question question12 = new Question("何を","when","5級");
        question12.save();
        Question question13 = new Question("いつ","when","5級");
        question13.save();
        Question question14 = new Question("どこで","where","5級");
        question14.save();
        Question question15 = new Question("なぜ（どんな目的で）","why","5級");
        question15.save();
        Question question16 = new Question("どうやって","how","5級");
        question16.save();
        Question question17 = new Question("いくら","how much","5級");
        question17.save();
        Question question18 = new Question("1月","January","5級");
        question18.save();
        Question question19 = new Question("2月","February","5級");
        question19.save();
        Question question20 = new Question("3月","March","5級");
        question20.save();
        Question question21 = new Question("4月","April","5級");
        question21.save();
        Question question22 = new Question("5月","May","5級");
        question22.save();
        Question question23 = new Question("6月","June","5級");
        question23.save();
        Question question24 = new Question("7月","July","5級");
        question24.save();
        Question question25 = new Question("8月","August","5級");
        question25.save();
        Question question26 = new Question("9月","September","5級");
        question26.save();
        Question question27 = new Question("10月","October","5級");
        question27.save();
        Question question28 = new Question("11月","November","5級");
        question28.save();
        Question question29 = new Question("12月","December","5級");
        question29.save();
        Question question30 = new Question("日曜日","Sunday","5級");
        question30.save();
        Question question31 = new Question("月曜日","Monday","5級");
        question31.save();
        Question question32 = new Question("火曜日","Tuesday","5級");
        question32.save();
        Question question33 = new Question("水曜日","Wednesday","5級");
        question33.save();
        Question question34 = new Question("木曜日","Thursday","5級");
        question34.save();
        Question question35 = new Question("金曜日","Friday","5級");
        question35.save();
        Question question36 = new Question("土曜日","Saturday","5級");
        question36.save();
        Question question37 = new Question("国","country","5級");
        question37.save();
        Question question38 = new Question("日本","Japan","5級");
        question38.save();
        Question question39 = new Question("アメリカ","America","5級");
        question39.save();
        Question question40 = new Question("イギリス","England","5級");
        question40.save();
        Question question41 = new Question("中国","China","5級");
        question41.save();
        Question question42 = new Question("オーストラリア","Australia","5級");
        question42.save();
        Question question43 = new Question("ブラジル","Brazil","5級");
        question43.save();
        Question question44 = new Question("インド","India","5級");
        question44.save();
        Question question45 = new Question("イタリア","Italy","5級");
        question45.save();
        Question question46 = new Question("カナダ","Canada","5級");
        question46.save();
        Question question47 = new Question("フランス","France","5級");
        question47.save();
        Question question48 = new Question("ドイツ","Germany","5級");
        question48.save();
        Question question49 = new Question("ハワイ","Hawaii","5級");
        question49.save();
        Question question50 = new Question("韓国","Korea","5級");
        question50.save();
        Question question51 = new Question("英語","English","5級");
        question51.save();
        Question question52 = new Question("日本語（国語）","Japanese","5級");
        question52.save();
        Question question53 = new Question("算数（数学）","math","5級");
        question53.save();
        Question question54 = new Question("音楽","music","5級");
        question54.save();
        Question question55 = new Question("理科","science","5級");
        question55.save();
        Question question56 = new Question("社会","social studies","5級");
        question56.save();
        Question question57 = new Question("歴史","history","5級");
        question57.save();
        Question question58 = new Question("学校","school","5級");
        question58.save();
        Question question59 = new Question("校門","school gate","5級");
        question59.save();
        Question question60 = new Question("修学旅行","school trip","5級");
        question60.save();
        Question question61 = new Question("市役所","City Hall","5級");
        question61.save();
        Question question62 = new Question("クラス","class","5級");
        question62.save();
        Question question63 = new Question("教室","classroom","5級");
        question63.save();
        Question question64 = new Question("体育館","gym","5級");
        question64.save();
        Question question65 = new Question("時間","time","5級");
        question65.save();
        Question question66 = new Question("〜年","year","5級");
        question66.save();
        Question question67 = new Question("〜月","month","5級");
        question67.save();
        Question question68 = new Question("〜週","week","5級");
        question68.save();
        Question question69 = new Question("〜日","day","5級");
        question69.save();
        Question question70 = new Question("〜時間","hour","5級");
        question70.save();
        Question question71 = new Question("〜分","minute","5級");
        question71.save();
        Question question72 = new Question("今日","today","5級");
        question72.save();
        Question question73 = new Question("週末","weekend","5級");
        question73.save();
        Question question74 = new Question("朝、午前中","morning","5級");
        question74.save();
        Question question75 = new Question("午後","afternoon","5級");
        question75.save();
        Question question76 = new Question("晩","evening","5級");
        question76.save();
        Question question77 = new Question("夜","night","5級");
        question77.save();
        Question question78 = new Question("深夜","midnight","5級");
        question78.save();
        Question question79 = new Question("夕方","evening","5級");
        question79.save();
        Question question80 = new Question("毎日","every day","5級");
        question80.save();
        Question question81 = new Question("毎週","every week","5級");
        question81.save();
        Question question82 = new Question("毎年","every year","5級");
        question82.save();
        Question question83 = new Question("今月","this month","5級");
        question83.save();
        Question question84 = new Question("今朝","this morning","5級");
        question84.save();
        Question question85 = new Question("今日","today","5級");
        question85.save();
        Question question86 = new Question("明日","tomorrow","5級");
        question86.save();
        Question question87 = new Question("今夜","tonight","5級");
        question87.save();
        Question question88 = new Question("昨日","yesterday","5級");
        question88.save();
        Question question89 = new Question("一日中","all day","5級");
        question89.save();
        Question question90 = new Question("日","day","5級");
        question90.save();
        Question question91 = new Question("春","spring","5級");
        question91.save();
        Question question92 = new Question("夏","summer","5級");
        question92.save();
        Question question93 = new Question("秋","autumn","5級");
        question93.save();
        Question question94 = new Question("冬","winter","5級");
        question94.save();
        Question question95 = new Question("晴れ/元気","fine","5級");
        question95.save();
        Question question96 = new Question("晴れ","sunny","5級");
        question96.save();
        Question question97 = new Question("曇りの","cloudy","5級");
        question97.save();
        Question question98 = new Question("雨が降っている","rainy","5級");
        question98.save();
        Question question99 = new Question("雪が降っている","snowy","5級");
        question99.save();
        Question question100 = new Question("風が強い","windy","5級");
        question100.save();
        Question question101 = new Question("雨","rain","5級");
        question101.save();
        Question question102 = new Question("雲","cloud","5級");
        question102.save();
        Question question103 = new Question("太陽","sun","5級");
        question103.save();
        Question question104 = new Question("月","moon","5級");
        question104.save();
        Question question105 = new Question("星","star","5級");
        question105.save();
        Question question106 = new Question("雪","snow","5級");
        question106.save();
        Question question107 = new Question("風","wind","5級");
        question107.save();
        Question question108 = new Question("スポーツ","sport","5級");
        question108.save();
        Question question109 = new Question("野球","baseball","5級");
        question109.save();
        Question question110 = new Question("サッカー","soccer","5級");
        question110.save();
        Question question111 = new Question("テニス","tennis","5級");
        question111.save();
        Question question112 = new Question("バスケットボール","basketball","5級");
        question112.save();
        Question question113 = new Question("ゴルフ","golf","5級");
        question113.save();
        Question question114 = new Question("バレーボール","volleyball","5級");
        question114.save();
        Question question115 = new Question("ハイキング","hiking","5級");
        question115.save();
        Question question116 = new Question("ホッケー","hockey","5級");
        question116.save();
        Question question117 = new Question("ホームラン","home run","5級");
        question117.save();


    }


}

