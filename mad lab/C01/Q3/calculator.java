package com.example.a19mca43.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     String s1,s2,s3;
    EditText num1;
    EditText num2;
    EditText ans;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNum()
    {

        num1=findViewById( R.id.first );
       num2=findViewById( R.id.second );
       ans=findViewById( R.id.answer );

       s1=num1.getText().toString();
       s2=num2.getText().toString();


    }
    public  void sum(View view)
    {
        getNum();
        n1= Integer.parseInt( s1 );
        n2= Integer.parseInt( s2 );
        s3=String.valueOf( n1+n2);
        ans.setText( s3 );

    }
    public  void mult(View view)
    {
        getNum();
        n1= Integer.parseInt( s1 );
        n2= Integer.parseInt( s2 );
        s3=String.valueOf( n1*n2);
        ans.setText( s3 );

    }
    public  void div(View view)
    {
        getNum();
        n1= Integer.parseInt( s1 );
        n2= Integer.parseInt( s2 );
        s3=String.valueOf( n1/n2);
        ans.setText( s3 );

    }
    public  void sub(View view)
    {
        getNum();
        n1= Integer.parseInt( s1 );
        n2= Integer.parseInt( s2 );
        s3=String.valueOf( n1-n2);
        ans.setText( s3 );

    }
}
