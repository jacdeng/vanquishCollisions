package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Thnx extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thnx);
    }

    public void previous(View view) {
        Intent previouspage = new Intent(this, Details.class);

        startActivity(previouspage);
    }



}
