import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends Frame implements ActionListener {
    private Label label;
    private Button okButton, submitButton, cancelButton;
    private Label resultLabel;
    
    public ButtonFrame() {
        // create the label
        label = new Label("Control in Action: Button");
        label.setAlignment(Label.CENTER);
        
        // create the buttons
        okButton = new Button("OK");
        okButton.addActionListener(this);
        
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        
        cancelButton = new Button("Cancel");
        cancelButton.addActionListener(this);
        
        // create the result label
        resultLabel = new Label("");
        resultLabel.setAlignment(Label.CENTER);
        
        // add the components to the frame
        add(label, BorderLayout.NORTH);
        
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(okButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.CENTER);
        
        add(resultLabel, BorderLayout.SOUTH);
        
        // set the size and visibility of the frame
        setSize(400, 300);
        setVisible(true);
    }
    
    // handle button click events
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            resultLabel.setText("OK button clicked");
        } else if (e.getSource() == submitButton) {
            resultLabel.setText("Submit button clicked");
        } else if (e.getSource() == cancelButton) {
            resultLabel.setText("Cancel button clicked");
        }
    }
    
    public static void main(String[] args) {
        new ButtonFrame();
    }
}

