package com.rcs;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private List<Rental> Client = new ArrayList<>();
    private License license;

    public Client(String id, List<Rental> Client, License license) {
        this.id = id;
        this.Client = Client;
        this.license = license;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Rental> getClient() {
        return Client;
    }

    public void setClient(List<Rental> client) {
        Client = client;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
