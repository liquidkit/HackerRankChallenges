package com.company.oop;

/**
 * Created by Jacek on 2015-12-21.
 */
public class AdvancedArithmeticMain {
    public static void main(String[] args) {
        AdvancedArithmetic aa = new MyCalculator();
        int divisorSum = aa.divisorSum(6);
        System.out.println(divisorSum);
    }
}
