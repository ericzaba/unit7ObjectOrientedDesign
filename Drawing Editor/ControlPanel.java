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
public class ControlPanel extends JPanel
{

    private JPanel panel;
    private JButton button;
    private JLabel label;
    
    public ControlPanel()
    {

        this.panel = new JPanel();

        
        this.button = new JButton();
        this.button.setPreferredSize(new Dimension(40, 40));
        this.add(button);
        this.label = new JLabel("Sample Text");
        this.add(label);
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener);

    }
    public class ClickListener implements ActionListener
    {
        private String name;

        public void actionPerformed(ActionEvent event)
        {
            System.out.println("button" + event.getActionCommand() + "was clicked");
        }

    }

}
