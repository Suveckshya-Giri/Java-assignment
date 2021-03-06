import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class NoLayoutManager {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);
 
        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
 
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
 
        Insets insets = pane.getInsets();
        Dimension size = b1.getPreferredSize();
        b1.setBounds(25 + insets.left, 5 + insets.top,
                     size.width, size.height);
        size = b2.getPreferredSize();
        b2.setBounds(55 + insets.left, 40 + insets.top,
                     size.width, size.height);
        size = b3.getPreferredSize();
        b3.setBounds(150 + insets.left, 15 + insets.top,
                     size.width + 50, size.height + 20);
    }

    public static void main(String[] args) {
        NoLayoutManager mylayout = new NoLayoutManager("My Layout");
    mylayout.setVisible(true);
    }
}
