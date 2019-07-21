package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame implements ActionListener {

    public TestFrame(String title){
        super(title);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        debugMessage(" action performed");
    }

    private void debugMessage(String message){
        System.out.println("Debug: " + message);
    }

    public static void main(String[] args){
        System.out.println("Testing TestFrame()...");

        TestFrame frame = new TestFrame("hello");
        frame.setSize(800,600);

        frame.setVisible(true);

    }

}
