import javax.swing.JFrame;
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        // Set the title of the JFrame
        setTitle("Test Library");

        // Set the size of the JFrame
        setSize(500, 400);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        setVisible(true);
    }
}