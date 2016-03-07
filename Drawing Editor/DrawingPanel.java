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

    private ArrayList<Shape> shapes;
    private Point2D.Double randomRadius;
    private Color pickedColor;
    private boolean pickedFill;
    private Random random = new Random();
    private Shape activeShape;
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

    /**
     * Method addCircle
     * adds a new circle object with shape inheritance to the list of shapes
     */
    public void addCircle()
    {
        this.shapes.add(new Circle(new Point2D.Double(random.nextInt(1000), random.nextInt(1000)), random.nextInt(300), Color.BLACK));
    }
    /**
     * Method addSquare
     * adds a new square object with shape inheritance to the list of shapes
     */
    public void addSquare()
    {

        this.shapes.add(new Square(new Point2D.Double(random.nextInt(1000), random.nextInt(1000)), random.nextInt(300), Color.BLACK));
    }
    /**
     * Method paintComponent
     *
     * @param g a graphics object that is not passed in by the user
     * 
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0; i<shapes.size(); i++)
        {

            this.shapes.get(i).draw(g2d, false);

        }

        g.drawLine(10, 10, 100, 100);
    }
    
    
   
    
    
    
    
    
    
    
    
    public boolean randomBoolean()
    {
        int booleanChoice = random.nextInt(1);
        switch (booleanChoice)
        {
            case 0: this.pickedFill = true;
            case 1: this.pickedFill = false;
        }
        return this.pickedFill;
    }
    
    /**
     * Method randomColor
     *  method by me to create a random color 
     */
    public void randomColor()
    {
        int colorChoice = this.random.nextInt(10);

        switch (colorChoice)
        {
            case 0: this.pickedColor = Color.BLACK;
            case 1: this.pickedColor = Color.GREEN;
            case 2: this.pickedColor = Color.BLUE;
            case 3: this.pickedColor = Color.RED;
            case 4: this.pickedColor = Color.lightGray;
            case 5: this.pickedColor = Color.ORANGE;
            case 6: this.pickedColor = Color.GRAY;
            case 7: this.pickedColor = Color.YELLOW;
            case 8: this.pickedColor = Color.CYAN;
            case 9: this.pickedColor = Color.MAGENTA;
            case 10: this.pickedColor = Color.darkGray;
        }
    }
}

