package com.example.azhch.study;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn1);
        btn.setText("click me!");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.view1);
                textView.setText("得玛西亚");
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText("Jump");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                TextView textView = (TextView) findViewById(R.id.view1);
//                textView.setText("Hello World!");

                Intent intent = new Intent();
                intent.setClass(view.getContext(), FrmMessage.class);
//                startActivity(intent);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            TextView textView = (TextView) findViewById(R.id.view1);
            String result = data.getStringExtra("result");
            textView.setText(textView.getText() + result);
        }
    }

//    @Override
//    public void onClick(View view) {
//        if (view.getId() == R.id.btn1) {
//            TextView textView = (TextView) findViewById(R.id.view1);
//            textView.setText("得玛西亚");
//        } else {
//            TextView textView = (TextView) findViewById(R.id.view1);
//            textView.setText("Hello World!");
//
//            Intent intent = new Intent();
//            intent.setClass(this, FrmMessage.class);
//            startActivity(intent);
//
//        }
//    }
}
