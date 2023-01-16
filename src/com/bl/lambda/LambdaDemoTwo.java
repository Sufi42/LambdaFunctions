package com.bl.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemoTwo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List l1 = new ArrayList();
        l1.add("Hi");
        l1.add("Hello");
        l1.add("This");
        l1.add("That");

        l1.forEach((n -> System.out.println(n)));
    }
}
