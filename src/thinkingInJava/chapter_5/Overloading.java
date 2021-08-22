package thinkingInJava.chapter_5;

import static thinkingInJava.chapter_6.util.Print.*;

/**
 * @author jeromecui
 * @description 显示构造器重载和方法重载
 * @date 2021/8/21 22:42
 */
class Tree {
    int height;
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    void info() {
        print("Tree is " + height + " feet tall");
    }
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }

        new Tree();
    }
}
