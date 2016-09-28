package com.example.yuzhou.myapplication;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
//this is the controller

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNestButton;
    private TextView mQuestionTextView;
    int current_index = 0;

    private Question[] mQuestionBank = new Question[] {
        new Question(R.string.question_1, true),
            new Question(R.string.question_2, true),
        new Question(R.string.question_3, true),
        new Question(R.string.question_4, true),
        new Question(R.string.question_5, true)
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "starting over....");



        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() is called.");







        setContentView(R.layout.activity_main);

        //initialize buttons
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNestButton = (Button) findViewById(R.id.next_button);
        mQuestionTextView = (TextView) findViewById(R.id.question_view);

        mQuestionTextView.setText(mQuestionBank[0].getmTestResId());

        mNestButton.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){
                    current_index = (current_index+1)%5;
                    mQuestionTextView.setText(mQuestionBank[current_index].getmTestResId());
        }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() is called.");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() is called.");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() is called.");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() is called.");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() is called.");
    }

    //true button listener
}
