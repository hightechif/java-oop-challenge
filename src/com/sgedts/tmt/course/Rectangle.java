package com.sgedts.tmt.course;

public class Rectangle implements Polygon {
    private int area;

    @Override
    public void getArea(int length, int breadth) {
        area = length * breadth;
        System.out.println("The area of the rectangle is "+area);
    }
}
