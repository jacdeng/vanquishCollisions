package com.example.jacqu.vanquish2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class CasualtyReport {
    // fields
    private String PassengerVehicle;
    private String Cyclist;
    private String CommercialVehicle;
    private String Motorcycle;
    private String Pedestrian;

    // constructors
    public CasualtyReport() {}
    public CasualtyReport(String pv, String cyc,
                          String cv, String mtcy, String ped) {
        this.PassengerVehicle = pv;
        this.Cyclist = cyc;
        this.CommercialVehicle = cv;
        this.Motorcycle = mtcy;
        this.Pedestrian = ped;
    }
    // properties
    public void setPassengerVehicle(String pv) {
        this.PassengerVehicle = pv;
    }
    public String getPassengerVehicle() {
        return this.PassengerVehicle;
    }
    public void setCyclist(String cyc) {
        this.Cyclist = cyc;
    }
    public String getCyclist() {
        return this.Cyclist;
    }
    public void setCommercialVehicle(String cv) {
        this.CommercialVehicle = cv;
    }
    public String getCommercialVehicle() {
        return this.CommercialVehicle;
    }
    public void setMotorcycle(String mtcy) {
        this.Motorcycle = mtcy;
    }
    public String getMotorcycle() {
        return this.Motorcycle;
    }
    public void setPedestrian(String ped) {
        this.Pedestrian = ped;
    }
    public String getPedestrian() {
        return this.Pedestrian;
    }
}