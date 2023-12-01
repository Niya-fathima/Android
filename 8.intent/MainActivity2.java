package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        Bundle extra=getIntent().getExtras();
        String text1=extra.getString("first name");
        String text2=extra.getString("second name");
        txt1.setText("first name: "+text1);
        txt2.setText("second name: "+text2);
    }
}