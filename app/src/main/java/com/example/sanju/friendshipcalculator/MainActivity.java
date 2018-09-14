package com.example.sanju.friendshipcalculator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    Button btn;
    EditText et1;
    EditText et2;
    String s1;
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9b4aa1")));
        btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
                et1 = findViewById(R.id.input1);
                s1 = et1.getText().toString();
                et2 = findViewById(R.id.input2);
                s2 = et2.getText().toString();
                if(s1.equals("")) {
                    Toast.makeText(MainActivity.this, "please enter your name", Toast.LENGTH_SHORT).show();
                }else if(s2.equals("")){
                    Toast.makeText(MainActivity.this,"please enter friend name",Toast.LENGTH_SHORT).show();}
                else{
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                i.putExtra("KEY1", s1);
                i.putExtra("KEY2", s2);
                startActivity(i);}}
            });
        }}