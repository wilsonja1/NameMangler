package com.jackwilson.namemangler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MangledName extends AppCompatActivity {

    private String[] lastNameArray = {" Washington", " Nickodemus", " Wilson", " Dummy", " Bakos"};
    private Button mResetButton;
    private TextView mTextView;
    private Button mReMangleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangled_name);

        Intent myIntent = getIntent();
        String pass = myIntent.getStringExtra("firstName");

        //Toast.makeText(MangledName.this, pass, Toast.LENGTH_SHORT).show();
        mTextView = (TextView) findViewById(R.id.answer);
        int random = new Random().nextInt(0) + lastNameArray.length-1;
        mTextView.setText(pass+lastNameArray[random]);


        mResetButton = (Button) findViewById(R.id.button2);
        mResetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    Intent intent = new Intent (MangledName.this, MainActivity.class);
                    startActivity(intent);
            }
        });

        mReMangleButton = (Button) findViewById(R.id.button1);
        mReMangleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent (MangledName.this, MangledName.class);
                startActivity(intent);
            }
        });
    }
}
