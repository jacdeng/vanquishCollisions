package com.example.jacqu.vanquish2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

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
        collision = findViewById(R.id.collision);
        nocollision = findViewById(R.id.nocollision);
    }

    public boolean iscollision;

    public void collision(View view) {
        switch (view.getId()) {

            case R.id.collision:

                nocollision.setChecked(false);
                iscollision = true;

                break;

            case R.id.nocollision:

                collision.setChecked(false);
                iscollision = false;

                break;
        }
    }


    public void nextButton(View view) {


        Entry e = new Entry(iscollision);

    }



}
