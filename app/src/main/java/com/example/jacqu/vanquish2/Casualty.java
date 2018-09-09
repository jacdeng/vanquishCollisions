package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Casualty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casualty);
    }
    public void previous(View view) {
        Intent previouspage = new Intent(this, MainActivity.class);

        startActivity(previouspage);
    }



    public void next(View view) {

        Intent next1 = new Intent(this, Details.class);


        startActivityForResult(next1, 1);

    }
}
