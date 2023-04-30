package PageFrame;

import MainPage.HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

public class Maps extends JFrame
{
    private JButton previousButton;
    private JPanel panel1;
    private JPanel panel2;
    private JButton streetViewButton;
    private JLabel label1;

    public Maps()
    {
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);

        JXMapViewer jxMapViewer = new JXMapViewer();
        jxMapViewer.setTileFactory(tileFactory);
        GeoPosition geoPosition = new GeoPosition(18.541567657946775, 73.7278644263005);
        jxMapViewer.setAddressLocation(geoPosition);
        jxMapViewer.setZoom(3);

        jxMapViewer.setPreferredSize(new Dimension(800, 550));
        JPanel panel2 = new JPanel();
        panel2.add(jxMapViewer);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);

        previousButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                HomePage homePage = new MainPage.HomePage();
                homePage.setVisible(true); // show the home page
                dispose();
            }
        });

       streetViewButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String message="No Street View of SIT found online";
                JOptionPane.showMessageDialog(null, message);
            }
        });
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\Java Project\\untitled\\src\\Images\\icon.png");
        setIconImage(icon);

        setTitle("SIT Map");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(1060, 600);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        Maps map1 = new Maps();
    }
}
