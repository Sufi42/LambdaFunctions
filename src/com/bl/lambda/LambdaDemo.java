package com.bl.lambda;


interface Idemo {
    public void m1();
}

public class LambdaDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Idemo l = () -> {
            System.out.println("LambdaDemo");
        };
        l.m1();

    }

}