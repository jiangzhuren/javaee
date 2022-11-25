package com.example.day1servlet;


class Super1{
     Super1(){
        System.out.println("super构造方法");
    }
     void m1(){
        System.out.println("m1() in Super");
    }
     void m2(){
        System.out.println("m2() in Super");
    }
}
class Sub1 extends Super1{

    void m1(){
        System.out.println("m1() in Sub");

    }
    void m2(){
        System.out.println("m2() in Sub");
    }
}


public class TestSuperSub1 {
    public static void main(String[] args) {
        Sub1 sub;
        sub = new Sub1();
        sub.m1();
        sub.m2();

        System.out.println("***************************以下为多态*************************");
        Super1 super1 = new Sub1();
        super1.m1();
        super1.m2();






    }
}
