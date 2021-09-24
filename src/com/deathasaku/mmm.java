package com.deathasaku;

import java.io.Serializable;
import java.math.BigDecimal;

public class mmm implements Serializable {

    public static void main(String[] args) {
        mmm a = new mmm();

        System.out.println(((Serializable)  a).toString());
        System.out.println();
        System.out.println("test");




    }
    public  void test(String a,int ...b)
    {
        System.out.println(a);
        throw  new ArithmeticException();


    }
}
