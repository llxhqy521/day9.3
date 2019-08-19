package com.unreal.Demo2;

public  class Person {
    private String Name ;
    private  int Age;

    public Person() {
    }

    public Person(String name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }


    }



