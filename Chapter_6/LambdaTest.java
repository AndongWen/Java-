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

        Timer timer = new Timer(1000, event -> System.out.println("this time is " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "QUIT PROGARAM?");
        System.exit(0);
    }
}
