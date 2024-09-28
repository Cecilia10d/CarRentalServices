package com.mycompany.carrentalservices;


public class Customer {

    private String name;
    private String drivingLicense;

    public Customer(String name, String drivingLicense) {
        this.name = name;
        this.drivingLicense = drivingLicense;
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }
}
