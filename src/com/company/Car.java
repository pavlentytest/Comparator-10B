package com.company;

import java.util.Comparator;

public class Car {
    private int maxspeed;
    private String color;
    Car() {

    }
    Car(int m, String c) {
        this.maxspeed = m;
        this.color = c;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public String getColor() {
        return color;
    }
}
class ComparatorByMaxSpeed implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getMaxspeed() == o2.getMaxspeed()) {
            return 0;
        }else if(o1.getMaxspeed()>o2.getMaxspeed()) {
            return -1;
        } else {
            return 1;
        }
    }
}
class ComparatorByColor implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}

