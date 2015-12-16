package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jacek on 2015-12-03.
 */
public class BigDecimalMain {
    public static void main(String[] args) {

        String[] strings = new String[9];

        strings[0]="-100";
        strings[1]="50";
        strings[2]="0";
        strings[3]="56.6";
        strings[4]="90";
        strings[5]="0.12";
        strings[6]=".12";
        strings[7]="02.34";
        strings[8]="000.000";

        //Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = strings.length;
//        String[] s = new String[n + 2];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.next();
//        }

        //Write your code here
        List<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
        for (int i = 0; i < n; i++) {
            BigDecimal bigDecimal = new BigDecimal(strings[i]);
            System.out.println(bigDecimal);
            bigDecimals.add(bigDecimal);
        }
        Collections.sort(bigDecimals, Collections.reverseOrder());
        Object[] array = bigDecimals.toArray();

        //Output
        for (int i = 0; i < n; i++) {
//            System.out.println(s[i]);
//            System.out.println(array[i]);
        }
    }
}
