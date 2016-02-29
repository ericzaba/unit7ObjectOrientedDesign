
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Point2D;

public abstract class Shape
{
    double getRadius()
    {
        return 1.0;
    }

    void move(double x, double y)
    {}

    void setRadius(double r)
    {}

    boolean isInside(Point2D.Double point)
    {
        return true;
    }

    boolean isOnBorder(Point2D.Double point)
    {
        return true;
    }   
    

}
