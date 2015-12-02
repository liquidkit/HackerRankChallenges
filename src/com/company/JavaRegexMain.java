package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jacek on 2015-12-02.
 */
public class JavaRegexMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

//        strings.add("000.12.12.034");
//        strings.add("121.234.12.12");
//        strings.add("23.45.12.56");
//        strings.add("00.12.123.123123.123");
//        strings.add("122.23");
//        strings.add("Hello.IP");

        fillStringsWithIPs(strings);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String IP = iterator.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }

    static class myRegex {
        public String pattern =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
//                "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
    }

    private static void fillStringsWithIPs(List<String> ips) {
        ips.add("12.12.12.12");
        ips.add("13.13.13.112");
        ips.add("VUUT.12.12");
        ips.add("111.111.11.111");
        ips.add("1.1.1.1.1.1.1");
        ips.add(".....");
        ips.add("1...1..1..1");
        ips.add("0.0.0.0");
        ips.add("255.0 .255 .0");
        ips.add("266.266 .266 .266");
        ips.add("00000.000000.0000000.00001");
        ips.add("0023.0012.0012.0034");
    }
}
