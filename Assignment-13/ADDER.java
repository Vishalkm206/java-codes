import java.awt.*;
import java.awt.event.*;

class ADDER implements ActionListener {

    Frame f = new Frame("ADDER");
    Label l1 = new Label("");
    Label l2 = new Label("");
    Label l3 = new Label("");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b = new Button("Add");

    ADDER() {
        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 150, 100, 20);
        l3.setBounds(50, 200, 150, 20);
        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 150, 100, 20);
        //t3.setBounds(200, 200, 100, 20);
        b.setBounds(100, 250, 100, 30);

        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        //f.add(t3);
        f.add(b);
        
        b.addActionListener(this);
       
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 300);
    }

    public void actionPerformed(ActionEvent e) {
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());

        if (e.getSource() == b) {
            l3.setText("Their addition is = "+String.valueOf(i+j));
        }
            
    }

    public static void main(String[] args ) {
        new ADDER();
    }
}   