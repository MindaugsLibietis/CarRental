package com.rcs;


import com.sun.xml.internal.ws.handler.ClientSOAPHandlerTube;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Client lietotajs = new Client();

        List<Car> carList = new ArrayList<Car>();

        Car a1 = new Car(45.00, 2007, "Volvo", true, "GD 1337", "V70", "5HBDM84627C13444", 5);carList.add(a1);
        Car a2 = new Car(45.00, 2005, "Audi", true, "GD 1743", "A6", "6HGAZ84347B45754", 5);carList.add(a2);
        Car a3 = new Car(67.00, 2013, "Subaru", true, "GJ 5347", "Forester", "1CDMV84357N14334", 5);carList.add(a3);
        Car a4 = new Car(62.00, 2009, "Volvo", true, "GI 1543", "XC-90", "1HJKN46357H15337", 5);carList.add(a4);
        Car b1 = new Car( 77.00, 2013, "BMW", true, "GB 2356", "335i", "1HGKM81327H15734", 5);carList.add(b1);
        Car b2 = new Car( 75.00, 2013, "BMW", true, "GC 6453", "530d", "7HBDM43577H25444", 5);carList.add(b2);
        Car b3 = new Car( 69.00, 2015, "Volkswagen", true, "GJ 4366", "Passat", "1HGKM663427C15334", 5);carList.add(b3);
        Car b4 = new Car( 65.00, 2013, "Toyota", true, "GG 2359", "Rav4", "8HSMM81429G62728", 5);carList.add(b4);
        while (true) {
            System.out.println("Iepsejamas operacijas:");
            System.out.println("1. redzet visu mašīnu sarakstu");
            System.out.println("2. redzet visu pieejamo mašīnu sarakstu");
            System.out.println("3. kļūt par lietotāju");
            System.out.println("4. rezervēt auto");
            System.out.println("5. atgriezt auto");
            System.out.println("6. aprēķināt cenu");
            System.out.println("7. manas rentes");


            Scanner sc = new Scanner(System.in);
            String toDo = sc.nextLine();
            switch (toDo) {
                case "1":
                    for (Car car : carList) {
                        System.out.println(car);
                    }
                    break;
                case "2":
                    for (Car car : carList) {
                        if (car.isAvailable()) {
                            System.out.println(car);
                        }
                    }
                    break;
                case "3":
                    System.out.println("ievadiet Vārdu");
                    String name = sc.nextLine();
                    System.out.println("ievadiet Uzvārdu");
                    String surname = sc.nextLine();
                    System.out.println("ievadiet dzimšanas datus (dd/mm/yyyy)");
                    Date date = null;
                    try {
                        date = new SimpleDateFormat("dd/mm/yyyy").parse(sc.nextLine());
                    } catch (ParseException e) {
                        System.out.println("Nepareizā formātā ievadīts datums, lūdzu mēģiniet velreiz");
                        break;
                        //e.printStackTrace();
                    }
                    System.out.println("ievadiet vadītāja apliecības nr.");
                    String aplNr = sc.nextLine();

                    License license = new License(name, surname, date, aplNr);
                    String id = UUID.randomUUID().toString();
                    Client klients = new Client(id, license);
                    lietotajs = klients;
                    break;
                case "4":
                    for (Car car : carList) {
                        if (car.isAvailable()) {
                            System.out.println(car.printet());
                        }
                    }
                    System.out.println("Lūdzu izvēlaties auto: (raksties plates nr.)");
                    String izvele = sc.nextLine();

                    for (Car car : carList) {
                        if (izvele.equalsIgnoreCase(car.getPlate())) {
                            Rental rent = new Rental(car, lietotajs);
                            lietotajs.getRents().add(rent);
                            car.setAvailable(false);
                        }
                    }
                    break;
                case "5":
                    System.out.println("jusu iziretais auto");
                    System.out.println(lietotajs.getRents());
                break;
                case "6":
                    System.out.println("ievadiet dienu skaitu, cik vēlaties auto īrēt");
                    int dienas = sc.nextInt();

                    for (Car car : carList) {
                        if (car.isAvailable()) {
                            System.out.println(car.printet());
                        }
                    }
                    sc.nextLine();
                    System.out.println("ievadiet plates nr.");
                    String izvelne = sc.nextLine();
                    for (Car car : carList) {
                        if (izvelne.equalsIgnoreCase(car.getPlate())) {
                            double cena = dienas * car.getPrice();
                            System.out.printf("jūsu auto cena par %s dienām būs : %d\n", dienas, cena);
                        }
                    }
                break;
            }
        }
    }
}
