package thinkingInJava.chapter_3;

import java.util.Random;
import static thinkingInJava.chapter_6.util.Print.*;

/**
 * @author jeromecui
 * @description
 * @date 2021/8/18 22:56
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is " + (i >= j));
        print("i <= j is " + (i <= j));
        print("i == j is " + (i == j));
        print("i != j is " + (i != j));

//        print("i && j is " + (i && j));
//        print("i || j is " + (i || j));
//        print("!i is " + !i);

        print("(i < 10) && (j < 10)33 is " + ((i < 10) && (j < 10)));
        print("" + ((i < 10) || (j < 10)));
    }
}
