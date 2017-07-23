package com.example.minami.original;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ListView;

import java.util.HashMap;
import java.util.List;
import java.util.Random;


/**
 * Created by minami on 2017/02/19.
 */
public class QuestionActivity extends AppCompatActivity {
    TextView textView;
    Random random = new Random();

    // はじめてのコメント

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        textView =  (TextView)findViewById(R.id.textView);

        List<Question> mlist = Question.listAll(Question.class);
            int r = random.nextInt(10);
            Log.d("Number", "Question" + r);

        setDummyDate();
        /*
            ほりー参上！！！
            w(￣▽￣;)wﾜｵｯ!!
         */
        //ﾔﾚﾔﾚ ┐(´ｰ｀)┌
    }

    public void setDummyDate(){
        Question question1 = new Question("卵","egg");
        question1.save();
        Question question2 = new Question("カバン","bag");
        question2.save();
        Question question3 = new Question("バラ","rose");
        question3.save();
        Question question4 = new Question("いす","chair");
        question4.save();
        Question question5 = new Question("バット","bat");
        question5.save();
        Question question6 = new Question("魚","fish");
        question6.save();
        Question question7 = new Question("ノート","notebook");
        question7.save();
        Question question8 = new Question("鉛筆","pencil");
        question8.save();
        Question question9 = new Question("犬","dog");
        question9.save();
        Question question10 = new Question("机","desk");
        question10.save();
        Question question11 = new Question("腕時計","watch");
        question11.save();
        Question question12 = new Question("ミット","mitt");
        question12.save();
        Question question13 = new Question("牛乳","milk");
        question13.save();
        Question question14 = new Question("花","flower");
        question14.save();
        Question question15 = new Question("ドア","door");
        question15.save();
        Question question16 = new Question("ボート","boat");
        question16.save();
        Question question17 = new Question("ピアノ","piano");
        question17.save();
        Question question18 = new Question("オレンジ","orange");
        question18.save();
        Question question19 = new Question("鳥","bird");
        question19.save();
        Question question20 = new Question("羊","sheep");
        question20.save();
        Question question21 = new Question("カップ","cup");
        question21.save();
        Question question22 = new Question("バス","bus");
        question22.save();
        Question question23 = new Question("りんご","apple");
        question23.save();
        Question question24 = new Question("果物","fruit");
        question24.save();
        Question question25 = new Question("自動車","car");
        question25.save();
        Question question26 = new Question("ケーキ","cake");
        question26.save();
        Question question27 = new Question("絵、写真","picture");
        question27.save();
        Question question28 = new Question("切手","stamp");
        question28.save();
        Question question29 = new Question("飛行機","plane");
        question29.save();
        Question question30 = new Question("本","book");
        question30.save();
        Question question31 = new Question("ラケット","racket");
        question31.save();
        Question question32 = new Question("コップ、ガラス","glass");
        question32.save();
        Question question33 = new Question("ベッド","bed");
        question33.save();
        Question question34 = new Question("手紙","letter");
        question34.save();
        Question question35 = new Question("テープ","tape");
        question35.save();
        Question question36 = new Question("帽子","cap");
        question36.save();
        Question question37 = new Question("郵便","mail");
        question37.save();
        Question question38 = new Question("箱","box");
        question38.save();
        Question question39 = new Question("パン","bread");
        question39.save();
        Question question40 = new Question("人形","doll");
        question40.save();
        Question question41 = new Question("テーブル","table");
        question41.save();
        Question question42 = new Question("木","tree");
        question42.save();
        Question question43 = new Question("ペン","pen");
        question43.save();
        Question question44 = new Question("地図","map");
        question44.save();
        Question question45 = new Question("牛","cow");
        question45.save();
        Question question46 = new Question("ポット","pot");
        question46.save();
        Question question47 = new Question("カメラ","camera");
        question47.save();
        Question question48 = new Question("手","hand");
        question48.save();
        Question question49 = new Question("レモン","lemon");
        question49.save();
        Question question50 = new Question("中庭","yard");
        question50.save();
        Question question51 = new Question("銀行、土手","bank");
        question51.save();
        Question question52 = new Question("図書館","library");
        question52.save();
        Question question53 = new Question("病院","hospital");
        question53.save();
        Question question54 = new Question("ホテル","hotel");
        question54.save();
        Question question55 = new Question("村","village");
        question55.save();
        Question question56 = new Question("台所","kitchen");
        question56.save();
        Question question57 = new Question("壁","wall");
        question57.save();
        Question question58 = new Question("公園","park");
        question58.save();
        Question question59 = new Question("少女","girl");
        question59.save();
        Question question60 = new Question("父","father");
        question60.save();
        Question question61 = new Question("医者","doctor");
        question61.save();
        Question question62 = new Question("ホテル","hotel");
        question62.save();
        Question question63 = new Question("村","village");
        question63.save();









    }
}

