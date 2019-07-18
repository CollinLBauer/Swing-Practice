package gui;

import javax.swing.*;
import java.awt.*;

public class Entry extends JPanel{

    private JLabel icon;
    private JLabel title;
    private JPanel details;
    private final int WIDTH = 500;
    private final int HEIGHT = 100;


    public Entry(String iconPath, String title, String[] details){
        super();
        super.setLayout(new GridLayout(2,1));
        super.setMaximumSize(new Dimension(WIDTH,HEIGHT));

        // label
        JPanel label = new JPanel();
        label.setLayout(new GridLayout(1,2));
        icon = new JLabel(new ImageIcon(iconPath));
        this.title = new JLabel(title);

        //details
        this.details = buildDetails(details);

        super.add(this.title);
        super.add(this.details);
    }


    private JPanel buildDetails(String[] details){
        JPanel detailPanel = new JPanel();
        detailPanel.setLayout(new BoxLayout(detailPanel,BoxLayout.Y_AXIS));

        // temporary implementation
        for (String detail:details){
            detailPanel.add(new JLabel(detail));
        }

        return detailPanel;
    }

}
