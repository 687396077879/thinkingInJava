package thinkingInJava.chapter_5;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 区分重载方法.
 * @date 2021/8/21 22:50
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
