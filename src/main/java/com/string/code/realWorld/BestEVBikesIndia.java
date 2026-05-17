package com.string.code.realWorld;

import java.util.ArrayList;

/**
 * @author Naveen K Wodeyar
 * @date 17-May-2026
 */

class EVBike {
    String name;
    int range;
    int topSpeed;
    String advantage;

    EVBike(String name, int range, int topSpeed, String advantage) {
        this.name = name;
        this.range = range;
        this.topSpeed = topSpeed;
        this.advantage = advantage;
    }

    void display() {
        System.out.println("Bike Name : " + name);
        System.out.println("Range     : " + range + " km");
        System.out.println("Top Speed : " + topSpeed + " km/h");
        System.out.println("Advantage : " + advantage);
        System.out.println("-----------------------------------");
    }
}

public class BestEVBikesIndia {
    public static void main(String[] args) {

        ArrayList<EVBike> bikes = new ArrayList<>();

        bikes.add(new EVBike(
                "Ather 450X",
                150,
                90,
                "Excellent build quality and smart features"
        ));

        bikes.add(new EVBike(
                "Ola S1 Pro",
                195,
                120,
                "Long range and fast acceleration"
        ));

        bikes.add(new EVBike(
                "TVS iQube",
                145,
                82,
                "Reliable service network and smooth ride"
        ));

        bikes.add(new EVBike(
                "Bajaj Chetak",
                126,
                73,
                "Premium design and strong durability"
        ));

        bikes.add(new EVBike(
                "Hero Vida V1",
                165,
                80,
                "Removable battery and comfortable seating"
        ));

        System.out.println("===== Best EV Bikes in India =====\n");

        for (EVBike bike : bikes) {
            bike.display();
        }
    }
}