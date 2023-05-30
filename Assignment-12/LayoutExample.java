import java.awt.*;
//import java.awt.event.*;
import javax.swing.BoxLayout;

public class LayoutExample extends Frame {
    public LayoutExample() {
        super("Layout Example");

        // create components
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        // create a panel for the buttons using BorderLayout
        Panel borderPanel = new Panel(new BorderLayout());
        borderPanel.add(button1, BorderLayout.NORTH);
        borderPanel.add(button2, BorderLayout.SOUTH);
        borderPanel.add(button3, BorderLayout.EAST);
        borderPanel.add(button4, BorderLayout.WEST);
        borderPanel.add(button5, BorderLayout.CENTER);

        // create a panel for the buttons using GridLayout
        Panel gridPanel = new Panel(new GridLayout(2, 3));
        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);
        gridPanel.add(button5);

        // create a panel for the buttons using BoxLayout
        Panel boxPanel = new Panel();
        boxPanel.setLayout((LayoutManager) new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(button1);
        boxPanel.add(button2);
        boxPanel.add(button3);
        boxPanel.add(button4);
        boxPanel.add(button5);

        // add the panels to the frame
        add(borderPanel, BorderLayout.NORTH);
        add(gridPanel, BorderLayout.CENTER);
        add(boxPanel, BorderLayout.SOUTH);

        // set the size and visibility of the frame
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        LayoutExample frame = new LayoutExample();
    }
}
