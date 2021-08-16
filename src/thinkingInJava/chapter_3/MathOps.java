package thinkingInJava.chapter_3;

import java.util.Random;
import static thinkingInJava.chapter_6.util.Print.*;

/**
 * @author jeromecui
 * @description 展示java的算术操作符和以及简化的 操作加赋值 符号。加减乘除取余，加等 减等 乘等 除等
 * @date 2021/8/14 10:38
 */
public class MathOps {

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;

        //随机获取一个(1-100)的数字
        j = rand.nextInt(100) + 1;
        print("j: " + j);
        k = rand.nextInt(100) + 1;
        print("k: " + k);
        i = j + k;
        print("j + k = " + i);
        i = j - k;
        print("j - k = " + i);
        i = k * j;
        print("k * j = " + i);
        i = k / j;
        print("k / j = " + i);
        i = k % j;
        print("k % j = " + i);
        j %= k;
        print("j %= k, j = " + j);

        float u, v, w;
        v = rand.nextFloat();
        print("v = " + v);
        w = rand.nextFloat();
        print("w = " + w);
        u = v + w;
        print("v + w = " + u);
        u = v - w;
        print("v - w = " + u);
        u = v * w;
        print("v * w = " + u);
        u = v / w;
        print("v / w = " + u);

        //char byte short int long double都可以
        u += v;
        print("u += v = " + u);
        u -= v;
        print("u -= v = " + u);
        u *= v;
        print("u *= v = " + u);
        u /= v;
        print("u /= v = " + u);


    }
}
