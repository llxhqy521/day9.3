package com.unreal.Demo3;

public class Circle extends Shape {

    @Override
    public void area() {
        int r = 3;
        double s;
        s=3.14*r*r;
        System.out.println("圆的面积是"+s);
    }

    @Override
    public void perimeter() {
        int r=3 ;
        double l;
        l=3.14*2*r;
        System.out.println("圆的周长是"+l);


    }
}
