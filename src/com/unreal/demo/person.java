package com.unreal.demo;



public abstract class person {
    private  String name;
    private  String sex;
    private  int age;

    public final void eat() { //final后，该方法不能再被子类重写
        System.out.println(name + ",张嘴，咀嚼，吞咽。。下一口。。");
    }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    public abstract void goWC();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
