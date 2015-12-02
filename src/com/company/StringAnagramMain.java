package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramMain {

    static boolean isAnagram(String stringA, String stringB) {

        char[] charsA = stringA.toLowerCase().toCharArray();
        char[] charsB = stringB.toLowerCase().toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        return Arrays.equals(charsA, charsB);

//        boolean[] results = new boolean[charsA.length];
//
//        for (int i = 0; i < charsA.length; i++) {
//            for (int j = 0; j < charsB.length; j++) {
//                if (charsA[j] != ' ') {
//                    if (Character.toUpperCase(charsA[i]) !=
//                            Character.toUpperCase(charsB[j])) {
//                        results[j] = true;
//                        charsA[i] = ' ';
//                        charsA[j] = ' ';

//                        return false;
//                    }
//                }
//            }
//        }

//        for (int i = 0; i < results.length; i++) {
//            if (results[i] == false) {
//                return false;
//            }
//        }

//        return true;
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        String A = "anagram";
        String B = "margana";
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
