package thinkingInJava.chapter_4;

import java.util.Random;
import static thinkingInJava.chapter_6.util.Print.*;
/**
 * @author jeromecui
 * @description 随机生成字母判断是元音还是辅音。switch结构有两个需要注意的地方，第一个是switch()中一定要是一个
 * 整型值，第二是如果某个case匹配到了，但是该case后没有break，那么程序就会执行所有下面所有语句，直到遇到一个break或default
 * @date 2021/8/21 21:54
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            print((char)c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("vowel");
                    break;
                case 'y':
                case 'w':
                    print("Sometimes a vowel");
                    break;
                default: print("consonant");
            }
        }
    }
}
