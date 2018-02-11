package com.example.minami.original;

import com.orm.SugarRecord;

/**
 * Created by minami on 2017/05/21.
 */

public class Question extends SugarRecord {
    String question;
    String answer;
    private String grade;

    public Question(){
    }
    public Question(String question,String answer,String grade){
        this.question=question;
        this.answer=answer;
        this.grade=grade;
    }

    public String getGrade() {
        return this.grade;
    }

}
