import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ComponentEvent;

public class MyFrame extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextField isbnField;
    private JTextField publisherField;

    public MyFrame() {
        initFrame();
        initFields();


        JButton addButton = new JButton("Add");
        JButton searchButton = new JButton("Search");
        JButton deleteButton = new JButton("Delete");


        //Labels
        JLabel titleLabel = new JLabel("Title: ");
        JLabel authorLabel = new JLabel("Author(s): ");
        JLabel isbnLabel = new JLabel("ISBN: ");
        JLabel publisherLabel = new JLabel("Publisher: ");


        // Create a panel to hold the components
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        constraint.gridwidth = GridBagConstraints.REMAINDER;

        JPanel lineOnePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lineOnePanel.add(titleLabel);
        lineOnePanel.add(titleField);
        //lineOnePanel.setBorder(BorderFactory.createLineBorder(Color.red));

        JPanel lineTwoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lineTwoPanel.add(authorLabel);
        lineTwoPanel.add(authorField);
        //lineTwoPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel lineThreePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lineThreePanel.add(isbnLabel);
        lineThreePanel.add(isbnField);
        //lineThreePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel lineFourPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lineFourPanel.add(publisherLabel);
        lineFourPanel.add(publisherField);
        //lineThreePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel lineFivePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lineFivePanel.add(searchButton);
        lineFivePanel.add(addButton);
        lineFivePanel.add(deleteButton);

        mainPanel.add(lineOnePanel, constraint);
        mainPanel.add(lineTwoPanel, constraint);
        mainPanel.add(lineThreePanel, constraint);
        mainPanel.add(lineFourPanel, constraint);
        mainPanel.add(lineFivePanel, constraint);

        // Add the main panel to the frame
        add(mainPanel, BorderLayout.NORTH);


        // Set action listener for the submit button
        searchButton.addActionListener(e -> {
            String inputText = titleField.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + inputText);
        });

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Make the JFrame visible
        setVisible(true);
    }


    /*
    Method to initialize the format of the frame
    Setting title, frame size and font
     */
    public void initFrame() {
        setTitle("Test Library");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initFields() {
        titleField = new JTextField(50);
        authorField = new JTextField(50);
        isbnField = new JTextField(30);
        publisherField = new JTextField(50);
    }
}