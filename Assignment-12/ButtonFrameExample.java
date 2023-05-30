import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrameExample {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("Button Frame");

        // Create three buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Set the positions and sizes of the buttons
        button1.setBounds(50, 50, 80, 30);
        button2.setBounds(50, 100, 80, 30);
        button3.setBounds(50, 150, 80, 30);

        // Add action listeners to the buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }
        });

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set the size of the frame
        frame.setSize(200, 250);

        // Set the layout to null
        frame.setLayout(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
