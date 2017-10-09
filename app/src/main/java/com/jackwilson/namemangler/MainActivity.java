package com.jackwilson.namemangler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mEditText = (EditText) findViewById(R.id.name_text);
        mEditText.setText("First");

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(TextUtils.isEmpty(mEditText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Input Field Must Be Filled In", Toast.LENGTH_SHORT).show();
                } else{
                    String pass = mEditText.getText().toString();
                    Toast.makeText(MainActivity.this, "Input Filled In", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent (MainActivity.this, MangledName.class);
                    intent.putExtra("firstName", pass);
                    startActivity(intent);
                }
            }
        });
    }



}
