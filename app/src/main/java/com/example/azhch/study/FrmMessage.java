package com.example.azhch.study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by azhch on 2017/09/23.
 */

public class FrmMessage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("今晚召唤师峡谷见！");

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setText("back!");
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}
