import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EmployeeFeedbackForm extends JFrame implements ActionListener, WindowListener, MouseListener, KeyListener {
    // Components
    private JLabel nameLabel, feedbackLabel;
    private JTextField nameField;
    private JTextArea feedbackArea;
    private JCheckBox anonymousCheckbox;
    private JRadioButton positiveRadioButton, negativeRadioButton;
    private ButtonGroup radioButtonGroup;
    private JList<String> departmentList;
    private DefaultListModel<String> listModel;
    private JButton submitButton;

    public EmployeeFeedbackForm() {
        // Initialize components
        nameLabel = new JLabel("Name:");
        feedbackLabel = new JLabel("Feedback:");
        nameField = new JTextField(20);
        feedbackArea = new JTextArea(5, 20);
        anonymousCheckbox = new JCheckBox("Submit Anonymously");
        positiveRadioButton = new JRadioButton("Positive");
        negativeRadioButton = new JRadioButton("Negative");
        radioButtonGroup = new ButtonGroup();
        departmentList = new JList<>();
        listModel = new DefaultListModel<>();
        submitButton = new JButton("Submit");

        // Add components to radio button group
        radioButtonGroup.add(positiveRadioButton);
        radioButtonGroup.add(negativeRadioButton);

        // Add action listener to the "Submit" button
        submitButton.addActionListener(this);

        // Add window listener
        addWindowListener(this);

        // Add mouse listener to the text area
        feedbackArea.addMouseListener(this);

        // Add keyboard listener to the name field
        nameField.addKeyListener(this);

        // Set up the department list
        listModel.addElement("Human Resources");
        listModel.addElement("Finance");
        listModel.addElement("IT");
        listModel.addElement("Sales");
        listModel.addElement("Marketing");
        departmentList.setModel(listModel);

        // Set layout and add components
        setLayout(new GridLayout(7, 2));
        add(nameLabel);
        add(nameField);
        add(feedbackLabel);
        add(feedbackArea);
        add(anonymousCheckbox);
        add(new JLabel()); // Empty label for spacing
        add(positiveRadioButton);
        add(negativeRadioButton);
        add(new JLabel()); // Empty label for spacing
        add(new JScrollPane(departmentList));
        add(new JLabel()); // Empty label for spacing
        add(submitButton);

        // Set properties
        setTitle("Employee Feedback Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get the selected department from the list
            String selectedDepartment = departmentList.getSelectedValue();

            // Get the name, feedback, and other feedback details
            String name = nameField.getText();
            String feedback = feedbackArea.getText();
            boolean isAnonymous = anonymousCheckbox.isSelected();
            String feedbackType = positiveRadioButton.isSelected() ? "Positive" : "Negative";

            // Print the feedback details
            System.out.println("Name: " + (isAnonymous ? "Anonymous" : name));
            System.out.println("Feedback: " + feedback);
            System.out.println("Department: " + selectedDepartment);
            System.out.println("Feedback Type: " + feedbackType);
        }
    }

    // Implement window listener methods
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.out.println("Feedback form is closing.");
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    // Implement mouse listener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked in the feedback area.");
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // Implement keyboard listener methods
    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed in the name field: " + e.getKeyChar());
    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeFeedbackForm());
    }
}

