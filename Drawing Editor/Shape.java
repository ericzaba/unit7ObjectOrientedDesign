
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
        this.center = center;
        this.color = color;
    }
    Point2D.Double getCenter()
    {
        
        return this.center;
    }
    
    
    
    double getRadius()
    {
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

    abstract boolean isInside(Point2D.Double point);
    

    abstract void draw(Graphics2D g2, boolean filled);             
    
    

}
