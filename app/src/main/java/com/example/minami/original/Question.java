package com.example.minami.original;

import com.orm.SugarRecord;

/**
 * Created by minami on 2017/05/21.
 */

public class Question extends SugarRecord {
    String question;
    String answer;
    public Question(){
    }
    public Question(String question,String answer){
        this.question=question;
        this.answer=answer;
    }

}
