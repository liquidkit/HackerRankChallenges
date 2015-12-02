package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Jacek on 2015-12-01.
 */
public class PatternSyntaxCheckerMain {
    public static void main(String[] args) {
        String[] strings = {
                "([A-Z])(.+)",
                "[AZ[a-z](a-z)",
                "batcatpat(nat"
        };

        Scanner in = new Scanner(System.in);
        int testCases = strings.length; //Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = strings[testCases-1]; //in.nextLine();
            testCases--;

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

        }
    }
}
