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
    
    
    public ControlPanel()
    {

        this.panel = new JPanel();

        this.color = new JButton();
        this.color.setPreferredSize(new Dimension(40, 40));
        this.add(color);
        this.colorLabel = new JLabel("Pick Color");
        this.add(colorLabel);
        
        
        
        this.addCircle = new JButton();
        this.addCircle.setPreferredSize(new Dimension(40, 40));
        this.add(addCircle, BorderLayout.PAGE_END);
        this.circleLabel = new JLabel("Add Circle");
        this.add(circleLabel, BorderLayout.PAGE_END);
        
        
    }
    

}
