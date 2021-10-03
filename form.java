package com.example.challengingtask;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class form extends AppCompatActivity {
    RatingBar ratingBar;
    Button button2;
    EditText t1,t2,t3,t4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        button2=(Button)findViewById(R.id.button2);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        t1 = (EditText) findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.address);
        t3=(EditText)findViewById(R.id.city);
        t4=(EditText)findViewById(R.id.item);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thankxx For Shopping I hope you visit again",Toast.LENGTH_SHORT).show();
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(form.this,t4);

                popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(getApplicationContext(),menuItem.getTitle(),Toast.LENGTH_LONG).show();
                        return true;


                    }


                });
                popupMenu.show();


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thankx For Purchasing ",Toast.LENGTH_LONG).show();
            }
        });


    }



    public void data(View view) {

        t1 = (EditText) findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.address);
        t3=(EditText)findViewById(R.id.city);
        t4=(EditText)findViewById(R.id.item);


        String name=t1.getText().toString().trim();
        String address=t2.getText().toString().trim();
        String city=t3.getText().toString().trim();
        String item=t4.getText().toString().trim();

        databseholder obj=new databseholder(name,address,city,item);

        FirebaseDatabase db=FirebaseDatabase.getInstance("Users Details");
        DatabaseReference node=db.getReferenceFromUrl("https://mydatabse-80631.firebaseio.com/");
        node.child("Users Details").setValue(obj);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");



    }
}

