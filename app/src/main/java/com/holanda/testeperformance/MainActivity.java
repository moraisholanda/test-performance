package com.holanda.testeperformance;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    private static final int COUNT = 1000;

    @ViewById
    TextView textFormat;
    @ViewById
    TextView textConcat;
    @ViewById
    TextView textBuilder;
    @ViewById
    TextView textBuffer;


    @Click(R.id.buttonFormat)
    public void stringFormat(){
        String stFormat = "";
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < COUNT; i ++){
            stFormat.format("%s", "a");
        }
        double timeElapsed = timeEnd(System.currentTimeMillis()- timeStart);
        textFormat.setText(timeElapsed>0 ? String.valueOf(timeElapsed):"0");
    }
    @Click(R.id.buttonConcat)

    public void stringConcat(){
        String strFinal = "";
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < COUNT; i ++){
            strFinal += "a";
        }
        double timeElapsed = timeEnd(System.currentTimeMillis()- timeStart);
        textConcat.setText(timeElapsed>0 ? String.valueOf(timeElapsed):"0");
    }
    @Click(R.id.buttonBuffer)
    public void stringBuffer(){
        StringBuffer strBuffer = new StringBuffer();
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < COUNT; i ++){
            strBuffer.append("a");
        }
        double timeElapsed = timeEnd(System.currentTimeMillis()- timeStart);

        textBuffer.setText(timeElapsed>0 ? String.valueOf(timeElapsed):"0");
    }
    @Click(R.id.buttonBuilder)
    public void stringBuilder(){
        StringBuilder strBuilder = new StringBuilder();
        long timeStart = System.currentTimeMillis();

        for(int i = 0; i < COUNT; i ++){
            strBuilder.append("a");
        }
        double timeElapsed = timeEnd(System.currentTimeMillis()- timeStart);
        textBuilder.setText(timeElapsed>0 ? String.valueOf(timeElapsed):"0");
    }

    private double timeEnd(long elapsedTime){
        return elapsedTime/1000.0;
    }
}
