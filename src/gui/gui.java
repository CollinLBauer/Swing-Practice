package gui;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;


public class gui {

    public static void main(String[] args){
        // frame settings
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setBackground(new Color(100,100,125));
        frame.setResizable(true);

        // Panel for tab buttons
        JPanel tabPanel = new JPanel();
        tabPanel.setLayout(new BoxLayout(tabPanel,BoxLayout.X_AXIS));
        tabPanel.setBorder(new LineBorder(new Color(255,255,255,0),8));

        // Tab buttons
        Button[] buttons = new Button[]{
            new Button("1"),
            new Button("2"),
            new Button("3")
        };
        for (Button button:buttons){
            button.setPreferredSize(new Dimension(64,64));
            button.setMaximumSize(new Dimension(64,64));
            tabPanel.add(button);
        }

        // Panel for entries
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        mainPanel.setBorder(new LineBorder(new Color(0,0,0),8));

        // Entries
        ArrayList<JPanel> entryList = new ArrayList<>();
        for (EntryData entry:EntryData.ENTRIES){
            entryList.add(new Entry(entry.ICON_PATH,entry.TITLE,entry.DESCRIPTION));
        }
        entryList.get(0).setBorder(new LineBorder(new Color(255,0,0),6));
        entryList.get(1).setBorder(new LineBorder(new Color(0,255,0),6));
        entryList.get(2).setBorder(new LineBorder(new Color(0,0,255),6));
        for (int i = 0; i < entryList.size(); i++){
            mainPanel.add(entryList.get(i));
        }

        // add everything to the frame
        frame.getContentPane().add(BorderLayout.NORTH,tabPanel);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);

        // draw the frame
        frame.setVisible(true);
    }
}
