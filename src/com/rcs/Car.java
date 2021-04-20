package com.rcs;

public class Car extends CarModel{

    private double price;
    private boolean available;
    private String plate;
    private String vinNr;

    public Car(double price, int year, String make, boolean available, String plate, String carModel, String vinNr, Integer nrOfSeats) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.available = available;
        this.plate = plate;
        this.carModel = carModel;
        this.vinNr = vinNr;
        this.nrOfSeats = nrOfSeats;
    }

    public Car(String make, String carModel, int year, double price) {
        this.make = make;
        this.carModel = carModel;
        this.year = year;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getVinNr() {
        return vinNr;
    }

    public void setVinNr(String vinNr) {
        this.vinNr = vinNr;
    }

    @Override
    public String toString() {
        if (this.available) {
            return String.format("Car Mark: %s\nCar Model: %s\nCar Year: %s\nStatus: Available\n Price: %.2f\n", this.make, this.carModel, this.year, this.price);
        } else {
            return String.format("Car Mark: %s\nCar Model: %s\nCar Year: %s\nStatus: NotAvailable\n Price: %.2f\n", this.make, this.carModel, this.year, this.price);
        }
    }

    public Object printet() {
        if (this.available) {
            return String.format("Car Mark: %s\nCar Model: %s\nCar Year: %s\nPlate: %s\nPrice: %.2f\n", this.make, this.carModel, this.year, this.plate, this.price);
        } else
            return String.format("auto nav pieejams");
    }
}
