import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
public class ControlPanel extends JPanel
{

    private JPanel panel;
    private JButton color;
    private JButton addCircle;
    private JButton addSquare;
    private JLabel colorLabel;
    private JLabel circleLabel;
    private JLabel squareLabel;

    public ControlPanel()
    {

        this.panel = new JPanel();
        //Code for color picker
        this.color = new JButton();
        this.color.setPreferredSize(new Dimension(40, 40));
        this.add(color);
        this.colorLabel = new JLabel("Pick Color");
        this.add(colorLabel);

        //Code for Circle
        this.addCircle = new JButton();
        this.addCircle.setPreferredSize(new Dimension(40, 40));
        this.add(addCircle, BorderLayout.PAGE_END);
        this.circleLabel = new JLabel("Add Circle");
        this.add(circleLabel, BorderLayout.PAGE_END);
        this.addCircle.addActionListener(new addCircleListener());

        
        //Code for Square
        this.addSquare = new JButton();
        this.addSquare.setPreferredSize(new Dimension(40, 40));
        this.add(addSquare, BorderLayout.PAGE_END);
        this.squareLabel = new JLabel("Add Square");
        this.add(squareLabel, BorderLayout.PAGE_END);
        this.addSquare.addActionListener(new addSquareListener());
    }
    public class addSquareListener implements ActionListener
    {
        public addSquareListener()
        {
            addSquare.addActionListener(this);
        }

        public void actionPerformed(ActionEvent event)
        {
            DrawingPanel d = new DrawingPanel();
            d.addSquare();
        }
    }
    public class addCircleListener implements ActionListener
    {
        public addCircleListener()
        {
            addCircle.addActionListener(this);
            
        }

        public void actionPerformed(ActionEvent event)
        {
            DrawingPanel d = new DrawingPanel();
            d.addCircle();
            
        }
    }
    public class pickColorListener implements ActionListener
    {
        public pickColorListener()
        {
            color.addActionListener(this);

        }

        public void actionPerformed(ActionEvent event)
        {
            DrawingPanel d = new DrawingPanel();
            d.pickColor();
            

            
        }
    }
}
