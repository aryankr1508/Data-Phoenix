package com.example.challengingtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login extends AppCompatActivity {

    Button b5,b3;
    EditText ed1,ed2;
    FirebaseDatabase root,root1;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        b5=(Button)findViewById(R.id.b5);
        b3=(Button)findViewById(R.id.b3);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);




        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.length()==10){

                }
                else{
                    Toast.makeText(getApplicationContext(),"Error phone number should be 10 digit",Toast.LENGTH_LONG).show();
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,shopping.class);
                startActivity(intent);

                root=FirebaseDatabase.getInstance();
                reference=root.getReference("Phone Number");
                reference=root1.getReference("Otp");
                reference.setValue(ed1.getText().toString());
                reference.setValue(ed2.getText().toString());
                ed1.setText("");
                ed2.setText("");

                if (ed2.length()==5){

                }
                else{
                    Toast.makeText(getApplicationContext(),"The OTP Must be 5 digit",Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}
