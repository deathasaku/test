package com.deathasaku;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class mmm implements Serializable {

    public static void test(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        mmm a = new mmm();
        mmm.test(10);
        List<String> tmp = new ArrayList<>();

        tmp.add("123");
        for (String str : tmp
        ) {
            System.out.println(str);

        }
        a.testVarArgs(1,4,5,6,7);



        System.out.println(((Serializable) a).toString());
        System.out.println("QQPR");
        System.out.println("test");


    }

    public void test(String a, int... b) {
        System.out.println(a);
        test(10);
        throw new ArithmeticException();


    }
    public  void testVarArgs(int... b)
    {
        for (int i:b
             ) {
            System.out.println(i);

        }

    }
}
