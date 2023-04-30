package PageFrame;

import MainPage.HomePage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class AcademicCalendar extends JFrame
{
    private JPanel panel1;
    private JButton previousButton;
    private JButton downloadButton;
    private JLabel label2;
    private JLabel label1;
    private JScrollPane scrollPane;

    public AcademicCalendar() {
        previousButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();
            }
        });

        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    URL imageUrl = new URL("https://drive.google.com/uc?id=19k6o4v_sMU4gg7dvKDEeifoLPw3lOXwo");
                    BufferedImage image = ImageIO.read(imageUrl);
                    File outputImage = new File("F:\\Java_img\\AcademicCalendar.png");
                    ImageIO.write(image, "png", outputImage);
                    String message="Image downloaded successfully!";
                    JOptionPane.showMessageDialog(null, message);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\untitled\\src\\Images\\icon.png");
        setIconImage(icon);

        setTitle("Academic Calendar");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(1060, 600);
        setVisible(true);
    }
}
