
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TriangleFrame 
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    private JPanel panel;
    private JFrame frame;
    private Graphics2D g;
    private Rectangle box;
    public TriangleFrame()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);

    }
    public class ClickListener implements ActionListener
    {
        private String name;

        public void actionPerformed(ActionEvent event)
        {
            System.out.println("button" + event.getActionCommand() + "was clicked");
        }

    }
    Graphics2D g2 = (Graphics2D)g;

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
        g2.drawLine(10, 10, 5, 5);

    }
    
    public class TriangleViewer
    {
        public static void main(String[] args)
        {
            JFrame frame = new RectangleFrame();
            
            frame.setVisible(true);
        }

    }
}







