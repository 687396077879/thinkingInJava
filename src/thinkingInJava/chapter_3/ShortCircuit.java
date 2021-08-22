package thinkingInJava.chapter_3;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 如何证明短路现象。短路要点，在使用逻辑操作符的时候
 * @date 2021/8/20 21:07
 */
public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        System.out.println(test1(0) && test2(2) && test3(2));
    }
}
