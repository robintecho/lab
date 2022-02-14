package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
   EditText username,password;
   Button btn;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       username = (EditText) findViewById(R.id.usr);
       password = (EditText) findViewById(R.id.pass);
       btn = (Button) findViewById(R.id.button);
       btn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {

               validate();
           }
       });

   }

   public void validate()
   {
       String name=username.getText().toString();
       String pass=password.getText().toString();
       String namePattern="[0-9!@#$%^&*]";
       int valid=1;

       if(name.length()==0)
       {
           username.getText().clear();
           username.requestFocus();
           username.setError("Enter  name ");
           Toast.makeText(getApplicationContext(), "Enter valid name", Toast.LENGTH_SHORT).show();
           valid++;
       }
       if(name.matches(namePattern))
       {
           username.getText().clear();
           username.requestFocus();
           username.setError("Name contains illegal characters");
           Toast.makeText(getApplicationContext(), "Enter valid name", Toast.LENGTH_SHORT).show();
           valid++;
       }

       if(password.length()==0)
       {
           password.requestFocus();
           password.setError("Enter password");
           valid++;
       }
       if(password.length()<5)
       {
           password.requestFocus();
           password.setError("Enter 5 digit password");
           valid++;

       }


       if(valid==1)
       {
           Toast.makeText(getApplicationContext(), "VALIDATION SUCESSFULL", Toast.LENGTH_SHORT).show();
       }
       if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
       {
           Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
       }else
       {
           Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
       }
   }


}

