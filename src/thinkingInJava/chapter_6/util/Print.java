package thinkingInJava.chapter_6.util;

import java.util.Date;

public class Print {


    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Date date) {
        System.out.println(date.toString());
    }

    public static void print(boolean b) {
        System.out.println(b);
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print() {
        System.out.println();
    }
}
