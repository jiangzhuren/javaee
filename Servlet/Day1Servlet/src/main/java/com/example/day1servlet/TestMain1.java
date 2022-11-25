package com.example.day1servlet;
class MyClass2{
    static int count = 0;
    public MyClass2(){
        count++;
        System.out.println(count);
    }
}
public class TestMain1 {
    public static void main(String[] args) {
        MyClass2 myClass = new MyClass2();
        MyClass2 myClass1 = new MyClass2();
        MyClass2 myClass2 = new MyClass2();

    }

}
