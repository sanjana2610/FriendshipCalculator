package com.example.sanju.friendshipcalculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void start(View view)
    {

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}