import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample extends Frame implements ItemListener {
    private Label messageLabel;
    private CheckboxGroup checkboxGroup;

    public RadioButtonExample() {
        super("Radio Button Example");

        // create the checkbox group
        checkboxGroup = new CheckboxGroup();

        // create the radio buttons
        Checkbox radio1 = new Checkbox("Message 1", checkboxGroup, true);
        Checkbox radio2 = new Checkbox("Message 2", checkboxGroup, false);
        Checkbox radio3 = new Checkbox("Message 3", checkboxGroup, false);

        // add item listeners to the radio buttons
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        radio3.addItemListener(this);

        // create the message label
        messageLabel = new Label("Message 1");

        // add the radio buttons and message label to the frame
        add(radio1);
        add(radio2);
        add(radio3);
        add(messageLabel);

        // set the layout and size of the frame
        setLayout(new FlowLayout());
        setSize(300, 150);
    }

    // event handler for item events on the radio buttons
    public void itemStateChanged(ItemEvent e) {
        Checkbox selected = checkboxGroup.getSelectedCheckbox();
        messageLabel.setText(selected.getLabel());
    }

    public static void main(String[] args) {
        RadioButtonExample frame = new RadioButtonExample();
        frame.setVisible(true);
    }
}
