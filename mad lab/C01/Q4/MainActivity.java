package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
   EditText ed1,ed2,ed3,ed4,ed5;
   Button bts1;
   Pattern patterns;
   Matcher matches;
   String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       ed1=(EditText)findViewById(R.id.Name);
       ed2=(EditText)findViewById(R.id.Address);
       ed3=( EditText)findViewById(R.id.Email);
       ed4=(EditText)findViewById(R.id.Password);
       // String email=ed3.getText().toString().trim();
       String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
       //String passPattern="[(?=.\d)(?=.[!@#$%^&])(?=.[a-z])(?=.*[A-Z]).{8,}]";
       bts1=(Button)findViewById(R.id.bt1);
       bts1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               login();
           }
       });
   }
   public void login() {
       String email = ed3.getText().toString().trim();
       String nam = ed1.getText().toString();
       //String email=ed3.getText().toString();
       if (ed1.getText().toString().length() == 0) {
           ed1.requestFocus();
           ed1.setError("Enter valid name");
           return;
       }
       String namePattern = "[0-9!@#$%^&*]";
       if (ed1.getText().toString().matches(namePattern)) {
           ed1.requestFocus();
           ed1.setError("Enter valid name");
           return;

       }
       if (ed2.getText().toString().length() == 0) {
           ed2.requestFocus();
           ed2.setError("Enter valid address");
           return;
       }
       if (ed3.getText().toString().length() == 0) {
           Toast.makeText(getApplicationContext(), "Invalid Email Address", Toast.LENGTH_SHORT).show();
           ed3.requestFocus();
           ed3.setError("Enter valid email");
           return;
       }
       if (!email.matches(emailPattern)) { //Toast.makeText(getApplicationContext(),"Invalid Email Address",Toast.LENGTH_SHORT).show();
           ed3.requestFocus();
           ed3.setError("Invalid email");

       } else {
           Toast.makeText(getApplicationContext(), "valid Email Address", Toast.LENGTH_SHORT).show();
       }
       if (ed4.getText().toString().length() == 0) {
           ed4.requestFocus();
           ed4.setError("Enter valid password");
           return;
       }
       if (ed4.getText().toString().length() < 8) {
           ed4.requestFocus();
           ed4.setError("Enter minimum 8 digit password");
           return;
       }
   }
   }
