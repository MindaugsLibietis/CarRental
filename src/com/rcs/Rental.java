package com.rcs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rental {
    private Date Started;
    private Date Returned;
    private Car car;
    private Client client;
    private List<Car> Rental = new ArrayList<>();

    public Date getStarted() {
        return Started;
    }

    public void setStarted(Date started) {
        Started = started;
    }

    public Date getReturned() {
        return Returned;
    }

    public void setReturned(Date returned) {
        Returned = returned;
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

    public List<Car> getRental() {
        return Rental;
    }

    public void setRental(List<Car> rental) {
        Rental = rental;
    }
}
