import javax.swing.JFrame;
public class DrawingEditor extends JFrame
{

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    public DrawingEditor()
    {
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Triangle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new DrawingEditor();
      
    }
}
