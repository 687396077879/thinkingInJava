package thinkingInJava.chapter_4;

import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description if-else的例子
 * @date 2021/8/20 22:08
 */
public class IfElse {
    static int result = 0;
    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }
}
