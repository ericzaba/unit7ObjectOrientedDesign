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
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
}
