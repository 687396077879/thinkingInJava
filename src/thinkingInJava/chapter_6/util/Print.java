package thinkingInJava.chapter_6.util;

import java.util.Date;

public class Print {


    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Date date) {
        System.out.println(date.toString());
    }
}
