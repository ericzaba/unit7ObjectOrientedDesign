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
public class DrawingEditor extends JFrame
{

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    private JFrame frame;
    
    public DrawingEditor()
    {
        
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Drawing Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JFrame frame = new JFrame();
        ControlPanel control = new ControlPanel();
        frame.add(control);
        
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {   
        DrawingEditor drawingeditor = new DrawingEditor();

        
    }
}
