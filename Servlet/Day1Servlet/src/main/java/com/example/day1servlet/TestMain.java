package com.example.day1servlet;


 class MyClass{
    static  int a;
    int b;
}
public class TestMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();
        myClass.a = 100;
        myClass.b = 200;
        myClass1.a = 300;
        myClass1.b = 400;
        System.out.println(myClass.a);
        System.out.println(myClass.b);
        System.out.println(myClass1.a);
        System.out.println(myClass1.b);
    }
}
