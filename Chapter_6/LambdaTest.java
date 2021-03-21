package Chapter_6;


import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] names = new String[] {"wad", "anthony", "blackj", "andy", "andongwin"};
        System.out.println(Arrays.toString(names));
        System.out.println("按照字典排序");
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("按照长度排序");
        Arrays.sort(names, (String first, String second) -> first.length()- second.length()); //first 前面的string 可以省略？？
        System.out.println(Arrays.toString(names));

        //  处理lambda表达式（本身就是闭包），使用了外部的变量  只能使用不可被改变的变量（就是初始化后不会再被改变）
        repeat(9, (i) -> System.out.println("Countdown : " + (9 - i)));
        Timer timer = new Timer(1000, event -> System.out.println("this time is " + new Date()));
        timer.start();
//        方法引用：只调用一个方法而不做其他操作
//                分为三类 obj::instanceMethod  向方法传递参数的表达式
//                       cla::instanceMethod  第一个参数为方法的隐式参数
//                       cla::staticMethod    参数都传递到静态方法中
        Timer timer1 = new Timer(1000, System.out::println);
        timer1.start();

        JOptionPane.showMessageDialog(null, "QUIT PROGRAM?");
        System.exit(0);
    }

    public static void repeat(int n, IntConsumer action){
        for (int i = 0; i < n; i++) action.accept(i);
    }
}

interface IntConsumer {
    void accept(int value);
}
