package com.sgedts.tmt.course;

public interface Polygon {

    public void getArea(int length, int breadth);
    public default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
