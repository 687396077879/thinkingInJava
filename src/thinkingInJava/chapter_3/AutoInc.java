package thinkingInJava.chapter_3;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 展示前缀递增 前缀递减 后缀递增 后缀递减 的区别，记住这是表达式，所以会有值
 * @date 2021/8/18 22:18
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);

        print("++i : " + ++i);
        print("i++ : " + i++);

        print("i : " + i);

        print("--i : " + --i);
        print("i-- : " + i--);

        print("i : " + i);
    }
}
