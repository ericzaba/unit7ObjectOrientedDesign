import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
public class DrawingPanel extends JPanel
{
    
    
    Color pickedColor = new Color(0,0,0);
    public DrawingPanel()
    {


    }
    public Color getColor()
    {
        return null;
    }

    public Dimension getPreferredSize()
    {
        return null;
    }

    public void pickColor()
    {

    }

    public void addCircle()
    {
    }

    public void addSquare()
    {
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
    }

}
