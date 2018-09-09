package com.example.jacqu.vanquish2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList Entries;



    public class Vehicle{
        private String Vehicle;

        public Vehicle(String s){
            this.Vehicle = s;
        }
    }

    public Vehicle Passenger = new Vehicle("Passenger");
    public Vehicle Motorbike = new Vehicle("Motorbike");
    public Vehicle Cyclist = new Vehicle("Cyclist");
    public Vehicle Commercial = new Vehicle("Commercial");
    public Vehicle Pedestrian = new Vehicle("Pedestrian");

    public class Entry{
        private boolean Collision;
        private Vehicle Vehicle;

        public Entry(Boolean b){
            this.Collision = b;
        }

    }
    private CheckBox collision, nocollision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public boolean iscollision;

    public void collision(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Collision:
                if (checked)
                    iscollision = true;
                    break;
            case R.id.noCollision:
                if (checked)
                    iscollision = false;
                    break;
        }
    }

    public void previous(View view) {
        Intent previouspage = new Intent(this, SecondActivity.class);

        startActivity(previouspage);
    }



    public void nextButton(View view) {


        Entry e = new Entry(iscollision);

    }



}
