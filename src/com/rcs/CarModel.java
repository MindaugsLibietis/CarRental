package com.rcs;

public class CarModel {
    protected int year;
    protected String make;
    protected String carModel;
    protected Integer nrOfSeats;

    public Integer getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(Integer nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

}
