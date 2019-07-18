import javax.swing.*;
import java.awt.*;

public class Entry extends JPanel{

    private JLabel icon;
    private JLabel title;
    private JPanel details;
    private final int WIDTH;
    private final int HEIGHT;

    public Entry(String iconPath, String title, String details, int width, int height){
        WIDTH = width;
        HEIGHT = height;

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(2,1);

        // label
        JPanel label = new JPanel();
        icon = new JLabel(new ImageIcon(iconPath));
        this.title = new JLabel(title);

        //details
        this.details = buildDetails(details);
    }

    private static JPanel buildDetails(String details){
        //TODO
        JPanel entry = new JPanel();

        return entry;
    }

}
