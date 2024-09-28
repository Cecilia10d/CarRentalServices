package com.mycompany.carrentalservices;

public class Car {
    private String make;
    private String model;
    private String numberPlate;
    private double rentalPrice;
    private boolean isAvailable;

    public Car(String make, String model, String numberPlate, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.numberPlate = numberPlate;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true; 
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        this.isAvailable = false;
    }

    public void returnCar() {
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + numberPlate + ") - $" + rentalPrice + " per day";
    }
}