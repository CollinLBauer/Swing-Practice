import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class gui {

    private static JPanel buildEntry(String iconPath, String label){
        JPanel entry = new JPanel();

        JLabel entryIcon = new JLabel(new ImageIcon(iconPath));
        JLabel entryLabel = new JLabel(label);

        entry.add(entryIcon);
        entry.add(entryLabel);

        return entry;
    }

    public static void main(String[] args){

        // frame settings
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        // Entry List
        ArrayList<JPanel> entryList = new ArrayList<>();

        // Entry 1
        JPanel entry1 = buildEntry("Construction_icon.png","Construction");
        JButton en1But = new JButton("button");
        entry1.add(en1But);
        entry1.setBorder(new LineBorder(new Color(0,0,0255),6));
        entryList.add(entry1);

        // Entry 2
        JPanel entry2 = buildEntry("Hitpoints_icon.png","Hitpoints");
        entry2.setBorder(new LineBorder(new Color(255,0,0),6));
        entryList.add(entry2);


        // GridLayout for panels to exist within
        GridLayout grid = new GridLayout(entryList.size(),1);
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new LineBorder(new Color(0,255,0),6));
        mainPanel.setLayout(grid);
        for (int i = 0; i < entryList.size(); i++){
            mainPanel.add(entryList.get(i));
        }

        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);

        // draw the frame
        frame.setVisible(true);
    }
}
