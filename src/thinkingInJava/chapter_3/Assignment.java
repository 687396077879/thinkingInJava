package thinkingInJava.chapter_3;

import static thinkingInJava.chapter_6.util.Print.*;


/**
 * @author jeromecui
 * @description
 * @date 2021/8/12 19:22
 */
class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
    }
}
/**
* @content tips
* @text 对象赋值和基本类型赋值的区别。在更改t1的时候t2也相应改变了。别名就像我和我的朋友共用一个游戏账号，我们共用游戏中的所有装备。
*/