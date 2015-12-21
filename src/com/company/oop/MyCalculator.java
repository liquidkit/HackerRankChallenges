package com.company.oop;

/**
 * Created by Jacek on 2015-12-21.
 */
public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int divisor = n % i;
            if (divisor == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
