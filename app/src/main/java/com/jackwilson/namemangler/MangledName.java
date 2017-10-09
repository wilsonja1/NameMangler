package com.jackwilson.namemangler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MangledName extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangled_name);

        Intent myIntent = getIntent();
        String pass = myIntent.getStringExtra("firstName");

        //Toast.makeText(MangledName.this, pass, Toast.LENGTH_SHORT).show();
        mTextView = (TextView) findViewById(R.id.answer);
        mTextView.setText(pass);
    }
}
