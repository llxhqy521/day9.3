package com.unreal.Demo3;

public class square extends Shape {
    @Override
    public void area() {
        int a=1;
        int b=2;
        int  l=2*(a+b);
        System.out.println("正方形的周长是"+l);
    }

    @Override
    public void perimeter() {
        int a=1;
        int b=2;
        int  s=a*b;
        System.out.println("正方形的周长是"+s);
    }
}
