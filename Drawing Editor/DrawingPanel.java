import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class DrawingPanel extends JPanel
{
    
    ArrayList<Circle> circles = new ArrayList<Circle>();
    ArrayList<Square> squares = new ArrayList<Square>();
    
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
        this.circles.add(new Circle());
    }

    public void addSquare()
    {
        this.squares.add(new Square());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    }

}
