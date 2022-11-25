package com.example.day1servlet;


/**
 *
 *
 * 继承问题最好的解答
 */

import javafx.concurrent.Worker;

 class Super    {
    public Super(){
        System.out.println("Super");
    }
    public Super(String str){
        System.out.println("SuperString");

    }

}
 class Sub extends Super {
    public Sub(){
        System.out.println("Sub");
    }
    public Sub(int i){
        this();
        System.out.println("Subint");

    }
    public Sub(String str){
//        super(str);
        System.out.println("SubString");
    }
 }


    public class TestSuperSub{
        public static void main(String[] args) {
//            Sub s1 = new Sub();
            Sub s2 = new Sub(10);
//            Sub s3 = new Sub("hello");


        }
    }
