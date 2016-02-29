import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class DrawingEditor extends JFrame
{
    
    public DrawingEditor()
    {
        this.setSize(1000, 1000);
        this.setTitle("Drawing Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ControlPanel control = new ControlPanel();
        control.setSize(200, 200);
        
        DrawingPanel drawing = new DrawingPanel();
        drawing.setSize(10, 10);
        
        this.add(control, BorderLayout.PAGE_END);

        this.add(drawing);

        
        
        drawing.setVisible(true);
        control.setVisible(true);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {   
        DrawingEditor drawingeditor = new DrawingEditor();
    }
}
