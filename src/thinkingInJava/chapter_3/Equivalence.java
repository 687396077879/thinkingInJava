package thinkingInJava.chapter_3;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 测试对象的等价性。从这一点上看包装类和普通类没有什么区别
 * @date 2021/8/18 22:27
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(1);
        Integer n2 = new Integer(1);
        print(n1 == n2);
        print(n1 != n2);
    }
}
