import java.awt.*;
import java.awt.event.*;

class Name implements ActionListener {

    Frame f = new Frame("");
    Label l1 = new Label("First Name");
    Label l2 = new Label("Last Name");
    Label l3 = new Label("Date of Birth");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b1 = new Button("Submit");
    Button b2 = new Button("Reset");

    Name(){

        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 150, 100, 20);
        l3.setBounds(50, 200, 100, 20);
        t1.setBounds(200, 100, 130, 20);
        t2.setBounds(200, 150, 130, 20);
        t3.setBounds(200, 200, 130, 20);
        b1.setBounds(30, 250, 150, 30);
        b2.setBounds(180, 250, 150, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 300);
    }

    public static void main(String[] args ) {
        new Name();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
