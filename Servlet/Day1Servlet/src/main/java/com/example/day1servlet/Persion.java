package com.example.day1servlet;

public class Persion {
    String name;
    String gener;
    int age;
    String address;
    String edu;

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", gener='" + gener + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", edu='" + edu + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }
}
