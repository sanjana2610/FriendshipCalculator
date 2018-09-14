package com.example.sanju.friendshipcalculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity3 extends  MainActivity {
    String st1;
    String st2;
    String re1,re2,re3;
    TextView t;
    TextView t1;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent in=getIntent();
        st1=in.getStringExtra("KEY1");
        st2=in.getStringExtra("KEY2");
            re1 = st1 + st2;
            re1 = re1.toUpperCase();
            re3=st1.toUpperCase()+" and "+st2.toUpperCase();
        t1=(TextView) findViewById(R.id.test);
        t1.setText(re3);
            if (re1.equals("RAJKUMARSANJANA") || re1.equals("SANJANARAJKUMAR") || re1.equals("SANJURAJU") || re1.equals("RAJUSANJU")) {
                score = 100;
                re2 = "Best friends for Ever !\nDUMBO!!!\nYour score is:" + Integer.toString(score) + "%";
                ImageView outp = (ImageView) findViewById(R.id.pic);
                outp.setImageDrawable(getResources().getDrawable(R.drawable.bf3));
            } else {
                for (int i = 0; i < re1.length(); i++) {
                    if (re1.charAt(i) == 'A' || re1.charAt(i) == 'O' || re1.charAt(i) == 'U') {
                        score = score + 5;
                    } else if (re1.charAt(i) == 'F' || re1.charAt(i) == 'R' || re1.charAt(i) == 'I' || re1.charAt(i) == 'E' || re1.charAt(i) == 'N' || re1.charAt(i) == 'D' || re1.charAt(i) == 'S') {
                        score = score + 10;
                    } else {
                        continue;
                    }
                }
                if (score <= 25) {
                    re2 = "This could only work if both of You are brutally honest.if not, you will be fake friends. \nYour score is:" + Integer.toString(score) + "%.";
                    ImageView outp = (ImageView) findViewById(R.id.pic);
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.down));
                } else if (score > 25 && score <= 50) {
                    re2 = "This is a FAIR-WEATHER friendship for now, But it has the potential to grow further.\nYour score is:" + Integer.toString(score) + "%.";
                    ImageView outp = (ImageView) findViewById(R.id.pic);
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.down));
                } else if (score > 50 && score <= 75) {
                    re2 = "Your friendship is like a Flower_Blooming,Water it more.\nYour score is:" + Integer.toString(score) + "%.";
                    ImageView outp = (ImageView) findViewById(R.id.pic);
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.up));
                } else {
                    if(score<=100){
                    re2 = "You stick together for both bad and good times. This can be your friend for life.\nYour score is:" + Integer.toString(score) + "%.";
                    ImageView outp = (ImageView) findViewById(R.id.pic);
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.bf3));
                }else{
                        score=100;
                        re2 = "You stick together for both bad and good times. This can be your friend for life.\nYour score is:" + Integer.toString(score) + "%.";
                        ImageView outp = (ImageView) findViewById(R.id.pic);
                        outp.setImageDrawable(getResources().getDrawable(R.drawable.bf3));
                    }
            }}
         t=(TextView) findViewById(R.id.result);
            t.setText(re2);
    }
}