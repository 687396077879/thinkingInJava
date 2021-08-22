package thinkingInJava.chapter_5;

/**
 * @author jeromecui
 * @description 构造器使用方法
 * @date 2021/8/21 22:27
 */
class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}
