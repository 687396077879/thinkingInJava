package thinkingInJava.chapter_4;

/**
 * @author jeromecui
 * @description foreach 对数组进行遍历 。foreach就是省略了一些细节，这些细节对于代码流程是不重要的
 * @date 2021/8/20 22:57
 */
public class ForEachString {
    public static void main(String[] args) {
        for (char c : "Get some memories".toCharArray())
            System.out.print(c + " ");
    }
}
/**
* @content tips
* @text 学习方法：抓重点，抽象，记忆
*/
