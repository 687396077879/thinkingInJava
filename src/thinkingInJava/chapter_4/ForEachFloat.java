package thinkingInJava.chapter_4;

import java.util.Random;

/**
 * @author jeromecui
 * @description foreach是一种更加简洁的语言，用于数组和容器。不必创建变量，foreach会自动产生每一项
 * @date 2021/8/20 22:29
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float x : f)
            System.out.println(x);
    }
}
