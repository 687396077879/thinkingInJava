package thinkingInJava.chapter_3;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 使用equals来比较对象内部内容是否相等，这个返回的是true
 * @date 2021/8/18 22:31
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(1);
        Integer n2 = new Integer(1);

        print(n1.equals(n2));
    }
}
