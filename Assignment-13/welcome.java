import java.awt.*;
import java.awt.event.*;

public class welcome implements ActionListener {
    private Frame frame = new Frame("");
    private TextField t = new TextField();
    private Button b = new Button("Click Me!");
    
    public welcome() {
        b.setBounds(100, 250, 100, 30);
        t.setBounds(50, 50, 200, 30);;
        
        frame.add(b);
        frame.add(t);
        
        b.addActionListener(this);
        
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        // display the welcome message
        if(e.getSource() == b ){
            t.setText(String.format("Welcome"));
        }
    }
    
    public static void main(String[] args) {
        new welcome();
    }
}
