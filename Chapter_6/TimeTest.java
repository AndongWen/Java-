package Chapter_6;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimeTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(1000000, listener);

        JOptionPane.showMessageDialog(null, "quit program ?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event){
        System.out.println("At this time, time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
