package PageFrame;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import PageFrame.ExamSchedule;

public class IT extends JFrame
{
    private JButton button1;
    private JLabel label1;
    private JScrollPane scrollPane;
    private JPanel panel1;

    public IT() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ExamSchedule frame1 = new ExamSchedule();
            frame1.setVisible(true);
            setVisible(false);
            dispose();
        }
    });
        File pdfFile = new File("E:\\Java Project\\untitled\\src\\PageFrame\\B.Tech (IT).pdf");

        try (PDDocument document = Loader.loadPDF(pdfFile))
        {
            PDFRenderer renderer = new PDFRenderer(document);
            int numPages = document.getNumberOfPages();

            JPanel pagePanel = new JPanel(new GridLayout(numPages, 1));
            for (int i = 0; i < numPages; i++) {
                Image pageImage = renderer.renderImage(i, 1.0f);
                JLabel pageLabel = new JLabel(new ImageIcon(pageImage));
                pagePanel.add(pageLabel);
            }

            scrollPane.setViewportView(pagePanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\untitled\\src\\Images\\icon.png");
        setIconImage(icon);

        setTitle("IT Exam Schedule");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(1060, 600);
        setVisible(true);
    }
}
