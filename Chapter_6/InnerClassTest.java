package Chapter_6;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "quit program ?");
        System.exit(4);
    }
}

class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
//        局部内部类 申明时不能有访问说明符 作用域被限定符在这个块中
        class TimePinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the time, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep(); // 访问了外部的beep变量
            }
        }

        TimePinter listener = new TimePinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }
}
