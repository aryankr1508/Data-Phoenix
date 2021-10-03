package com.example.challengingtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {
    Button b4;
    EditText ed3,ed4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        b4=(Button)findViewById(R.id.b4);
        ed3=(EditText)findViewById(R.id.ed3);
        ed4=(EditText)findViewById(R.id.ed4);

    }

    public void run(View view) {
        b4=(Button)findViewById(R.id.b4);
        Intent intent=new Intent(signup.this,shopping.class);
        startActivity(intent);

        ed3=(EditText)findViewById(R.id.ed3);
        ed4=(EditText)findViewById(R.id.ed4);

        FirebaseDatabase db1=FirebaseDatabase.getInstance("Via E-mail id ");

        DatabaseReference root=db1.getReference("E-mail  :- ");
        DatabaseReference root1=db1.getReference("Password :-  ");
        root.setValue(ed3.getText().toString());
        root1.setValue(ed4.getText().toString());

        ed3.setText("");
        ed4.setText("");

    }
}
