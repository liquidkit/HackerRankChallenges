package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jacek on 2015-12-01.
 */
public class StringTokenMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        String s = "He is a very very good boy, isn't he?";
        String regex1 = "[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while (matcher.find()) {
            strings.add(matcher.group());
            count++;
        }

        System.out.println(count);
        for (String s1 : strings) {
            System.out.println(s1);
        }
    }
}
