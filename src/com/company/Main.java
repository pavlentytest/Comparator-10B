package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(200,"black"));
        cars.add(new Car(300,"blue"));
        cars.add(new Car(100,"red"));
        cars.add(new Car(400,"yellow"));
        cars.add(new Car(40,"green"));

        Collections.sort(cars,new ComparatorByMaxSpeed());
        for(Car v: cars) {
            System.out.println("Color: "+v.getColor()
                    + ", maxspeed:"+v.getMaxspeed());
        }

        Collections.sort(cars,new ComparatorByColor());
        for(Car v: cars) {
            System.out.println("Color: "+v.getColor()
                    + ", maxspeed:"+v.getMaxspeed());
        }

    }
}
