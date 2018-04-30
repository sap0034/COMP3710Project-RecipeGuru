package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.sqlite.model;

public class Measurement {
    int MeasurementID;
    String MeasurementName;

    public Measurement() {

    }

    public Measurement(int MeasurementID, String MeasurementName) {
        this.MeasurementID = MeasurementID;
        this.MeasurementName = MeasurementName;
    }

    //getters and setters
    public void setMeasurementID(int MeasurementID) {this.MeasurementID = MeasurementID;}
    public int getMeasurementID() {return this.MeasurementID;}

    public void setMeasurementName(String MeasurementName) {this.MeasurementName = MeasurementName;}
    public String getMeasurementName() {return this.MeasurementName;}

}
