import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Circle extends Shape
{ 


    public Circle (Point2D.Double center,
    double radius, Color color)
    {
        super(center, radius, color);

    }
    public void draw(Graphics2D g, boolean filled)
    {
        g.draw(new Ellipse2D.Double(this.getCenter().getX(), this.getCenter().getY(), this.getRadius(), this.getRadius()));
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
