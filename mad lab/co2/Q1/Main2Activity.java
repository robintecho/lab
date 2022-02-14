package com.example.a19mca43.sharedpref;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate( savedInstanceState );
       setContentView( R.layout.activity_main2 );
       TextView t1,t2,t3;
       TextView t4,t5;

       t1 =  findViewById(R.id.t1);
       t2 =  findViewById(R.id.t2);
       t3 = findViewById(R.id.t3);
       t4 = findViewById(R.id.t4);
       t5 = findViewById(R.id.t5);
       // create the get Intent object
       Intent intent = getIntent();

       // receive the value by getStringExtra() method
       // and key must be same which is send by first activity
       String str = intent.getStringExtra("Value1");
       String str1 = intent.getStringExtra("Value2");
       String str2 = intent.getStringExtra("Value3");
       String str3 = intent.getStringExtra("Value4");
       String str4 = intent.getStringExtra("Value5");

       // display the string into textView
       t1.setText(str);
       t2.setText(str1);
       t3.setText(str2);
       t4.setText(str3);
       t5.setText(str4);


   }
}
