
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Point2D;

public abstract class Shape
{   
    
    private double radius;
    private boolean filled;
    private Color color;
    private Point2D.Double center;
    public Shape(Point2D.Double center,
    double radius, Color color)
    {
        this.radius = radius;
        
    }
    double getRadius()
    {
        this.radius = 1;
        return radius;
    }

    void move(double x, double y)
    {
        this.center = new Point2D.Double(x,y);
    }

    void setRadius(double r)
    {
        this.radius = r;
        
    }

    boolean isInside(Point2D.Double point)
    {
        return true;
    }

    void draw(Graphics2D g2, boolean filled)                
    {
        
    }
    

}
