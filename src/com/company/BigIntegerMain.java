package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Jacek on 2015-12-03.
 */
public class BigIntegerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();
        String secondNumber = scanner.next();

        BigInteger first = new BigInteger(firstNumber);
        BigInteger second = new BigInteger(secondNumber);

        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
    }
}
