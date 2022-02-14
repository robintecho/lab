package com.example.a19mca43.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;

Button b;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate( savedInstanceState );
       setContentView( R.layout.activity_main );
       e1= findViewById( R.id.name );
       e2=findViewById( R.id.age );
       e3=findViewById( R.id.mob );
       e4=findViewById( R.id.email );
       e5=findViewById( R.id.pass );

       b=findViewById( R.id.button );

       b.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SharedPreferences sp=getSharedPreferences( "pref",MODE_PRIVATE );
               SharedPreferences.Editor edt=sp.edit();
               edt.putString( "key",e1.getText().toString() );
               edt.putString( "key1",e2.getText().toString() );
               edt.putString( "key2",e3.getText().toString() );
               edt.putString( "key3",e4.getText().toString() );
               edt.putString( "key4",e5.getText().toString() );
               edt.apply();
               Intent i = new Intent(getApplicationContext(), Main2Activity.class);
               String str = "Name     :         "+ e1.getText().toString();
               i.putExtra("Value1", str);
               String str1 ="Age :         "+ e2.getText().toString();
               i.putExtra("Value2", str1);
               String str2 = "Mobile  :         "+ e3.getText().toString();
               i.putExtra("Value3", str2);
               String str3 = "Email  :         "+ e4.getText().toString();
               i.putExtra("Value4", str3);
               String str4 = "Password  :         "+ e5.getText().toString();
               i.putExtra("Value5", str4);



               startActivity(i);
           }

       } );
       SharedPreferences getsharedValue=getSharedPreferences("pref",MODE_PRIVATE);
       String value=getsharedValue.getString("key"," ");
       String value1=getsharedValue.getString("key1"," ");
       String value2=getsharedValue.getString("key2"," ");
       String value3=getsharedValue.getString("key3"," ");
       String value4=getsharedValue.getString("key4","");
       e1.setText(value);
       e2.setText(value1);
       e3.setText(value2);
       e4.setText(value3);
       e5.setText(value4);
   }
