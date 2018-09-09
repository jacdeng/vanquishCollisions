package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Thnx_bruh extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thnx_bruh);
    }

    public void previous(View view) {
        Intent previouspage = new Intent(this, SecondActivity.class);

        startActivity(previouspage);
    }



    public void nextButton(View view) {

        Intent nextpage = new Intent(this, Casualty.class);

        startActivity(nextpage);

    }
}
