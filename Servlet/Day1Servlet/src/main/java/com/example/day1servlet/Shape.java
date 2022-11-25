package com.example.day1servlet;

public abstract class Shape {
    abstract double mianji();
    Shape(){
        System.out.println("抽象类被调用了");
    }
    void ceshi(){
        System.out.println("抽象类的测试方法被调用了");
    }
}
class Circle extends Shape{


    @Override
    double mianji() {
        return 10.0;
    }
}
class Rectangle extends Shape{

    @Override
    double mianji() {
        return 11.0;
    }
}
class mian{
public static void main (String args[]){
    Circle circle = new Circle();
    double mianji = circle.mianji();
    System.out.println(mianji);
    Rectangle rectangle = new Rectangle();
    double mianji1 = rectangle.mianji();
    System.out.println(mianji1);
    circle.ceshi();
    rectangle.ceshi();
    Shape shape = new Shape() {
        @Override
        double mianji() {
            return 0;
        }
    };


}
}
