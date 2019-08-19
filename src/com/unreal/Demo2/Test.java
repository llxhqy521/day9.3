package com.unreal.Demo2;

public class Test {
    public static void main(String[] args) {

         Person pe = new Person();

        pe.setName("张三");
        pe.setAge(1);
        System.out.println(pe.hashCode());

        Person pe1 = new Person();

        pe.setName("张三");
        pe.setAge(1);
        System.out.println(pe1.hashCode());
        System.out.println(pe.equals(pe1));


    }

    }
