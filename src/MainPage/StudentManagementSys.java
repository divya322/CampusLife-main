package MainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.io.FileWriter;

public class StudentManagementSys extends JFrame {

    private JLabel signUpLabel, user_name, password, rollNo,
            emailAddress, contactNumber, stuAddress, stuName,
            genderOptions, stuStream, nationality, stuStatus,
            signUpLabel3, signUpLabel5;

    private JTextField tf1, tf2, tf3,
            tf4, tf5, tf6,
            tf9, tf10;

    private JTextArea area2, area1;

    private JRadioButton rb3,
            rb4, rb5, rb6,
            rb7;

    JButton prevButton;
    private JFileChooser f1;
    private JPanel panesignUpLabel;

    StudentManagementSys() {
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\Akshay-java\\src\\Images\\icon.png");
        setIconImage(icon);
        prevButton = new JButton();
        prevButton.setText("←");
        prevButton.setFont(new Font("Book Antiqua",1,20));
        prevButton.setBounds(50,30,90,25);

        signUpLabel = new JLabel("Sign Up");
        signUpLabel.setFont(new java.awt.Font("Book Antiqua",1,20));
        signUpLabel.setBounds(600, 30, 250, 20);

        stuName = new JLabel(
                "Name of the Student:");
        stuName.setBounds(50, 80, 250, 20);

        tf6 = new JTextField();
        tf6.setBounds(250, 80, 250, 20);

        user_name = new JLabel(
                "Enter your username: ");
        user_name.setBounds(50, 120, 250, 20);

        tf1 = new JTextField();
        tf1.setBounds(250, 120, 250, 20);
        tf1.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input)
            {
                String text = ((JTextField) input).getText();
                return text.matches("^[a-zA-Z]{5,20}$");
            }
        });


        password = new JLabel(
                "Enter your password:");
        password.setBounds(50, 160, 250, 20);

        tf2 = new JTextField();
        tf2.setBounds(250, 160, 250, 20);

        rollNo = new JLabel("Roll Number:");
        rollNo.setBounds(50, 210, 250, 20);

        tf3 = new JTextField();
        tf3.setBounds(250, 210, 250, 20);

        emailAddress = new JLabel("Email ID:");
        emailAddress.setBounds(50, 260, 250, 20);

        tf4 = new JTextField();
        tf4.setBounds(250, 260, 250, 20);

        contactNumber = new JLabel("Contact Number:");
        contactNumber.setBounds(50, 310, 250, 20);

        tf5 = new JTextField();
        tf5.setBounds(250, 310, 250, 20);

        stuAddress = new JLabel("Address:");
        stuAddress.setBounds(50, 360, 250, 20);

        area1 = new JTextArea();
        area1.setBounds(250, 360, 250, 90);

        genderOptions = new JLabel("Gender:");
        genderOptions.setBounds(50, 485, 250, 20);

        JRadioButton r5
                = new JRadioButton(" Male");
        JRadioButton r6
                = new JRadioButton(" Female");

        r5.setBounds(250, 480, 100, 30);
        r6.setBounds(350, 480, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);

        nationality = new JLabel(
                "Nationality");
        nationality.setBounds(50, 530, 250, 20);

        String language[]
                = { "Select", "Indian", "International" };

        final JComboBox langBox
                = new JComboBox(language);

        langBox.setBounds(250, 530, 90, 20);


        String nation = (String) langBox.getSelectedItem();

        //JFrame frame = new JFrame();
        ImageIcon i2 = new ImageIcon("resources/siu logo new1.png");
        JLabel signUpLabel5
                = new JLabel("", i2, JLabel.CENTER);
        signUpLabel5.setBounds(530, 500, 200, 200);
        //frame.add(signUpLabel5);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        //frame.setVisible(true);

        ButtonGroup bg1 = new ButtonGroup();
        stuStatus = new JLabel(
                "Student Status: ");
        stuStatus.setBounds(750, 85, 250, 20);

        rb3 = new JRadioButton("Hosteller");
        rb3.setBounds(850, 80, 100, 30);

        rb4 = new JRadioButton("Day Scholar");
        rb4.setBounds(950, 80, 120, 30);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        stuStream = new JLabel(
                "Stream: ");
        stuStream.setBounds(750, 130, 250, 20);

        String languages[]
                = { "Select", "CSE", "AIML", "EnTC", "RnA",
                "CIVIL", "MECH" };
        final JComboBox cb
                = new JComboBox(languages);
        cb.setBounds(830, 130, 90, 20);
        String stream = (String) cb.getSelectedItem();

        final JLabel label = new JLabel();
        label.setBounds(800, 360, 500, 30);
//        label.setText("Selected stream: " + stream);

        JButton Submit
                = new JButton("Submit Details");
        Submit.setBounds(750, 180, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(900, 180, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(1050, 180, 150, 30);

        area2 = new JTextArea();
        area2.setBounds(750, 230, 450, 240);

        add(signUpLabel);
        add(user_name);
        add(password);
        add(rollNo);
        add(emailAddress);
        add(contactNumber);
        add(stuAddress);
        add(stuName);
        add(genderOptions);
        add(stuStream);
        add(nationality);
        add(stuStatus);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(area1);
        add(area2);
        add(signUpLabel5);
        add(rb3);
        add(rb4);
        add(r5);
        add(r6);
        add(cb);
        add(langBox);
        //add(cb2);
        add(label);
        add(Submit);
        add(b2);
        add(Print);
        add(prevButton);

//        langBox.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {
//
//            }
//        });
//
//        cb.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        // Reset the text fields
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        area2.setText("");
                        area1.setText(" ");
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText("");
                    }
                });


        // Implementing the Print action
        Print.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        try {
                            area2.print();
                        }
                        catch (java.awt.print
                                       .PrinterException a) {
                            System.err.format(
                                    "NoPrinter Found",
                                    a.getMessage());
                        }
                    }
                });

        prevButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginPage = new LoginForm(); // create an instance of your home page class
                loginPage.setVisible(true);
                dispose();
            }
        });

        Submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int flag = 0;
                String prn = tf3.getText();
                String password = tf2.getText();
                String email = tf4.getText();
                String contactNumber = tf5.getText();
                if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please fill in all the fields");
                    flag = 1;
                }
                if (!email.matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,4}$")) {
                    JOptionPane.showMessageDialog(null, "Please ensure you have entered a valid email address");
                    flag = 1;
                }
                if (prn.length() != 11 || !prn.matches("\\d+"))
                {
                    JOptionPane.showMessageDialog(area2, "Invalid PRN length");
                    flag = 1;
                }
                if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$")) {
                    JOptionPane.showMessageDialog(null, "Please ensure password has least 8 digits and at least one uppercase letter, one lowercase letter, one digit, and one special character ");
                    flag = 1;
                }
                if (!contactNumber.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(area2, "Invalid PRN length");
                    flag = 1;
                }
                if (flag == 0){
                    area2.setText(
                            "--------------------------------"
                                    + "-----------Final List----"
                                    + "--------------------------"
                                    + "--------------------------"
                                    + "-------------------\n");

                    area2.setText(area2.getText()
                            + "Student Name: "
                            + tf1.getText()
                            + "\n");
//                    area2.setText(area2.getText()
//                            + "Father's Name: "
//                            + tf2.getText()
//                            + "\n");
                    area2.setText(area2.getText()
                            + "RollNumber:"
                            + tf3.getText()
                            + "\n");
                    area2.setText(area2.getText()
                            + "Email ID:"
                            + tf4.getText()
                            + "\n");
                    area2.setText(area2.getText()
                            + "Contact Number:"
                            + tf5.getText()
                            + "\n");
                    area2.setText(area2.getText()
                            + "Stream: "
                            + cb.getSelectedItem().toString()
                            + "\nSymbiosis Institute of Technology, Pune"
                            + "\n");

                    if (e.getSource() == Submit) {
                        try (FileWriter fw = new FileWriter("java.txt", true)) {
                            fw.write(area2.getText());
                        } catch (Exception ae) {
                            System.out.println(ae);
                        }
                        String stream = (String) cb.getSelectedItem();
                        String nation = (String) langBox.getSelectedItem();
                        String gender = "";
                        if (r5.isSelected()) {
                            gender = "Male";
                        }
                        if (r6.isSelected()) {
                            gender = "Female";
                        }
                        Database db = new Database();
                        db.insertStudent(tf3.getText(),tf1.getText(),tf2.getText(), tf6.getText(),tf4.getText(), tf5.getText(), gender, nation, stream);
                    }
                    JOptionPane.showMessageDialog(
                            area2, "DATA SAVED SUCCESSFULLY");
                }
                else{

                }
            }
        });

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we)
                    {
                        System.exit(0);
                    }
                });
        setSize(1300, 600);
        setLayout(null);
        setVisible(true);
        setBackground(Color.CYAN);
        area2.setEditable(false); // Made the text field read-only
    }
    public static void main(String[] args)
    {
        new StudentManagementSys();
    }
}