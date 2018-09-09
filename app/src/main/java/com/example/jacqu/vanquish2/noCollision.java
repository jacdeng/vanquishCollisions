package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class noCollision extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_collision);
    }

    public void previousButton(View view) {
        Intent previousButton = new Intent(this, MainActivity.class);

        startActivity(previousButton);
    }



    public void nextButton(View view) {

        Intent nextButton = new Intent(this, Details.class);

        startActivityForResult(nextButton, 1);
    }
}


