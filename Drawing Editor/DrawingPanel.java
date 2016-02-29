import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DrawingPanel extends JPanel
{

    ArrayList<Circle> circles;
    ArrayList<Square> squares;

    Color pickedColor = new Color(0,0,0);
    public DrawingPanel()
    {
        this.circles = new ArrayList<Circle>();
        this.squares = new ArrayList<Square>();
        
        
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
        
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0; i<circles.size(); i++)
        {
        
        }
        
        
        for (int i = 0; i< squares.size(); i++)
        {
            
        }
        
        super.paintComponent(g);
        g.drawString("test", 100, 100);

    }
    
    
}
