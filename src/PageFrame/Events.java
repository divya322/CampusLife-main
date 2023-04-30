package PageFrame;

import MainPage.HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends JFrame
{
    private JLabel label1;
    private JButton previousButton;
    private JLabel label2;
    private JPanel panel1;
    private JScrollPane scrollpane;
    private JLabel label5;
    private JLabel label4;
    private JLabel label3;

    public Events()
    {
        previousButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                HomePage homePage = new MainPage.HomePage(); // create an instance of your home page class
                homePage.setVisible(true); // show the home page
                dispose();
            }
        });
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\untitled\\src\\Images\\icon.png");
        setIconImage(icon);
        label3.setIcon(new ImageIcon(new javax.swing.ImageIcon("E:\\Java Project\\untitled\\src\\Images\\e1.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        label4.setIcon(new ImageIcon(new javax.swing.ImageIcon("E:\\Java Project\\untitled\\src\\Images\\e2.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        label5.setIcon(new ImageIcon(new javax.swing.ImageIcon("E:\\Java Project\\untitled\\src\\Images\\e3.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));

        setTitle("Events");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1060, 600);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Events event = new Events();
    }

}
