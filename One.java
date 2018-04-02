package JavaBeginer;

import javax.swing.*;

public class One {
    public static void main(String[] args) {
        JFrame frame = new JFrame("project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JavaBeginer.Graph a = new JavaBeginer.Graph();
        frame.add(a);
        frame.setSize(600, 400);
        frame.setVisible(true);


    }
}
