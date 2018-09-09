package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    public void previous1(View view) {
        Intent previous1 = new Intent(this, Casualty.class);

        startActivity(previous1);
    }

    public void previous2(View view) {
        Intent previous2 = new Intent(this, noCollision.class);

        startActivity(previous2);
    }

    public void lastNext(View view) {

        Intent lastNext = new Intent(this, Thnx_bruh.class);

        startActivity(lastNext);

    }
}
