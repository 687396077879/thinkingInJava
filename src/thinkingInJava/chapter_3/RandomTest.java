package thinkingInJava.chapter_3;

import java.util.Random;

/**
 * @author jeromecui
 * @description 随机数种子47实验
 * @date 2021/8/14 10:43
 */
public class RandomTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random(47);
            for (int j = 0; j < 10; j++) {
                System.out.print(rand.nextInt(100) + " ");
            }
            System.out.println();
        }
    }
}
/**
* @content tips
* @text 带随机种子的随机方法产生的种子是可预测的随机
*/
