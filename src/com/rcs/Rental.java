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
}
