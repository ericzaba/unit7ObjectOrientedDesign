import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Point2D;
public class Square extends Shape
{
    public Square (Point2D.Double center,
    double radius, Color color)
    {
        super(center, radius, color);
    }
    /**
     * Method draw
     *
     * @param filled    this determines whether the object (square) will paint with its borders filled in
     * @param g graphics object that isn't passed in by the user (like paintcomponent)
     */
    public void draw(Graphics2D g, boolean filled)
    {   
        g.fillRect(100, 100, 10, 10);
         if (filled == true)
        {
            
            g.fillRect((int)this.getX(), (int)this.getY(), (int)this.getRadius(), (int)this.getRadius());
        }
        if (filled == false)
        {
            g.drawRect((int)this.getX(), (int)this.getY(), (int)this.getRadius(), (int)this.getRadius());
        }
        
    }
    
    /**
     * Method isInside
     *
     * @param point a point2d containing 2 valid double values from the x/y coord value of the mouse
     * @return returns whether the current mouse location (double2d point ) is inside the circle / square object
     */
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
}
