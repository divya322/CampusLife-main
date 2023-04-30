package PageFrame;

import MainPage.HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamSchedule extends JFrame
{
    private JPanel panel1;
    private JButton previousButton;
    private JLabel label1;
    private JButton CSEButton;
    private JButton ITButton;
    private JButton AIMLButton;
    private JPanel panel2;
    private JPanel panel3;

    public ExamSchedule()
   {
       previousButton.addActionListener(new ActionListener()
       {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 HomePage homePage = new MainPage.HomePage();
                homePage.setVisible(true);
                dispose();
            }
       });

       CSEButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               CSE frame1 = new CSE();
               frame1.setVisible(true);
               setVisible(false);
               dispose();
           }
       });

       ITButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               IT frame1 = new IT();
               frame1.setVisible(true);
               setVisible(false);
               dispose();
           }
       });

       AIMLButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               AIML frame1 = new AIML();
               frame1.setVisible(true);
               setVisible(false);
               dispose();
           }
       });

       Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\untitled\\src\\Images\\icon.png");
       setIconImage(icon);

       JLabel messageBox = new JLabel("<html>Exam Schedule for the Even Semester is declared.<br/>Click on the button of department to view the exam schedule of that department.</html>");
       messageBox.setFont(new java.awt.Font("Book Antiqua", 1, 20));
       panel3.add(messageBox);

       setTitle("Exam Schedule");
       setContentPane(panel1);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();

       setSize(1060, 600);
       setVisible(true);
   }
}
