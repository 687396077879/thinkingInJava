package thinkingInJava.chapter_3;

/**
 * @author jeromecui
 * @description 将一个对象传递给方法时，也会出现别名现象
 * @date 2021/8/14 10:19
 */
class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c " + x.c);
        f(x);
        System.out.println("2: x.c " + x.c);
    }

}
