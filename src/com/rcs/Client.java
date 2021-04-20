package com.rcs;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private List<Rental> rents = new ArrayList<>();
    private License license;

    public Client(String id, List<Rental> rents, License license) {
        this.id = id;
        this.rents = rents;
        this.license = license;
    }

    public Client(String id, License license) {
        this.id = id;
        this.license = license;
    }

    protected Client() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Rental> getRents() {
        return rents;
    }

    public void setRents(List<Rental> rents) {
        this.rents = rents;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
