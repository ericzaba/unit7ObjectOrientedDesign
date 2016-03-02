import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Circle extends Shape
{ 
    
    private Point2D.Double center;
    private Color color;
    private double radius;
    
    public Circle (Point2D.Double center,
    double radius, Color color)
    {
        super(center, radius, color);
        
        this.color = Color.BLACK; 
    }
    
    public void draw(Graphics2D g)
    {
        g.draw(Ellipse2D(center), radius, radius);
    }
}
