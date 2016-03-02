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

    ArrayList<Shape> shapes;
    Point2D.Double randomRadius;
    Color pickedColor = new Color(0,0,0);
    Random random = new Random();
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        
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
        
        this.shapes.add(new Circle(new Point2D.Double(10,10), 60, Color.BLACK));
    }

    public void addSquare()
    {
        this.shapes.add(new Square(randomRadius, 10, Color.BLACK));
    }

    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0; i<shapes.size(); i++)
        {
            this.shapes.get(i).draw(g2d, true);
            
        }
        
        super.paintComponent(g);
        g.drawLine(10, 10, 100, 100);

    }
    public class ClickListener implements ActionListener
    {
        private String name;

        public void actionPerformed(ActionEvent event)
        {
            
            
        }

    }
    
}
