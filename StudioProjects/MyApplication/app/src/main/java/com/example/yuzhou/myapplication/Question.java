package com.example.yuzhou.myapplication;

/**
 * Created by yuzhou on 2016-09-27.
 */

//this is the model



public class Question {


    private int mTestResId;
    private boolean mAnswerTrue;

    public int getmTestResId() {
        return mTestResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmTestResId(int mTestResId) {
        this.mTestResId = mTestResId;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public Question (int testResId, boolean answerTrue)
    {
        mTestResId = testResId;
        mAnswerTrue = answerTrue;
    }




}
