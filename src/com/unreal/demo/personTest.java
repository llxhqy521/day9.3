package com.unreal.demo;

public class personTest {
    public static void main(String[] args) {
        person p1 = new Man(); //向上转型
        p1.setName("王二狗");
        p1.setAge(28);
        System.out.println(p1);
        p1.eat();
        p1.goWC();
        if (p1 instanceof Man){
            Man m = (Man)p1;
            m.somking();
        }

        Woman w1 = new Woman();
        w1.setName("林翠花");
        w1.setAge(18);
        System.out.println(w1.toString());
        w1.eat();
        w1.goWC();
        w1.shopping();
    }
}
