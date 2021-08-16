package thinkingInJava.chapter_3;

/**
 * @author jeromecui
 * @description
 * @date 2021/8/12 19:06
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a + " b = " + b);
    }
}
/**
* @content tips
* @text 证明这是括号使用的结果
*/
