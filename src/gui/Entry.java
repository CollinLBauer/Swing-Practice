package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Entry extends JPanel{

    private float TITLE_SIZE = 16;
    private float DESCRIPTION_SIZE = 14;

    private String[] details;
    private final int WIDTH = 500;
    private final int HEIGHT = 100;


    public Entry(String iconPath, String titleString, String[] details){
        super();
        super.setLayout(new GridLayout(2,1));
        super.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        super.setAlignmentX(0);

        // title
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel,BoxLayout.X_AXIS));
        titlePanel.setBorder(new EmptyBorder(0,10,0,0));
        JLabel title = new JLabel(titleString,new ImageIcon(iconPath),JLabel.RIGHT);
        title.setFont(title.getFont().deriveFont(TITLE_SIZE));
        title.setIconTextGap(10);
        titlePanel.add(title);

        //details
        JPanel detailPanel = buildDetails(details);

        super.add(titlePanel);
        super.add(detailPanel);
    }


    private JPanel buildDetails(String[] details){
        JPanel detailPanel = new JPanel();
        detailPanel.setLayout(new BoxLayout(detailPanel,BoxLayout.Y_AXIS));
        detailPanel.setBorder(new LineBorder(new Color(100,100,0),2));

        // temporary implementation
        for (String detail:details){
            JLabel temp = new JLabel(detail);
            temp.setFont(temp.getFont().deriveFont(DESCRIPTION_SIZE));
            detailPanel.add(temp);
        }

        return detailPanel;
    }

}
