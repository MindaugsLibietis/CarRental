package com.rcs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rental {
    private int days;
    private Car car;
    private Client client;

    public Rental(int days, Car car, Client client) {
        this.days = days;
        this.car = car;
        this.client = client;
    }

    public Rental(Car car, Client client) {
        this.car = car;
        this.client = client;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return String.format("Auto kuru īrēju:\n %s", car);
    }
}
