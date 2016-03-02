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
import java.util.Random;
import java.awt.geom.Point2D;
public class DrawingPanel extends JPanel
{

    ArrayList<Circle> circles;
    ArrayList<Square> squares;
    Point2D.Double randomRadius;
    Color pickedColor = new Color(0,0,0);
    Random random = new Random();
    public DrawingPanel()
    {
        this.circles = new ArrayList<Circle>();
        this.squares = new ArrayList<Square>();
        this.setBackground(Color.WHITE);
        
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
        randomRadius = random.nextDouble()*250.0;
        this.circles.add(new Circle(radius, 10, Color.BLACK));
    }

    public void addSquare()
    {
        this.squares.add(new Square(randomRadius, 10, Color.BLACK));
    }

    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0; i<circles.size(); i++)
        {
            circles.get(i).draw(randomRadius, 10, Color.BLACK);
        }
        
        
        for (int i = 0; i< squares.size(); i++)
        {
            squares.get(i).draw(randomRadius, 10, Color.BLACK);
        }
        
        super.paintComponent(g);
        g.drawLine(10, 10, 100, 100);

    }
    
    
}
